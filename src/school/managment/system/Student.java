package school.managment.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Student {

    String name;
    String fName;
    String caste;
    String cnic;
    String dob;
    String doa;
    String gender;
    String address;
    String religion;
    String classs;
    String section;
    int gr;

    Student(String studentName, int grNo) {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM student WHERE name = ? AND grNo = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, studentName);
            ps.setInt(2, grNo);
            rs = ps.executeQuery();
            while (rs.next()) {
                name = rs.getString(1);
                fName = rs.getString(2);
                caste = rs.getString(3);
                cnic = rs.getString(4);
                dob = rs.getString(5);
                doa = rs.getString(6);
                gender = rs.getString(7);
                address = rs.getString(8);
                religion = rs.getString(9);
                classs = rs.getString(10);
                section = rs.getString(11);
                gr = rs.getInt(12);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void addStudent(String name, String fName, String caste, String cnic, String dob, String doa, String gender, String address, String religion, String classs, String section, int grNo) {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "INSERT INTO student VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
            ps.setString(10, classs);
            ps.setString(11, section);
            ps.setInt(12, grNo);
            ps.execute();
            System.out.println("[INFO] Student Info Added Successfully!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static boolean isValid(String name, String grNo) {
        boolean found = false;
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT name, grNo FROM student WHERE name = ? AND grNo = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, Integer.parseInt(grNo));
            rs = ps.executeQuery();
            while (rs.next()) {
                found = true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return found;
    }

    public static void addResult(String name, String fName, String classs, int section, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, int m1, int m2, int m3, int m4, int m5, int m6, int m7, int m8) {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "INSERT INTO result VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, fName);
            ps.setString(3, classs);
            ps.setInt(4, section);
            ps.setString(5, s1);
            ps.setString(6, s2);
            ps.setString(7, s3);
            ps.setString(8, s4);
            ps.setString(9, s5);
            ps.setString(10, s6);
            ps.setString(11, s7);
            ps.setString(12, s8);

            ps.setInt(13, m1);
            ps.setInt(14, m2);
            ps.setInt(15, m3);
            ps.setInt(16, m4);
            ps.setInt(17, m5);
            ps.setInt(18, m6);
            ps.setInt(19, m7);
            ps.setInt(20, m8);
            ps.execute();
            System.out.println("[INFO] Result Added Successfully!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static ArrayList<String> getResult(String n, String fn, String c, int s) {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        ResultSet rs;
        ArrayList<String> data = new ArrayList<String>();
        try {
            String query = "SELECT * FROM result WHERE name = ? AND fName = ? AND class = ? AND section = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, n);
            ps.setString(2, fn);
            ps.setString(3, c);
            ps.setInt(4, s);
            rs = ps.executeQuery();

            while(rs.next()) {
                data.add(rs.getString(1));
                data.add(rs.getString(2));
                data.add(rs.getString(3));
                data.add(String.valueOf(rs.getInt(4)));
                data.add(rs.getString(5));
                data.add(rs.getString(6));
                data.add(rs.getString(7));
                data.add(rs.getString(8));
                data.add(rs.getString(9));
                data.add(rs.getString(10));
                data.add(rs.getString(11));
                data.add(rs.getString(12));
                data.add(String.valueOf(rs.getInt(13)));
                data.add(String.valueOf(rs.getInt(14)));
                data.add(String.valueOf(rs.getInt(15)));
                data.add(String.valueOf(rs.getInt(16)));
                data.add(String.valueOf(rs.getInt(17)));
                data.add(String.valueOf(rs.getInt(18)));
                data.add(String.valueOf(rs.getInt(19)));
                data.add(String.valueOf(rs.getInt(20)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }
}
