package Database;

import java.sql.*;

public class Database {

    private Connection connection;

    public void createNewDatabase(){
        String url = "jdbc:sqlite:/Users/jeffreyabraham/IdeaProjects/TCP Group Chat/src/Database/sqlite/db/message.sqlite";

        try{
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(url);
            if(connection != null){
                DatabaseMetaData meta = connection.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
        }catch (SQLException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public void createSchema(){
        try{
            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE MESSAGES " +
                    " (id INTEGER PRIMARY KEY," +
                    " username TEXT NOT NULL, " +
                    " timestamp DATETIME DEFAULT CURRENT_TIMESTAMP, " +
                    " content TEXT )";
            statement.executeUpdate(sql);
            System.out.println("Created messages table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
