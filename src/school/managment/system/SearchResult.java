package school.managment.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

public class SearchResult extends JFrame implements ActionListener{

//*******Start Global variables*******
    JTextArea textArea;
    String text ="SEARCH  PORTAL";
    int i;
    int number=200;
    String tName;
//******Global Vriables********
    
//*******Start Global variables*******
    JTextArea textArea2;
    String text2 ="SEARCH  RESULT";
    int i2;
    int number2=200;
//******Global Vriables********
    
//*********TextFields and combobox*********
    JTextField text1;
    JTextField text3;
    JTextField text4;
    JComboBox  text5;
//*********TextFields and combobox*********
    
//*********TextField for subjects*********
    JTextField subj1;
    JTextField subj2;
    JTextField subj3;
    JTextField subj4;
    JTextField subj5;
    JTextField subj6;
    JTextField subj7;
    JTextField subj8;
//*********TextField for subjects*********

//*********TextField for marks*********    
    JTextField marks1;
    JTextField marks2;
    JTextField marks3;
    JTextField marks4;
    JTextField marks5;
    JTextField marks6;
    JTextField marks7;
    JTextField marks8;
//*********TextField for marks*********    

//*******TextFields For 3rd Panel******
    JTextField total_m;
    JTextField total_p;
    JTextField grade;
    JComboBox remark;
//*******TextFields For 3rd Panel******

//**********buttons*********
    JButton search;
    JButton ok;
//**********buttons*********

    SearchResult(String tName){
        
        this.tName = tName;
        
        //ImageIcon
        ImageIcon backgroundImage = new ImageIcon("Back.JPG");
        
        //Background Image
        JLabel BImage = new JLabel();
        BImage.setIcon(backgroundImage);
        BImage.setBounds(0, 0, 1350, 700);
        
        //textArea
        textArea = new JTextArea();
        textArea.setBounds(560, 0, 340, 50);
        textArea.setBackground(null);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        textArea.setFont(new Font("BOLD",Font.BOLD,25));
        
        textArea2 = new JTextArea();
        textArea2.setBounds(560, 80, 340, 50);
        textArea2.setBackground(null);
        textArea2.setOpaque(false);
        textArea2.setEditable(false);
        textArea2.setFont(new Font("BOLD",Font.BOLD,25));
        
        JLabel lbl1 = new JLabel();
        lbl1.setText("Student Name");
        lbl1.setFont(new Font("BOLD",Font.BOLD,22));
        lbl1.setBounds(25, 80, 150, 20);
        
        text1 = new JTextField();
        text1.setBounds(215, 80, 150, 25);
        
        JLabel lbl2 = new JLabel();
        lbl2.setText("Father Name");
        lbl2.setFont(new Font("BOLD",Font.BOLD,22));
        lbl2.setBounds(445, 80, 150, 20);
        
        text3 = new JTextField();
        text3.setBounds(635, 80, 150, 25);
        
        JLabel lbl3 = new JLabel();
        lbl3.setText("Class");
        lbl3.setFont(new Font("BOLD",Font.BOLD,22));
        lbl3.setBounds(25, 140, 150, 20);
        
        text4 = new JTextField();
        text4.setBounds(215, 140, 150, 25);
        
        JLabel lbl4 = new JLabel();
        lbl4.setText("Section");
        lbl4.setFont(new Font("BOLD",Font.BOLD,22));
        lbl4.setBounds(445, 140, 150, 20);
        
        String sec[] = {"Section","A","B"};
        text5 = new JComboBox(sec);
        text5.setBounds(635, 140, 150, 25);
        
        JLabel sub = new JLabel("SUBJECT");
        sub.setBounds(45, 200, 150, 25);
        sub.setFont(new Font("BOLD",Font.BOLD,24));
        
        JLabel mark = new JLabel("MARKS");
        mark.setBounds(220, 200, 150, 25);
        mark.setFont(new Font("BOLD",Font.BOLD,24));
        
        //***********8subjects***********
        subj1 = new JTextField();
        subj1.setEditable(false);
        subj1.setBounds(25, 250, 150, 25);
        
        subj2 = new JTextField();
        subj2.setEditable(false);
        subj2.setBounds(25, 290, 150, 25);
        
        subj3 = new JTextField();
        subj3.setEditable(false);
        subj3.setBounds(25, 330, 150, 25);
        
        subj4 = new JTextField();
        subj4.setEditable(false);
        subj4.setBounds(25, 370, 150, 25);
        
        subj5 = new JTextField();
        subj5.setEditable(false);
        subj5.setBounds(25, 410, 150, 25);
        
        subj6 = new JTextField();
        subj6.setEditable(false);
        subj6.setBounds(25, 450, 150, 25);
        
        subj7 = new JTextField();
        subj7.setEditable(false);
        subj7.setBounds(25, 490, 150, 25);
        
        subj8 = new JTextField();
        subj8.setEditable(false);
        subj8.setBounds(25, 530, 150, 25);
        //**********Subjects***********
        
        //**********Marks*************
        marks1 = new JTextField();
        marks1.setToolTipText("In numbers");
        marks1.setEditable(false);
        marks1.setBounds(235, 250, 50, 25);
        
        marks2 = new JTextField();
        marks2.setToolTipText("In numbers");
        marks2.setEditable(false);
        marks2.setBounds(235, 290, 50, 25);
        
        marks3 = new JTextField();
        marks3.setToolTipText("In numbers");
        marks3.setEditable(false);
        marks3.setBounds(235, 330, 50, 25);
        
        
        marks4 = new JTextField();
        marks4.setToolTipText("In numbers");
        marks4.setEditable(false);
        marks4.setBounds(235, 370, 50, 25);
        
        marks5 = new JTextField();
        marks5.setToolTipText("In numbers");
        marks5.setEditable(false);
        marks5.setBounds(235, 410, 50, 25);
        
        marks6 = new JTextField();
        marks6.setToolTipText("In numbers");
        marks6.setEditable(false);
        marks6.setBounds(235, 450, 50, 25);
        
        marks7 = new JTextField();
        marks7.setToolTipText("In numbers");
        marks7.setEditable(false);
        marks7.setBounds(235, 490, 50, 25);
        
        marks8 = new JTextField();
        marks8.setToolTipText("In numbers");
        marks8.setEditable(false);
        marks8.setBounds(235, 530, 50, 25);
        
        JLabel tolal = new JLabel("OVERALL RESULT");
        tolal.setBounds(10, 10, 220, 25);
        tolal.setBackground(Color.red);
        tolal.setOpaque(true);
        tolal.setFont(new Font("BOLD",Font.BOLD,24));
        
        //for 3rd panel
        JLabel lbl5 = new JLabel("Total Marks");
        lbl5.setBounds(15, 60, 100, 25);
        lbl5.setFont(new Font("BOLD",Font.BOLD,18));
        
        JLabel lbl6 = new JLabel("PERCENTAGE");
        lbl6.setBounds(15, 100, 180, 25);
        lbl6.setFont(new Font("BOLD",Font.BOLD,18));
        
        JLabel lbl7 = new JLabel("Grade");
        lbl7.setBounds(15, 140, 180, 25);
        lbl7.setFont(new Font("BOLD",Font.BOLD,18));
        
        JLabel lbl8 = new JLabel("REMARKS");
        lbl8.setBounds(15, 180, 180, 25);
        lbl8.setFont(new Font("BOLD",Font.BOLD,18));
        
        total_m = new JTextField();
        total_m.setEditable(false);
        total_m.setBounds(185, 58, 50, 25);
        
        total_p = new JTextField();
        total_p.setEditable(false);
        total_p.setBounds(185, 98, 50, 25);
        
        grade = new JTextField();
        grade.setEditable(false);
        grade.setBounds(185, 138, 50, 25);
        
        String remrk[] = {"Remarks","Excellent","Very Good","Good","Bad","Very Bad"};
        remark = new JComboBox(remrk);
        remark.setEditable(false);
        remark.setEnabled(false);
        remark.setBounds(185, 178, 100, 25);
        
        search = new JButton("SEARCH");
        search.setBounds(460, 500, 130, 29);
        search.setFocusable(false);
        search.addActionListener(this);
        search.setFont(new Font("BOLD",Font.BOLD,22));
        
        ok = new JButton("OK");
        ok.setBounds(460, 500, 130, 29);
        ok.setFocusable(false);
        ok.addActionListener(this);
        ok.setFont(new Font("BOLD",Font.BOLD,22));
        //for 3rd panel
        
        //panel
        JPanel panel = new JPanel();
        panel.setBounds(260, 60, 800, 570);
        panel.setLayout(null);
        panel.setBackground(new Color(255,255,255,200));
        
        JPanel panel2 = new JPanel();
        panel2.setBounds(380, 250, 300, 50);
        panel2.setLayout(null);
        panel2.setBackground(Color.RED);
        
        JPanel panel3 = new JPanel();
        panel3.setBounds(380, 250, 300, 210);
        panel3.setLayout(null);
        panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel3.setBackground(new Color(255,255,255,200));
        
        //frame
        this.setSize(1350,700);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        //Adding to panel
        panel.add(lbl1);
        panel.add(text1);
        panel.add(lbl2);
        panel.add(text3);
        panel.add(lbl3);
        panel.add(text4);
        panel.add(lbl4);
        panel.add(text5);
        panel.add(subj1);
        panel.add(sub);
        panel.add(mark);
        panel.add(tolal);
        panel.add(panel2);
        panel.add(panel3);
        panel.add(search);
        panel.add(ok);
        
        //******adding Subjects********
        panel.add(subj2);
        panel.add(subj3);
        panel.add(subj4);
        panel.add(subj5);
        panel.add(subj6);
        panel.add(subj7);
        panel.add(subj8);
        //*****adding Subjects**********
        
        //*****adding Marks*************
        panel.add(marks1);
        panel.add(marks2);
        panel.add(marks3);
        panel.add(marks4);
        panel.add(marks5);
        panel.add(marks6);
        panel.add(marks7);
        panel.add(marks8);
        //*****adding Marks*************
        
        //Adding Elements to panel2
        panel2.add(tolal);
        //Adding Elements to panel2
        
        //Adding Elements to panel3
        panel3.add(lbl5);
        panel3.add(lbl6);
        panel3.add(lbl7);
        panel3.add(lbl8);
        panel3.add(total_m);
        panel3.add(total_p);
        panel3.add(grade);
        panel3.add(remark);
        
        //Adding to image
        BImage.add(textArea);
        BImage.add(textArea2);
        BImage.add(panel);
        //BImage.add(panel2);
        
        //Adding to frame
        this.add(BImage);
        
         //starting timer
        timer.start();
        timer2.start();
    }
    
    Timer timer = new Timer(number,new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            char character[] = text.toCharArray();
            int arrayNumber = character.length;
            
            String addedCharacter = "";
            String blank = "";
            
            addedCharacter = blank + character[i];
            textArea.append(addedCharacter);
            
            i++;
            if(i == arrayNumber){
                    i=0;
                    timer.stop();
            }
        }
    });
    
    Timer timer2 = new Timer(number2,new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            char character2[] = text2.toCharArray();
            int arrayNumber2 = character2.length;
            
            String addedCharacter2 = "";
            String blank2 = "";
            
            addedCharacter2 = blank2 + character2[i2];
            textArea2.append(addedCharacter2);
            
            i2++;
            if(i2 == arrayNumber2){
                    i2=0;
                    timer2.stop();
            }
        }
    });


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==search){
            if(text1.getText().equalsIgnoreCase("") || text3.getText().equalsIgnoreCase("") || text4.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Please fill the form correctly", "Error message" ,JOptionPane.WARNING_MESSAGE);
            }
            else{
                //database s data aaege
                ArrayList<String> data = Student.getResult(text1.getText(), text3.getText(), text4.getText(), text5.getSelectedIndex());

                for (String s: data) {
                    System.out.println(s);
                }

                subj1.setText(data.get(4));
                subj2.setText(data.get(5));
                subj3.setText(data.get(6));
                subj4.setText(data.get(7));
                subj5.setText(data.get(8));
                subj6.setText(data.get(9));
                subj7.setText(data.get(10));
                subj8.setText(data.get(11));

                marks1.setText(data.get(12));
                marks2.setText(data.get(13));
                marks3.setText(data.get(14));
                marks4.setText(data.get(15));
                marks5.setText(data.get(16));
                marks6.setText(data.get(17));
                marks7.setText(data.get(18));
                marks8.setText(data.get(19));

                float m1 = Float.parseFloat(marks1.getText());
                float m2 = Float.parseFloat(marks2.getText());
                float m3 = Float.parseFloat(marks3.getText());
                float m4 = Float.parseFloat(marks4.getText());
                float m5 = Float.parseFloat(marks5.getText());
                float m6 = Float.parseFloat(marks6.getText());
                float m7 = Float.parseFloat(marks7.getText());
                float m8 = Float.parseFloat(marks8.getText());
                float t = m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8;
                String t_m = String.valueOf(t);
                total_m.setText(t_m);

                float t_per = t/8;
                String t_p = String.valueOf(t_per);
                total_p.setText(t_p);

                if(t_per>=90){
                    grade.setText("A+");
                    remark.setSelectedIndex(1);
                }
                else if(t_per>=80 && t_per<90){
                    grade.setText("A");
                    remark.setSelectedIndex(2);
                }
                else if(t_per>=70 && t_per<80){
                    grade.setText("B");
                    remark.setSelectedIndex(2);
                }
                else if(t_per>=60 && t_per<70){
                    grade.setText("C");
                    remark.setSelectedIndex(3);
                }
                else if(t_per>=50 && t_per<60){
                    grade.setText("D");
                    remark.setSelectedIndex(3);
                }
                else if(t_per>=40 && t_per<50){
                    grade.setText("E");
                    remark.setSelectedIndex(4);
                }
                else {
                    grade.setText("F");
                    remark.setSelectedIndex(5);
                }

                search.setVisible(false);
                ok.setVisible(true);
            }
        }
        if(e.getSource()==ok){
            this.setVisible(false);
            new TeacherFrame(tName);
        }
        
        
    }
}