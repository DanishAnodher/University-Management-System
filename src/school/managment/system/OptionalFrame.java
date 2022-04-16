package school.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionalFrame implements ActionListener{
    
//*******Start Global variables*******
    JTextArea textArea;
    String text ="SCHOOL  INFORMATION";
    int i;
    int number=200;
//******Global Vriables********
    
//*****Frame*******
    static JFrame frame = new JFrame();
    
//******Start Butons*****
    JButton add;
    JButton cancel;
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
    
//********Combobox**********
    JComboBox text11;
    
    
    OptionalFrame(){
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
        textArea.setBounds(500, 0, 300, 50);
        textArea.setBackground(null);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        textArea.setFont(new Font("BOLD",Font.BOLD,25));
        
        //labels and text fields
        JLabel lbl1 = new JLabel();
        lbl1.setText("Name Of University");
        lbl1.setBounds(60, 90, 170, 20);
        lbl1.setFont(new Font("BOLD",Font.BOLD,22));
        
        text1 = new JTextField();
        text1.setBounds(310, 88, 250, 25);
        
        JLabel lbl2 = new JLabel();
        lbl2.setText("Name Of Principal");
        lbl2.setBounds(60, 150, 200, 20);
        lbl2.setFont(new Font("BOLD",Font.BOLD,22));
        
        text2 = new JTextField();
        text2.setBounds(310, 148, 250, 25);
        
        JLabel lbl3 = new JLabel();
        lbl3.setText("Class Avilable");
        lbl3.setBounds(60, 210, 200, 20);
        lbl3.setFont(new Font("BOLD",Font.BOLD,22));
        
        text3 = new JTextField();
        text3.setBounds(310, 208, 250, 25);
        
        JLabel lbl4 = new JLabel();
        lbl4.setText("Total Land Area");
        lbl4.setBounds(60, 270, 310, 20);
        lbl4.setFont(new Font("BOLD",Font.BOLD,22));
        
        text4 = new JTextField();
        text4.setToolTipText("IN NUMBERS");
        text4.setBounds(310, 268, 250, 25);
        
        JLabel lbl5 = new JLabel();
        lbl5.setText("University ID No");
        lbl5.setBounds(60, 330, 310, 20);
        lbl5.setFont(new Font("BOLD",Font.BOLD,22));
        
        text5 = new JTextField();
        text5.setBounds(310, 328, 250, 25);
        
        JLabel lbl6 = new JLabel();
        lbl6.setText("Registration No");
        lbl6.setBounds(60, 390, 310, 30);
        lbl6.setFont(new Font("BOLD",Font.BOLD,22));
        
        text6 = new JTextField();
        text6.setBounds(310, 388, 250, 25);
        
        JLabel lbl7 = new JLabel();
        lbl7.setText("Postal Code");
        lbl7.setBounds(650, 90, 310, 20);
        lbl7.setFont(new Font("BOLD",Font.BOLD,22));
        
        text7 = new JTextField();
        text7.setBounds(900, 88, 250, 25);
        
        JLabel lbl8 = new JLabel();
        lbl8.setText("Date Of Establishment");
        lbl8.setBounds(650, 150, 300, 20);
        lbl8.setFont(new Font("BOLD",Font.BOLD,22));
        
        text8 = new JTextField();
        text8.setToolTipText("Date/Month/Year");
        text8.setBounds(900, 148, 250, 25);
        
        JLabel lbl9 = new JLabel();
        lbl9.setText("Address");
        lbl9.setBounds(650, 210, 300, 20);
        lbl9.setFont(new Font("BOLD",Font.BOLD,22));
        
        text9 = new JTextField();
        text9.setBounds(900, 208, 250, 25);
        
        JLabel lbl10 = new JLabel();
        lbl10.setText("Country");
        lbl10.setBounds(650, 270, 300, 30);
        lbl10.setFont(new Font("BOLD",Font.BOLD,22));
        
        text10 = new JTextField();
        text10.setBounds(900, 268, 250, 25);
        
        JLabel lbl11 = new JLabel();
        lbl11.setText("Province");
        lbl11.setBounds(650, 330, 300, 20);
        lbl11.setFont(new Font("BOLD",Font.BOLD,22));
        
        String provin[] = {"Sindh","Punjab","K.P.K","Balochistan","Fata"};
        text11 = new JComboBox(provin);
        text11.setBounds(900, 328, 250, 25);
        
        JLabel lbl12 = new JLabel();
        lbl12.setText("District");
        lbl12.setBounds(650, 390, 300, 30);
        lbl12.setFont(new Font("BOLD",Font.BOLD,22));
        
        text12 = new JTextField();
        text12.setBounds(900, 388, 250, 25);
//********End of labels and texts***********
        
        //Buttons
        add = new JButton("ADD");
        add.setBounds(410, 460, 130, 35);
        add.setFont(new Font("BOLD",Font.BOLD,20));
        add.addActionListener(this);
        add.setFocusable(false);
        
        cancel = new JButton("CANCEL");
        cancel.setBounds(580, 460, 130, 35);
        cancel.setFont(new Font("BOLD",Font.BOLD,20));
        cancel.addActionListener(this);
        cancel.setFocusable(false);

        //frame
        frame = new JFrame();
        frame.setSize(1350,700);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
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
        panel.add(text7);
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
        panel.add(add);
        panel.add(cancel);
        
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
        if(e.getSource() == cancel){
            text1.setText(null);
            text2.setText(null);
            text3.setText(null);
            text4.setText(null);
            text5.setText(null);
            text6.setText(null);
            text7.setText(null);
            text8.setText(null);
            text9.setText(null);
            text10.setText(null);
            text11.setSelectedItem(text11.getItemAt(0));
            text12.setText(null);
        }
        if(e.getSource() == add){
            if(text1.getText().equalsIgnoreCase("") || text2.getText().equalsIgnoreCase("") || text3.getText().equalsIgnoreCase("") || text4.getText().equalsIgnoreCase("") || text5.getText().equalsIgnoreCase("") || text6.getText().equalsIgnoreCase("") || text7.getText().equalsIgnoreCase("") || text8.getText().equalsIgnoreCase("") || text9.getText().equalsIgnoreCase("") || text10.getText().equalsIgnoreCase("") || text11.getSelectedIndex()==-1 || text12.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Please fill the form correctly", "Error message" ,JOptionPane.WARNING_MESSAGE);
            }
            else{
                School.addSchoolInfo(text1.getText(), text2.getText(), Integer.parseInt(text3.getText()), text4.getText(), text5.getText(), text6.getText(), Integer.parseInt(text7.getText()), text8.getText(), text9.getText(), text10.getText(), text11.getSelectedItem().toString(), text12.getText());
                new LoginFrame();
            }
        }
    }
}