package DBHelper;
import java.sql.*;

public class ConnectionDB {
    public Connection Connection(){
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/customerDb",
             "postgres", "123");
        } catch (Exception e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Connect database successfully");
        
        return conn;
    }
}
