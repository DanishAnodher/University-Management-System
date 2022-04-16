package school.managment.system;

import java.sql.*;
import java.util.ArrayList;

public class Database {
    public static Connection connect() {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "toor";

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("[INFO] Connected!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static boolean tableExists(String tableName) {
        Connection conn = Database.connect();
        PreparedStatement ps;
        ResultSet rs;
        boolean found = false;
        try {
            String query = "SHOW TABLES";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                if (tableName.equals(rs.getString(1))) {
                    found = true;
                }
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return found;
    }

    public static void showAllTables() {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SHOW TABLES";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void createTableSchool() {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "CREATE TABLE school(name VARCHAR(30), principal VARCHAR(24), classes SMALLINT, area VARCHAR(24), id VARCHAR(24), registerNo VARCHAR(24), postalCode SMALLINT, doe VARCHAR(24), address VARCHAR(30), country VARCHAR(24), province VARCHAR(24), district VARCHAR(24))";
            ps = conn.prepareStatement(query);
            ps.execute();
            System.out.println("Table Created Successfully!");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void createTableStudent() {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "CREATE TABLE student(name VARCHAR(30), fName VARCHAR(24), caste VARCHAR(24), cnic VARCHAR(20), dob VARCHAR(24), doa VARCHAR(24), gender VARCHAR(1), address VARCHAR(30), religion VARCHAR(24), class VARCHAR(10), section VARCHAR(15), grNo INT)";
            ps = conn.prepareStatement(query);
            ps.execute();
            System.out.println("Table Created Successfully!");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void createTableResult() {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "CREATE TABLE result(name VARCHAR(24), fName VARCHAR(24), class VARCHAR(10), section SMALLINT,s1 VARCHAR(24),s2 VARCHAR(24),s3 VARCHAR(24),s4 VARCHAR(24),s5 VARCHAR(24),s6 VARCHAR(24),s7 VARCHAR(24),s8 VARCHAR(24), m1 SMALLINT, m2 SMALLINT, m3 SMALLINT, m4 SMALLINT, m5 SMALLINT, m6 SMALLINT, m7 SMALLINT, m8 SMALLINT)";
            ps = conn.prepareStatement(query);
            ps.execute();
            System.out.println("Table Created Successfully!");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void createTableAccount() {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "CREATE TABLE account(type ENUM(?, ?), username VARCHAR(24), password VARCHAR(24), email VARCHAR(24), created_on DATETIME)";
            ps = conn.prepareStatement(query);
            ps.setString(1, "A");
            ps.setString(2, "T");
            ps.execute();
            System.out.println("Table Created Successfully!");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void createTableTeacher() {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "CREATE TABLE teacher(name VARCHAR(24), fName VARCHAR(24), caste VARCHAR(24), cnic VARCHAR(20), dob VARCHAR(24), doh VARCHAR(24), gender VARCHAR(1), address VARCHAR(30), religion VARCHAR(24), city VARCHAR(24), class SMALLINT, number VARCHAR(15))";
            ps = conn.prepareStatement(query);
            ps.execute();
            System.out.println("Table Created Successfully!");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void createTableAttendance() {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "CREATE TABLE attendance(name VARCHAR(24), date DATE)";
            ps = conn.prepareStatement(query);
            ps.execute();
            System.out.println("Table Created Successfully!");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void deleteTableSchool() {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "DROP TABLE school";
            ps = conn.prepareStatement(query);
            ps.execute();
            System.out.println("Table Deleted Successfully!");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void deleteTableResult() {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "DROP TABLE result";
            ps = conn.prepareStatement(query);
            ps.execute();
            System.out.println("Table Deleted Successfully!");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void deleteTableStudent() {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "DROP TABLE student";
            ps = conn.prepareStatement(query);
            ps.execute();
            System.out.println("Table Deleted Successfully!");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void deleteTableTeacher() {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "DROP TABLE teacher";
            ps = conn.prepareStatement(query);
            ps.execute();
            System.out.println("Table Deleted Successfully!");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void deleteTableAccount() {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "DROP TABLE account";
            ps = conn.prepareStatement(query);
            ps.execute();
            System.out.println("Table Deleted Successfully!");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void addAttendance(String name, java.sql.Date date) {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "INSERT INTO attendance VALUES(?, ?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setDate(2, date);
            ps.execute();
            System.out.println("Attendance Added Successfully!");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static int getAttendance(String name) {
        int counter = 0;
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "SELECT name FROM attendance WHERE name = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            System.out.println("Attendance Retrieved Successfully!");

            while (rs.next()) {
                ++counter;
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("getAttendance"+e);
        }
        return counter;
    }

    public static ArrayList<String> getTeachers() {
        ArrayList<String> teachers = new ArrayList<>();
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "SELECT name FROM teacher";
            ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            System.out.println("Attendance Retrieved Successfully!");

            while (rs.next()) {
                teachers.add(rs.getString("name"));
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("getTeachers"+e);
        }
        return teachers;
    }
}
