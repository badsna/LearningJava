package Week2.Day9;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WritingCSVFile {
    public static void main(String[] args) {
        int value=0;
        int rowToModify=4;
        String data;
        String csvSeperator=",";
        ArrayList<List<String>> arrayList=new ArrayList<>();
        try{
            FileReader fileReader=new FileReader("F:\\Intern\\leran\\Mock_Flight_data.csv");
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            FileWriter fileWriter=new FileWriter("F:\\Intern\\leran\\Mock_Flight_data1.csv");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

            while ((data=bufferedReader.readLine())!=null){
                    List<String> row= Arrays.asList( data.split(csvSeperator, -1));
                    if(row.size()==5){
                        if(row.get(4).isEmpty()){
                            row.set(4, "N/A");
                        }
                    }
                    arrayList.add(row);

            }
            fileReader.close();
            bufferedReader.close();
            for(List<String> array:arrayList){
                bufferedWriter.write(String.join(",",array)+"\n");
            }
            bufferedWriter.flush();
            bufferedWriter.close();

        }catch(IOException e){
            System.out.println(e);
        }

    }
}
