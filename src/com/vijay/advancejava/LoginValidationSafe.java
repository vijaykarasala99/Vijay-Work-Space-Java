package com.vijay.advancejava;
import java.sql.*;

public class LoginValidationSafe {

    public static void main(String[] args) throws Exception {
        // 1. Load Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. Connect to DB
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb", "root", "root");

        // 3. Input (can later take from user)
        String username = "admin";
        String password = "admin123";

        // 4. Prepare SQL with ?
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";

        // 5. Use PreparedStatement
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, username);
        ps.setString(2, password);

        // 6. Execute
        ResultSet rs = ps.executeQuery();

        // 7. Check
        if (rs.next()) {
            System.out.println("✅ Login Successful!");
        } else {
            System.out.println("❌ Invalid Credentials.");
        }
        // 8. Close
        rs.close();
        ps.close();
        con.close();
    }
}
