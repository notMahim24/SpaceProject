import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import modfiles.ButtonStyle;
import modfiles.HoverEffectOnButton;

public class ModuleSelectionScreen extends BaseScreenStructure{

    public ModuleSelectionScreen(){

    JLabel select = new JLabel("SELECT TRAINING MODULE");
    select.setFont(new Font("Calibri",Font.BOLD,30));
    select.setBackground(Color.BLACK);            
    select.setForeground(Color.WHITE);            
    select.setBounds(140,50,400,30);
    centerpanel.add(select);

    // JPanel underline = new JPanel();
    // underline.setBackground(Color.WHITE);
    // underline.setBounds(140,80,360,3);
    // centerpanel.add(underline);

    JButton button1 = new JButton("ZERO GRAVITY TRAINING");
    button1.setBounds(100, 140,200, 180);
    ButtonStyle.setstyle(button1);
    new HoverEffectOnButton(button1);
    centerpanel.add(button1);

    button1.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            new ZeroGravityTrainingScreen();
        }
        
    });
    
    
    JButton button2 = new JButton("REFLEX TRAINING");
    button2.setBounds(350, 140,200, 180);
    ButtonStyle.setstyle(button2);
    new HoverEffectOnButton(button2);
    centerpanel.add(button2);
    
    button2.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            new ZeroGravityTrainingScreen();
        }
        
    });

    setVisible(true);

    }
    public static void main(String[] args) {
        new ModuleSelectionScreen();
    }
}
