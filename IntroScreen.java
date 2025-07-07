import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import modfiles.ButtonStyle;
import modfiles.HoverEffectOnButton;

public class IntroScreen extends BaseScreenStructure {
    
    public IntroScreen(){
    

    JLabel welcome = new JLabel("WELCOME TO AEROX");
    welcome.setFont(new Font("Calibri",Font.BOLD,30));
    welcome.setBackground(Color.BLACK);            
    welcome.setForeground(Color.WHITE);            
    welcome.setBounds(190,70,400,30);
    centerpanel.add(welcome);

    JLabel choose = new JLabel("CHOOSE YOUR PATH");
    choose.setFont(new Font("Calibri",Font.PLAIN,20));
    choose.setBackground(Color.BLACK);            
    choose.setForeground(Color.WHITE);            
    choose.setBounds(240,130,300,30);
    centerpanel.add(choose);
    
    JButton btn1 = new JButton("SPACE EXPLORATION");
    ButtonStyle.setstyle(btn1);
    btn1.setBounds(100, 200, 200, 150);
    centerpanel.add(btn1);
    new HoverEffectOnButton(btn1);
    
    btn1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            new LoginScreen();    
        }
        
    });


    JButton btn2 = new JButton("ROVER TEAM DEPLOYMENT");
    ButtonStyle.setstyle(btn2);
    btn2.setBounds(370, 200, 200, 150);
    centerpanel.add(btn2);
    new HoverEffectOnButton(btn2);
    
    btn2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            new LoginScreen();    
        }
        
    });
    
    setVisible(true);

    }
    
    
    
    public static void main(String[] args) {
        new IntroScreen();
    }
}
