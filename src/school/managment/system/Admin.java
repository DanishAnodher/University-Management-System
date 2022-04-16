package school.managment.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Admin {
    public static void createAccount(String username, String password) {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "INSERT INTO account(type, username, password, created_on) VALUES(?, ?, ?, NOW())";
            ps = conn.prepareStatement(query);
            ps.setString(1, "A");
            ps.setString(2, username);
            ps.setString(3, password);
            ps.execute();
            System.out.println("[INFO] Account Created Successfully!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void deleteAccount(String username, String password) {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "DELETE FROM account WHERE username = ? AND password = ? AND type = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, "A");
            ps.execute();
            System.out.println("[INFO] Account Deleted Successfully!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static boolean isValid(String username, String password) {
        boolean found = false;
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT username, password FROM account WHERE username = ? AND password = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                found = true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return found;
    }

    public static void showAllAccounts() {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM account";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String _type = rs.getString(1);
                String _username = rs.getString(2);
                String _password = rs.getString(3);
                String _email = rs.getString(4);
                String _created = rs.getString(5);
                System.out.println("Type          | "+_type);
                System.out.println("Username      | "+_username);
                System.out.println("Password      | "+_password);
                System.out.println("Email         | "+_email);
                System.out.println("Created On    | "+_created);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
