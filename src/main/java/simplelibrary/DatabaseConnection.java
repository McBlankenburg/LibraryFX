package simplelibrary;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public Connection databaseLink;

    public Connection getConnection(){

        /*database data to connect with MySQL server hosted on VPS
        if you wanna change it you must create new account on MySQL server*/

        String databaseName = "library";
        String databaseUser = "user";
        String databasePassword = "abcd";

        String url = "jdbc:mysql://80.211.240.167:3306/"+databaseName+"?autoReconnect=true&useSSL=false";
        //added ?autoReconnect=true&useSSL=false to suppress warning in the console


        System.out.println ("Database connection established");

        try{
            //driver
            Class.forName("com.mysql.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);


        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }

        return databaseLink;
    }
}
