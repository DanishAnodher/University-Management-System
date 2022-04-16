package school.managment.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class TeacherFrame extends JFrame implements ActionListener{
    
    //*******Start Global variables*******
    JTextArea textArea;
    String text ="TEACHER  PANEL";
    int i;
    int number=200;
    String teacherName;
    //******Global Vriables********
    
    //*******Start Global variables*******
    JTextArea textArea2;
    String text2;
    int i2;
    int number2=200;
    //******Global Vriables********

    //***********Buttons************
    JButton result;
    JButton searchresult;
    JButton searchstudent;
    JButton back;
    JButton attendance;
    //***********Buttons************
    
    TeacherFrame(String name){

        text2 = "WELCOME "+name;
        System.out.println(name);
        teacherName = name;

        //ImageIcon
        ImageIcon backgroundImage = new ImageIcon("Back.JPG");
        ImageIcon exitImage = new ImageIcon("back.PNG");
        
        //textArea
        textArea = new JTextArea();
        textArea.setBounds(500, 0, 340, 50);
        textArea.setBackground(null);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        textArea.setFont(new Font("BOLD",Font.BOLD,25));
        
        //textArea
        textArea2 = new JTextArea();
        textArea2.setBounds(470, 115, 350, 50);
        textArea2.setBackground(null);
        textArea2.setOpaque(false);
        textArea2.setEditable(false);
        textArea2.setFont(new Font("BOLD",Font.BOLD,25));
        
        //JPannel
        JPanel panel = new JPanel();
        panel.setBounds(350, 115, 600, 450);
        panel.setLayout(null);
        panel.setBackground(new Color(255,255,255,200));
        
        //Background Image
        JLabel BImage = new JLabel();
        BImage.setIcon(backgroundImage);
        BImage.setBounds(0, 0, 1350, 700);
        
        result = new JButton("NEW RESULT");
        result.setBounds(175, 145, 250, 30);
        result.setFocusable(false);
        result.addActionListener(this);
        result.setFont(new Font("BOLD",Font.BOLD,22));
        
        searchresult = new JButton("SEARCH RESULT");
        searchresult.setBounds(175, 200, 250, 30);
        searchresult.setFocusable(false);
        searchresult.addActionListener(this);
        searchresult.setFont(new Font("BOLD",Font.BOLD,22));
        
        searchstudent = new JButton("SEARCH STUDENT");
        searchstudent.setBounds(175, 255, 250, 30);
        searchstudent.setFocusable(false);
        searchstudent.addActionListener(this);
        searchstudent.setFont(new Font("BOLD",Font.BOLD,22));
        
        back = new JButton();
        back.setIcon(exitImage);
        back.setBackground(null);
        back.setOpaque(false);
        back.setBorderPainted(false);
        back.setToolTipText("BACK");
        back.setFocusable(false);
        back.addActionListener(this);
        back.setBounds(530,375,50,50);

        attendance = new JButton("ATTENDANCE");
        attendance.setBounds(175, 310, 250, 30);
        attendance.setFocusable(false);
        attendance.addActionListener(this);
        attendance.setFont(new Font("BOLD",Font.BOLD,22));

        //frame
        this.setSize(1350,700);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        //adding
        this.add(BImage);
        panel.add(result);
        panel.add(searchresult);
        panel.add(searchstudent);
        panel.add(attendance);
        BImage.add(textArea2);
        BImage.add(textArea);
        panel.add(back);
        BImage.add(panel);
        
        //timer
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
        if(e.getSource()==back){
            this.setVisible(false);
            new FirstFrame();
        }
        if(e.getSource()==result){
            this.setVisible(false);
            new ResultFrame2(teacherName);
        }
        if(e.getSource()==searchresult){
            this.setVisible(false);
            new SearchResult(teacherName);
        }
        if(e.getSource() == searchstudent ){
            this.setVisible(false);
            new SearchStudPane2(teacherName);
        }
        if(e.getSource()==attendance){
            this.setVisible(false);
            new AttendanceTeach(teacherName);
        }
    }
}