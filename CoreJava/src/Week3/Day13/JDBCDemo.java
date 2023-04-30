package Week3.Day13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
//        Class.forName("com.postgres.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/csvData","postgres","By@$hna%");
        Statement smt=con.createStatement();

        //to create a table named FLightInfo
       //smt.executeUpdate("CREATE table FlightInfo(flight_id varchar(50),curr_altitude_fit int,destination_airport_code varchar(50), dept_time varchar(50), curr_location varchar(50)) ");

        //to read the file and store data in the database
        String csvSeperator=",";
        int value=0;
        String data;
        BufferedReader bufferedReader=new BufferedReader(new FileReader("F:\\Intern\\leran\\Mock_Flight_data1.csv"));

        while ((data=bufferedReader.readLine())!=null){
            if(value>=1){
                String[] row=data.split(csvSeperator);
                PreparedStatement stmt= con.prepareStatement("Insert INTO FlightInfo values (?,?,?,?,?)");
                stmt.setString(1,row[0]);
                stmt.setInt(2, Integer.parseInt(row[1].isEmpty() ? String.valueOf(0) : row[1]));
                stmt.setString(3,row[2]);
                stmt.setString(4,row[3]);
                stmt.setString(5,row[4]);

                stmt.executeUpdate();
            }
            value++;
        }

//        PreparedStatement stmt=con.prepareStatement("SELECT * from FlightInfo");
//        ResultSet rs= stmt.executeQuery();
//        while (rs.next()){
//            System.out.println(rs.getString(1) + " "+ rs.getInt(2)+ " "+ rs.getString(3)+ " "+ rs.getString(4)+" "+rs.getString(5));
//        }


        //to update the data
//        PreparedStatement stmt= con.prepareStatement("UPDATE FlightInfo set curr_altitude_fit=? where flight_id=? ");
//        stmt.setInt(1,500);
//        stmt.setString(2,"01GWK9T2HTNYXP4ZQ4ZFM0HE1Q");
//        stmt.executeUpdate();

//        PreparedStatement stmt= con.prepareStatement("DELETE from FlightInfo where curr_altitude_fit=?");
//        stmt.setInt(1,500);
//        stmt.executeUpdate();

        con.close();

    }
}
