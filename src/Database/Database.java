package Database;

import java.sql.*;

public class Database {

    public void createNewDatabase(String fileName){
        String url = "jdbc:sqlite:/Users/jeffreyabraham/IdeaProjects/TCP Group Chat/src/Database/sqlite/db/message.sqlite";

        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection(url);
            if(conn != null){
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
        }catch (SQLException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
