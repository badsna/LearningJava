package Week2.Day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Task implements Runnable{
    BufferedReader bufferedReader;
    ArrayList<FlightInfo> arrayList;
    String csvSeperator;

    public Task(BufferedReader bufferedReader, ArrayList<FlightInfo> arrayList, String csvSeperator) {
        this.bufferedReader = bufferedReader;
        this.arrayList = arrayList;
        this.csvSeperator = csvSeperator;
    }

    public void run() throws NullPointerException{
        System.out.println(Thread.currentThread().getName());
        try {
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

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

