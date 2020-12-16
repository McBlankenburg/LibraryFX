package simplelibrary;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public Connection databaseLink;

    public Connection getConnection(){

        String databaseName = "";
        String databaseUser = "";
        String databasePassword = "";
        String url = "jdbc:mysql://localhost/" + databaseName;

        System.out.println ("Database connection established");

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }

        return databaseLink;
    }
}
