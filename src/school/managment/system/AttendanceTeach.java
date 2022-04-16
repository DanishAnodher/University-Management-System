package school.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class AttendanceTeach implements ActionListener{
    
//******Text And Password Fields For Admin Data*******
    static JTextField name = new JTextField();
    static JTextField gr = new JTextField();
//******Text And Password Fields For Admin Data*******

//*********buttons**********
    JButton search;
    JButton cancel;
//******Buttons************    
    
//********frame*******
    static JFrame frame = new JFrame();
//********frame*******

    String teacherName;
    java.sql.Date sqlDate;
    
    
    AttendanceTeach(String teacherName){
        this.teacherName = teacherName;
        //*******Labels and text*********
        JLabel lbl1 = new JLabel("Teacher Name:");
        lbl1.setBounds(40, 30, 200, 30);
        lbl1.setFont(new Font("BOLD",Font.BOLD,16));
            
        name.setBounds(170,35,150,23);
        name.setFont(new Font("BOLD",Font.BOLD,14));
            
        JLabel lbl2 = new JLabel("Date");
        lbl2.setBounds(40, 70, 200, 30);
        lbl2.setFont(new Font("BOLD",Font.BOLD,16));
        lbl2.setToolTipText("YYYY-MM-DD");

        Date date = new Date();
        sqlDate = new java.sql.Date(date.getTime());

        gr.setText(sqlDate.toString());
        gr.setBounds(170,75,150,23);
        gr.setFont(new Font("BOLD",Font.BOLD,14));
        //*******Labels and text*********
            
        //********Buttons**********
        search = new JButton("ADD");
        search.setBounds(80,110,100,27);
        search.addActionListener(this);
        search.setFocusable(false);
        search.setFont(new Font("BOLD",Font.BOLD,16));
        
        cancel = new JButton("Cancel");
        cancel.setBounds(200,110,100,27);
        cancel.setFocusable(false);
        cancel.addActionListener(this);
        cancel.setFont(new Font("BOLD",Font.BOLD,16));
        //*********Buttons***********
            
        //*******frame*********
        frame = new JFrame();
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(400,200);
        frame.setIconImage(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //*******frame*********
            
        //*****addin components to frame*******
        frame.add(lbl1);
        frame.add(name);
        frame.add(lbl2);
        frame.add(gr);
        frame.add(search);
        frame.add(cancel);
        //*****addin components to frame*******
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==search){
            if(name.getText().equalsIgnoreCase("")||gr.getText().equalsIgnoreCase("")){        
                JOptionPane.showMessageDialog(null, "Please fill the form correctly", "Error message" ,JOptionPane.WARNING_MESSAGE);
            }    //first goes to database
            else{
                JOptionPane.showMessageDialog(null, "Attendance has been saved");
                Database.addAttendance(name.getText(),sqlDate);
                name.setText(null);
                gr.setText(null);
                frame.setVisible(false);
                new TeacherFrame(teacherName);
            }
        }
        if(e.getSource()==cancel){
            name.setText(null);
            gr.setText(null);
        }
    }
}