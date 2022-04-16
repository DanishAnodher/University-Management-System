package school.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminFrame extends JFrame implements ActionListener{
//*******Start Global variables*******
    JTextArea textArea1;
    final String text ="ADMIN  PORTAL";
    int i;
    int number=200;
    
    JTextArea textArea2;
    final String text2 ="TEACHER  SIDE";
    int i2;
    int number2=200;
    
    JTextArea textArea3;
    final String text3 ="STUDENT  SIDE";
    int i3;
    int number3=200;
//*******End Global variables*******
    
//***********Buttons************
    JButton addTeach;
    JButton particular1;
    JButton performance;
    JButton addStud;
    JButton particular2;
    JButton result;
    JButton back1;
    JButton back2;
//***********Buttons************
    
    
    AdminFrame(){
        //ImageIcon
        ImageIcon backgroundImage = new ImageIcon("Back.JPG");
        ImageIcon exitImage = new ImageIcon("back.PNG");
        
        //Background Image
        JLabel BImage = new JLabel();
        BImage.setIcon(backgroundImage);
        BImage.setBounds(0, 0, 1350, 700);
        
        //JPannel
        JPanel panel1 = new JPanel();
        panel1.setBounds(130, 150, 500, 400);
        panel1.setLayout(null);
        panel1.setBackground(new Color(255,255,255,200));
        
        //JPannel
        JPanel panel2 = new JPanel();
        panel2.setBounds(670, 150, 500, 400);
        panel2.setLayout(null);
        panel2.setBackground(new Color(255,255,255,170));
        
        //textArea1
        textArea1 = new JTextArea();
        textArea1.setBounds(550, 0, 300, 50);
        textArea1.setBackground(null);
        textArea1.setOpaque(false);
        textArea1.setEditable(false);
        textArea1.setFont(new Font("BOLD",Font.BOLD,25));
        //textArea1
        
        //textArea2
        textArea2 = new JTextArea();
        textArea2.setBounds(280, 170, 193, 30);
        textArea2.setEditable(false);
        textArea2.setBackground(null);
        textArea2.setOpaque(false);
        textArea2.setFont(new Font("BOLD",Font.BOLD,25));
        //textArea2
        
        //textArea3
        textArea3 = new JTextArea();
        textArea3.setBounds(150, 20, 300, 50);
        textArea3.setEditable(false);
        textArea3.setFont(new Font("BOLD",Font.BOLD,25));
        //textArea3
        
        //Buttons
        addTeach = new JButton("HIRE TEACHER");
        addTeach.setBounds(140, 120, 210, 30);
        addTeach.setFocusable(false);
        addTeach.addActionListener(this);
        addTeach.setFont(new Font("BOLD",Font.BOLD,22));
        
        particular1 = new JButton("PARTICULAR");
        particular1.setBounds(140, 175, 210, 30);
        particular1.setFocusable(false);
        particular1.addActionListener(this);
        particular1.setFont(new Font("BOLD",Font.BOLD,22));
        
        performance = new JButton("PERFORMANCE");
        performance.setBounds(140, 230, 210, 30);
        performance.setFocusable(false);
        performance.addActionListener(this);
        performance.setFont(new Font("BOLD",Font.BOLD,22));
        
        addStud = new JButton("ADD STUDENT");
        addStud.setBounds(140, 120, 210, 30);
        addStud.setFocusable(false);
        addStud.addActionListener(this);
        addStud.setFont(new Font("BOLD",Font.BOLD,22));
        
        particular2 = new JButton("PARTICULAR");
        particular2.setBounds(140, 175, 210, 30);
        particular2.setFocusable(false);
        particular2.addActionListener(this);
        particular2.setFont(new Font("BOLD",Font.BOLD,22));
        
        result = new JButton("RESULT");
        result.setBounds(140, 230, 210, 30);
        result.setFocusable(false);
        result.addActionListener(this);
        result.setFont(new Font("BOLD",Font.BOLD,22));
        
        //back
        back1 = new JButton();
        back1.setIcon(exitImage);
        back1.setBackground(null);
        back1.setOpaque(false);
        back1.setBorderPainted(false);
        back1.setToolTipText("BACK");
        back1.setFocusable(false);
        back1.addActionListener(this);
        back1.setBounds(440,340,50,50);
        
        back2 = new JButton();
        back2.setIcon(exitImage);
        back2.setBackground(null);
        back2.setOpaque(false);
        back2.setBorderPainted(false);
        back2.setToolTipText("BACK");
        back2.setFocusable(false);
        back2.addActionListener(this);
        back2.setBounds(440,340,50,50);

        //frame
        this.setSize(1350,700);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        //adding
        //to frame
        this.add(BImage);
        //to frame
        
        //to first panel
        BImage.add(textArea2);
        panel1.add(addTeach);
        panel1.add(particular1);
        panel1.add(performance);
        panel1.add(back1);
        //to first panel
        
        //to second panel
        panel2.add(textArea3);
        panel2.add(addStud);
        panel2.add(particular2);
        panel2.add(result);
        panel2.add(back2);
        //to second panel
        
        //to Background image
        BImage.add(textArea1);
        BImage.add(panel1);
        BImage.add(panel2);
        
        //starting timer
        timer.start();
        timer2.start();
        timer3.start();
    }

    //First Timer
    Timer timer = new Timer(number,new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            char[] character = text.toCharArray();
            int arrayNumber = character.length;

            String addedCharacter;
            String blank = "";

            addedCharacter = blank + character[i];
            textArea1.append(addedCharacter);

            i++;
            if(i == arrayNumber){
                    i=0;
                    timer.stop();
            }
        }
    });
    
    //Second timer
    Timer timer2 = new Timer(number2,new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            char[] character2 = text2.toCharArray();
            int arrayNumber2 = character2.length;
            
            String addedCharacter2;
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
    
    //Third timer timer
    Timer timer3 = new Timer(number3,new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            char[] character3 = text3.toCharArray();
            int arrayNumber3 = character3.length;
            
            String addedCharacter3;
            String blank3 = "";
            
            addedCharacter3 = blank3 + character3[i3];
            textArea3.append(addedCharacter3);
            
            i3++;
            if(i3 == arrayNumber3){
                    i3=0;
                    timer3.stop();
            }
        }
    });

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addStud){
            new StudentAdmission();
            this.setVisible(false);
        }
        if(e.getSource()==back1 || e.getSource() == back2){
            this.setVisible(false);
            new FirstFrame();
        }
        if(e.getSource()==addTeach){
            this.setVisible(false);
            new TeacherAdd();
        }
        if(e.getSource()==result){
            this.setVisible(false);
            new ResultFrame();
        }
        if(e.getSource()== particular1){
            this.setVisible(false);
            new SearchTeachPane2();
        }
        if(e.getSource() == particular2){
            this.setVisible(false);
            new SearchStudPane();
        }
        if(e.getSource()==performance){
            new Graph();
        }
    }
}