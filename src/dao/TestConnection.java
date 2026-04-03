package dao;
import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        try {
            System.out.println("Testing database connection...");
            Connection con = connectionprovider.getcon();
            if (con != null) {
                System.out.println("SUCCESS! Database connection works!");
                System.out.println("Connected to: jdbc:mysql://localhost:3306/pharmacy");
                con.close();
            } else {
                System.out.println("FAILED! Connection is null");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
