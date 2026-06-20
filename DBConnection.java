import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

  

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Database Connected Successfully!");
            conn.close();
        } catch (Exception e) {
            System.out.println("❌ Connection Failed: " + e.getMessage());
        }
    }
}
