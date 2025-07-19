import java.sql.*;

public class DBConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bank_schema"; // your DB name
        String username = "pranay";
        String password = "pushpaingle7979"; // replace this with your real password

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection to database successful!");

            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}
