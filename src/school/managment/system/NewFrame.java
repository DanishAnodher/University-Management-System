package school.managment.system;

import javax.swing.*;
import java.awt.*;

public class NewFrame extends JFrame {
    NewFrame(){
        Graph g = new Graph();

        JButton b = new JButton();
        //frame
        this.setTitle(School.getName());
        this.setSize(1350,700);
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(b);
    }

    public static void main(String[] args) {
        new NewFrame();
    }
}
