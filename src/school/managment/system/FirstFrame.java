package school.managment.system;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstFrame extends JFrame implements ActionListener{
    //global variables
    JButton teacher;
    JButton admin;
    JButton close;
    
    FirstFrame(){
        //ImageIcon
        ImageIcon backgroundImage = new ImageIcon("Back.JPG");
        ImageIcon adminImage = new ImageIcon("Admin.PNG");
        ImageIcon teacherImage = new ImageIcon("Teacher.PNG");
        ImageIcon exitImage = new ImageIcon("Exit.PNG");
        
        //Background Image
        JLabel BImage = new JLabel();
        BImage.setIcon(backgroundImage);
        BImage.setBounds(0, 0, 1350, 700);
        
        
        //admin
        admin = new JButton("Admin");
        admin.setIcon(adminImage);
        admin.addActionListener(this);
        admin.setBackground(null);
        admin.setOpaque(false);
        admin.setBorderPainted(false);
        admin.setToolTipText("Admin");
        admin.setFocusable(false);
        admin.setBounds(530,220,250,250);
        
        //teacher
        teacher = new JButton();
        teacher.setIcon(teacherImage);
        teacher.setBackground(null);
        teacher.setOpaque(false);
        teacher.setBorderPainted(false);
        teacher.setToolTipText("Teacher");
        teacher.addActionListener(this);
        teacher.setFocusable(false);
        teacher.setBounds(150,220,250,250);
        
        //close
        close = new JButton();
        close.setIcon(exitImage);
        close.setBackground(null);
        close.setOpaque(false);
        close.setBorderPainted(false);
        close.setToolTipText("EXIT");
        close.addActionListener(this);
        close.setFocusable(false);
        close.setBounds(920,220,250,250);


        //frame
        this.setTitle(School.getName());
        this.setSize(1350,700);
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        //adding
        this.add(admin);
        this.add(teacher);
        this.add(close);
        this.add(BImage);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==teacher){
            new TeacherData();
            this.setVisible(false);
        }
        if(e.getSource() == admin){
            new LoginFrame();
            this.setVisible(false);
        }
        if(e.getSource()==close){
            System.exit(0);
        }
    }
}