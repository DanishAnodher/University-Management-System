package school.managment.system;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SearchTeachPane2 extends JFrame implements ActionListener{
    
//******Text And Password Fields For Admin Data*******
    static JTextField name = new JTextField();
    static JTextField f_name = new JTextField();
//******Text And Password Fields For Admin Data*******

//*********buttons**********
    JButton search;
//******Buttons************    
    
//********frame*******
    static JFrame frame = new JFrame();
//********frame*******
    
    
    SearchTeachPane2(){
        //*******Labels and text*********
        JLabel lbl1 = new JLabel("Teacher Name");
        lbl1.setBounds(40, 30, 200, 30);
        lbl1.setFont(new Font("BOLD",Font.BOLD,16));
            
        name.setBounds(170,35,150,23);
        name.setFont(new Font("BOLD",Font.BOLD,14));
            
        JLabel lbl2 = new JLabel("Father Name");
        lbl2.setBounds(40, 70, 200, 30);
        lbl2.setFont(new Font("BOLD",Font.BOLD,16));
          
        f_name.setBounds(170,75,150,23);
        f_name.setFont(new Font("BOLD",Font.BOLD,14));
        //*******Labels and text*********
            
        //********Buttons**********
        search = new JButton("SEARCH");
        search.setBounds(135,110,130,27);
        search.addActionListener(this);
        search.setFocusable(false);
        search.setFont(new Font("BOLD",Font.BOLD,16));
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
        frame.add(f_name);
        frame.add(search);
        //*****addin components to frame*******
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==search){
            if (Teacher.isValid(name.getText(), f_name.getText())) {
                frame.setVisible(false);
                new TeacherSearch(name.getText(), f_name.getText());
            }
            else {
                JOptionPane.showMessageDialog(null, "INVALID CREDENTIALS", "ERROR" ,JOptionPane.ERROR_MESSAGE);
            }

            }
    }
}