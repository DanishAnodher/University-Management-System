package school.managment.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

public class TeacherSearch implements ActionListener{
//*******Start Global variables*******
    JTextArea textArea;
    String text ="TEACHER  DATA";
    int i;
    int number=200;
//******Global Vriables********
    
//*****Frame*******
    static JFrame frame = new JFrame();
    
//******Start Butons*****
    JButton ok;
//******Buttons End******
    
//*****Start Text Fields******
    JTextField text1;
    JTextField text2;
    JTextField text3;
    JTextField text4;
    JTextField text5;
    JTextField text6;
    JTextField text7;
    JTextField text8;
    JTextField text9;
    JTextField text10;
    JTextField text12;
//*******Text Fields End*********
    
//******ComboBox***********
    JComboBox text11;
//******ComboBox***********

//Radio Buttons
    JRadioButton r1;
    JRadioButton r2;
    ButtonGroup group;
    
    TeacherSearch(String teacherName, String fatherName){
        //ImageIcon
        ImageIcon backgroundImage = new ImageIcon("Back.JPG");
        
        //JPannel
        JPanel panel = new JPanel();
        panel.setBounds(70, 70, 1200, 550);
        panel.setLayout(null);
        panel.setBackground(new Color(255,255,255,200));
        
        //Background Image
        JLabel BImage = new JLabel();
        BImage.setIcon(backgroundImage);
        BImage.setBounds(0, 0, 1350, 700);
        
        //textArea
        textArea = new JTextArea();
        textArea.setBounds(550, 0, 340, 50);
        textArea.setBackground(null);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        textArea.setFont(new Font("BOLD",Font.BOLD,25));
        
        //labels and text fields
        JLabel lbl1 = new JLabel();
        lbl1.setText("Teacher Name");
        lbl1.setBounds(60, 90, 170, 20);
        lbl1.setFont(new Font("BOLD",Font.BOLD,22));
        
        text1 = new JTextField();
        text1.setEditable(false);
        text1.setBounds(310, 88, 250, 25);
        
        JLabel lbl2 = new JLabel();
        lbl2.setText("Father Name");
        lbl2.setBounds(60, 150, 200, 20);
        lbl2.setFont(new Font("BOLD",Font.BOLD,22));
        
        text2 = new JTextField();
        text2.setEditable(false);
        text2.setBounds(310, 148, 250, 25);
        
        JLabel lbl3 = new JLabel();
        lbl3.setText("Caste");
        lbl3.setBounds(60, 210, 200, 20);
        lbl3.setFont(new Font("BOLD",Font.BOLD,22));
        
        text3 = new JTextField();
        text3.setEditable(false);
        text3.setBounds(310, 208, 250, 25);
        
        JLabel lbl4 = new JLabel();
        lbl4.setText("CNIC No");
        lbl4.setBounds(60, 270, 310, 20);
        lbl4.setFont(new Font("BOLD",Font.BOLD,22));
        
        text4 = new JTextField();
        text4.setEditable(false);
        text4.setBounds(310, 268, 250, 25);
        
        JLabel lbl5 = new JLabel();
        lbl5.setText("Date Of Birth");
        lbl5.setBounds(60, 330, 310, 20);
        lbl5.setFont(new Font("BOLD",Font.BOLD,22));
        
        text5 = new JTextField();
        text5.setEditable(false);
        text5.setToolTipText("Date/Month/Year");
        text5.setBounds(310, 328, 250, 25);
        
        JLabel lbl6 = new JLabel();
        lbl6.setText("Date of hire");
        lbl6.setBounds(60, 390, 310, 30);
        lbl6.setFont(new Font("BOLD",Font.BOLD,22));
        
        text6 = new JTextField();
        text6.setToolTipText("Date/Month/Year");
        text6.setEditable(false);
        text6.setBounds(310, 388, 250, 25);
        
        JLabel lbl7 = new JLabel();
        lbl7.setText("Gender");
        lbl7.setBounds(650, 90, 310, 20);
        lbl7.setFont(new Font("BOLD",Font.BOLD,22));
        
        r1 = new JRadioButton("Male");
        r1.setBounds(965,150,100,30);
        r1.setBackground(null);
        r1.setOpaque(false);
        r1.setFont(new Font("BOLD",Font.BOLD,18));
        r1.setFocusable(false);
        r2 = new JRadioButton("Female");
        r2.setBackground(null);
        r2.setOpaque(false);
        r2.setBounds(1115,150,100,30);
        r2.setFont(new Font("BOLD",Font.BOLD,18));
        r2.setFocusable(false);
        
        group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        
        JLabel lbl8 = new JLabel();
        lbl8.setText("Address");
        lbl8.setBounds(650, 150, 300, 20);
        lbl8.setFont(new Font("BOLD",Font.BOLD,22));
        
        text8 = new JTextField();
        text8.setBounds(900, 148, 250, 25);
        text8.setEditable(false);
        
        JLabel lbl9 = new JLabel();
        lbl9.setText("Religion");
        lbl9.setBounds(650, 210, 300, 30);
        lbl9.setFont(new Font("BOLD",Font.BOLD,22));
        
        text9 = new JTextField();
        text9.setEditable(false);
        text9.setBounds(900, 208, 250, 25);
        
        JLabel lbl10 = new JLabel();
        lbl10.setText("City");
        lbl10.setBounds(650, 270, 300, 30);
        lbl10.setFont(new Font("BOLD",Font.BOLD,22));
        
        text10 = new JTextField();
        text10.setEditable(false);
        text10.setBounds(900, 268, 250, 25);
        
        JLabel lbl11 = new JLabel();
        lbl11.setText("Class Given");
        lbl11.setBounds(650, 330, 300, 20);
        lbl11.setFont(new Font("BOLD",Font.BOLD,22));
        
        String clas[] = {"Nursery","K.G","1","2","3","4","5","6","7","8"};
        text11 = new JComboBox(clas);
        text11.setBounds(900, 328, 250, 25);
        
        JLabel lbl12 = new JLabel();
        lbl12.setText("Phone Number");
        lbl12.setBounds(650, 390, 300, 30);
        lbl12.setFont(new Font("BOLD",Font.BOLD,22));
        
        text12 = new JTextField();
        text12.setEditable(false);
        text12.setBounds(900, 388, 250, 25);
//********End of labels and texts***********
        
        //Buttons
        ok = new JButton("OK");
        ok.setBounds(500, 460, 130, 35);
        ok.setFont(new Font("BOLD",Font.BOLD,20));
        ok.addActionListener(this);
        ok.setFocusable(false);

        //frame
        frame = new JFrame();
        frame.setSize(1350,700);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //adding values

        Teacher t = new Teacher(teacherName, fatherName);

        text1.setText(t.name);
        text2.setText(t.fName);
        text3.setText(t.caste);
        text4.setText(String.valueOf(t.cnic));
        text5.setText(t.dob);
        text6.setText(t.doh);
        if (t.gen.equals("M")) {
            r1.setSelected(true);
        }
        else {
            r2.setSelected(true);
        }
        text8.setText(t.address);
        text9.setText(t.religion);
        text10.setText(t.city);
        text11.setSelectedIndex(t.classs);
        text12.setText(String.valueOf(t.no));

        //adding to panel
        panel.add(lbl1);
        panel.add(text1);
        panel.add(lbl2);
        panel.add(text2);
        panel.add(lbl3);
        panel.add(text3);
        panel.add(lbl4);
        panel.add(text4);
        panel.add(lbl5);
        panel.add(text5);
        panel.add(lbl6);
        panel.add(text6);
        panel.add(lbl7);
        BImage.add(r1);
        BImage.add(r2);
        panel.add(lbl8);
        panel.add(text8);
        panel.add(lbl9);
        panel.add(text9);
        panel.add(lbl10);
        panel.add(text10);
        panel.add(lbl11);
        panel.add(text11);
        panel.add(lbl12);
        panel.add(text12);
        panel.add(ok);
        
        //adding to frame
        frame.add(BImage);
        BImage.add(textArea);
        BImage.add(panel);
        
        //starting timer
        timer.start();
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ok){
            frame.setVisible(false);
            new AdminFrame();
        }
    }
}