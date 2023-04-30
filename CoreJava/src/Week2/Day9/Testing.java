package Week2.Day9;

import com.sun.source.util.TaskEvent;

import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static Week2.Day9.Testing.readingFile;


public class Testing{
    //For reading CSV File
    static void readingFile(BufferedReader bufferedReader, ArrayList<FlightInfo> arrayList, String csvSeperator) throws IOException {
        String data;
        int value = 0;
        //read the file until file becomes empty
        while ((data = bufferedReader.readLine()) != null) {
            //to read the value of  file from row 2
            if (value >= 1) {
                //Storing name of column in row array
                String[] row = data.split(csvSeperator);
                //storing the value to different variable as per index
                String flight_id = row[0];
                //if row[1] is empty, assign 0 to it,else return value of row[1]
                int curr_altitude_fit = Integer.parseInt(row[1].isEmpty() ? String.valueOf(0) : row[1]);
                String destination_airport_code = row[2];
                String dept_time = row[3];
                String curr_location = row[4];
                //storing values to FlightInfo object
                FlightInfo flightInfo = new FlightInfo(flight_id, curr_altitude_fit, destination_airport_code, dept_time, curr_location);
                //adding  filghtInfo object in arrayList
                arrayList.add(flightInfo);
            }
            value++;
        }

    }

    //For inserting object into hashmap
    static int insertingIntoHashMap(ArrayList<FlightInfo> arrayList,HashMap<String, HashMap<String, FlightInfo>> hashMap){
        for (FlightInfo flight : arrayList) {
            //assigns the value getDestination_airport_code if it is in the hash else creates new hashmap
            HashMap<String, FlightInfo> hashMap2 = hashMap.getOrDefault(flight.getDestination_airport_code(), new HashMap<>());
            //making Dept_time as key in innerhash to remove duplicate and flight as value
            hashMap2.put(flight.getDept_time(), flight);

            //making destination_airport_code as key and innerhash as value for main hash
            hashMap.put(flight.destination_airport_code, hashMap2);
        }
        //returning the size of hashmap
        //i.e return how many values are there for the unique destination_airport_code(which is a key)
        return hashMap.size();

    }

    //for returning hashmap after sorting the data on the basis ofCurr_altitude_fit
    static HashMap<String,ArrayList<FlightInfo >>  printing (HashMap<String, HashMap<String, FlightInfo>> hashMap){

        HashMap<String,ArrayList<FlightInfo >> result=new HashMap<>();
        //iterating main hashmap
        for (Map.Entry<String, HashMap<String, FlightInfo>> f : hashMap.entrySet()) {
            //assiging value of main hashMap as key,value pair for inner hash
            HashMap<String, FlightInfo> f2 = f.getValue();
            //creating new object arraylist of flightinfo type having value of innerhash map
            ArrayList<FlightInfo> arrayList1 = new ArrayList<>(f2.values());
            //sorting the arraylist
            arrayList1.sort(new Curr_altitude_fit());

            //printing the key and size of value of main hash
            System.out.println(f.getKey() + " :" + f.getValue().size());

            //printing the key and value of main hash
            //System.out.println(f.getKey()+ " : " +arrayList1);

            //putting main hash's key and sorted arraylist as key,value pair in new hashmap
            result.put(f.getKey(),arrayList1);
        }
        //returing the newly created hashmap
        return result;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        //assign the current value of the system timer
        long a=System.nanoTime();
        String csvSeperator = ",";

        //arraylist of FlightInfo type to add  filghtInfo object in arrayList done in method 1
        ArrayList<FlightInfo> arrayList = new ArrayList<>();

        //store destination code as key, innerhash as value
        //innerhash has dept_time as key and FlightInfo asa value
        HashMap<String, HashMap<String, FlightInfo>> hashMap = new HashMap<>();

        //For reading file
        FileReader fileReader = new FileReader("F:\\Intern\\leran\\Mock_Flight_data1.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //calling readingFile method
        /*
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        long startTime=System.nanoTime();
        for (int i=0;i<10;i++){
            Runnable worker=new Task(bufferedReader, arrayList, csvSeperator);
            executorService.execute(worker);
        }
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        long endTime=System.nanoTime();
        System.out.println(endTime-startTime);

         */
  readingFile(bufferedReader, arrayList, csvSeperator);
        fileReader.close();

        //printiing no of file that can be created on the basis of different destination_code
        //insertingIntoHashMap( arrayList,hashMap) returns the size of hash i.e no of different key in hash
        System.out.println("Total files " +insertingIntoHashMap( arrayList,hashMap) );

        //calling printing method
        //here this method doesn't return anything
//        printing(hashMap);


        //assigning hashmap returned from printing method to new hashmap
        HashMap<String, ArrayList<FlightInfo>> str=printing(hashMap);

        //iterating hashmap on the basis of str key,value pair
        for(Map.Entry<String, ArrayList<FlightInfo>> st1:str.entrySet()){
            //to create new file on the basis of keys in returned hash map
            FileWriter fileWriter = new FileWriter("F:\\Intern\\leran\\FlightData\\" +st1.getKey() + ".csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            //to write heading in each file
            bufferedWriter.write("flight_id"+","+"curr_altitude_fit"+","+"destination_airport_code"+","+"dept_time"+","+"curr_location");
            //to write value to created csv file corresponding to the key of returned hashmap
            for (FlightInfo array : st1.getValue()) {
                bufferedWriter.write("\n"+ array.getFlight_id() +","
                                        +array.getCurr_altitude_fit() + ","
                                        +array.getDestination_airport_code()+","
                                        +array.getDept_time()+ ","
                                        +array.getCurr_location()
                );


            }
            bufferedWriter.flush();
            bufferedWriter.close();
        }

long b=System.nanoTime();
        System.out.println(b-a);



    }
}

