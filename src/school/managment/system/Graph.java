package school.managment.system;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Graph {

    ArrayList<String> teachers;
    int[] attendance;
    int counter = 0;

    Graph() {
        teachers = Database.getTeachers();
        attendance = new int[teachers.size()];
        for (String name : teachers) {
            attendance[counter++] = Database.getAttendance(name);
        }
        counter = 0;

        System.out.println(attendance.toString());

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (String name : teachers) {
            dataset.setValue(attendance[counter++], "Attendance", name);
        }
        counter = 0;

        JFreeChart chart = ChartFactory.createBarChart("Student Score", "Marks", "Student", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot cp = chart.getCategoryPlot();
        cp.setDomainGridlinePaint(Color.BLACK);
        ChartFrame frame =  new ChartFrame("School",chart);
        frame.setSize(1350,700);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }
}
