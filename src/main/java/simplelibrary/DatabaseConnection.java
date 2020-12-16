package simplelibrary;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public Connection databaseLink;

    public Connection getConnection(){

        String databaseName = "library";
        String databaseUser = "user";
        String databasePassword = "abcd";
        String url = "jdbc:mysql://80.211.240.167:3306/library";

        System.out.println ("Database connection established");
        try{
            Class.forName("com.mysql.jdbc.Driver");

            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);


        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }

        return databaseLink;
    }
}
