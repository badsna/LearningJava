//package Week2.Day9;
//
//import java.io.*;
//import java.util.*;
//
//public class ReadingCSVFile {
//
//    public static void main(String[] args) throws IOException {
//        int value = 0;
//        String data;
//        String csvSeperator = ",";
//        ArrayList<FlightInfo> arrayList = new ArrayList<>();
//        HashMap<String, HashMap<String, FlightInfo>> hashMap = new HashMap<>();
//
//        FileReader fileReader = new FileReader("F:\\Intern\\leran\\Mock_Flight_data1.csv");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        while ((data = bufferedReader.readLine()) != null) {
//            if (value >= 1) {
//                String[] row = data.split(csvSeperator);
//                String flight_id = row[0];
//                int curr_altitude_fit = Integer.parseInt(row[1].isEmpty() ? String.valueOf(0) : row[1]);
//                String destination_airport_code = row[2];
//                String dept_time = row[3];
//                String curr_location = row[4];
//                FlightInfo flightInfo = new FlightInfo(flight_id, curr_altitude_fit, destination_airport_code, dept_time, curr_location);
//                arrayList.add(flightInfo);
//            }
//            value++;
//        }
//        fileReader.close();
//
//        for (FlightInfo flight : arrayList) {
//            HashMap<String, FlightInfo> hashMap2 = hashMap.getOrDefault(flight.getDestination_airport_code(), new HashMap<>());
//            hashMap2.put(flight.getDept_time(), flight);
//            hashMap.put(flight.destination_airport_code, hashMap2);
//    System.out.println("Total files " + hashMap.size());      }
//
//        for (Map.Entry<String, HashMap<String, FlightInfo>> f : hashMap.entrySet()) {
//            HashMap<String, FlightInfo> f2 = f.getValue();
//
//            ArrayList<FlightInfo> arrayList1 = new ArrayList<>(f2.values());
//            arrayList1.sort(new Curr_altitude_fit());
//            System.out.println(f.getKey() + " :" + f.getValue().size());
////            System.out.println(f.getKey()+ " : " +arrayList1);
//            String str = f.getKey();
//            try {
//                FileWriter fileWriter = new FileWriter("F:\\Intern\\leran\\FlightData\\" + str + ".csv");
//                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//                bufferedWriter.write(String.valueOf(arrayList1));
//                for (FlightInfo array : arrayList1) {
//                    bufferedWriter.write(String.join(",", String.valueOf(array)) + "\n");
//
//                }
//                bufferedWriter.flush();
//                bufferedWriter.close();
//            }
//            catch (IOException e){
//                System.out.println(e);
//            }
//
//
//        }
//
//    }
//}
