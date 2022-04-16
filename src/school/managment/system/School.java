package school.managment.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class School {
    public static void addSchoolInfo(String name, String principal, int classes, String area, String id, String registerNo, int postalCode, String doe, String address, String country, String province, String district) {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        try {
            String query = "INSERT INTO school VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, principal);
            ps.setInt(3, classes);
            ps.setString(4, area);
            ps.setString(5, id);
            ps.setString(6, registerNo);
            ps.setInt(7, postalCode);
            ps.setString(8, doe);
            ps.setString(9, address);
            ps.setString(10, country);
            ps.setString(11, province);
            ps.setString(12, district);
            ps.execute();
            System.out.println("[INFO] School Info Added Successfully!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static String getName() {
        Connection conn = Database.connect();
        PreparedStatement ps = null;
        ResultSet rs;
        String name = "";
        try {
            String query = "SELECT name FROM school";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            name = rs.getString(1);

            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return name;
    }
}
