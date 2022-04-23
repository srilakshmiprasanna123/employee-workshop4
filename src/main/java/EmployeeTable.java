import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;


public class EmployeeTable {
    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:YourDatabase";
    private static final String DB_USER = "user";
    private static final String DB_PASSWORD = "password";
    public static void main(String[] args) {
        System.out.println("welcome to the workshop 4");
        String dbURL = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "lucky@123";

        try {

            java.sql.Connection conn = DriverManager.getConnection(dbURL, username, password);

            if (conn != null) {
                System.out.println("Connected");

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}







