package school.managment.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Teacher {

    String name;
    String fName;
    String caste;
    String cnic;
    String dob;
    String doh;
    String gen;
    String address;
    String religion;
    String city;
    int classs;
    String no;

    Teacher(String teacherName, String fatherName) {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM teacher WHERE name = ? AND fName = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, teacherName);
            ps.setString(2, fatherName);
            rs = ps.executeQuery();
            while (rs.next()) {
                name = rs.getString(1);
                fName = rs.getString(2);
                caste = rs.getString(3);
                cnic = rs.getString(4);
                dob = rs.getString(5);
                doh = rs.getString(6);
                gen = rs.getString(7);
                address = rs.getString(8);
                religion = rs.getString(9);
                city = rs.getString(10);
                classs = rs.getInt(11);
                no = rs.getString(12);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void addTeacher(String name, String fName, String caste, String cnic, String dob, String doa, String gender, String address, String religion, String city, int classs, String no) {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "INSERT INTO teacher VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, fName);
            ps.setString(3, caste);
            ps.setString(4, cnic);
            ps.setString(5, dob);
            ps.setString(6, doa);
            ps.setString(7, gender);
            ps.setString(8, address);
            ps.setString(9, religion);
            ps.setString(10, city);
            ps.setInt(11, classs);
            ps.setString(12, no);
            ps.execute();
            System.out.println("[INFO] Teacher Info Added Successfully!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

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

    public static boolean isValid(String name, String fName) {
        boolean found = false;
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT name, fName FROM teacher WHERE name = ? AND fName = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, fName);
            rs = ps.executeQuery();
            while (rs.next()) {
                found = true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return found;
    }
}
