import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import modfiles.RoundedBorder;

public class ProjectScreen extends BaseScreenStructure {
    
    public ProjectScreen(){

        JLabel projectheading = new JLabel("CHOOSE PROJECT DESTINATION");
        projectheading.setFont(new Font("Calibri",Font.BOLD,28));
        projectheading.setForeground(Color.WHITE);
        projectheading.setBounds(150, 45, 400, 100);
        centerpanel.add(projectheading);

        
        JButton btn1 = createButton(100, 180);
        ImageIcon mars = createImage("F:\\OwnSpaceApp\\images\\Mars.jpg");
        btn1.setIcon(mars);
        JLabel label1 = createLabel("MARS", 120, 300);
        centerpanel.add(btn1);
        centerpanel.add(label1);

        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new PlanetBriefScreen("Mars");
            }
            
        });

        JButton btn2 = createButton(220, 180);
        ImageIcon moon = createImage("F:\\OwnSpaceApp\\images\\Moon.jpg");
        btn2.setIcon(moon);
        JLabel label2 = createLabel("Moon", 240, 300);
        centerpanel.add(btn2);
        centerpanel.add(label2);

        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new PlanetBriefScreen("Moon");
            }
            
        });

        JButton btn3 = createButton(340, 180);
        ImageIcon jupiter = createImage("F:\\OwnSpaceApp\\images\\Jupiter.jpg");
        btn3.setIcon(jupiter);
        JLabel label3 = createLabel("Jupiter", 360, 300);
        centerpanel.add(btn3);
        centerpanel.add(label3);

        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new PlanetBriefScreen("Jupiter");
            }
            
        });
        

        JButton btn4 = createButton(460, 180);
        ImageIcon neptune = createImage("F:\\OwnSpaceApp\\images\\Neptune.jpg");
        btn4.setIcon(neptune);
        JLabel label4 = createLabel("Neptune", 470, 300);
        centerpanel.add(btn4);
        centerpanel.add(label4);

        btn4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new PlanetBriefScreen("Neptune");
            }
            
        });
        
      


        setVisible(true);
    }

    JLabel createLabel(String text,int x ,int y){
        JLabel label = new JLabel(text);
        label.setBackground(Color.BLACK);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Calibri",Font.ITALIC,20));
        label.setBounds(x, y, 100, 30);
        return label;
    }

    JButton createButton(int x,int y){
        JButton button = new JButton();
        button.setBackground(Color.BLACK);
        button.setBounds(x, y, 100, 100);
        button.setBorder(new RoundedBorder(Color.WHITE, 2, 50));
        return button;
    }

    ImageIcon createImage(String path){
        ImageIcon icon = new ImageIcon(path);
        Image scaled = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon scaledimage = new ImageIcon(scaled);
        return scaledimage;
        
    }
    

    public static void main(String[] args) {
        new ProjectScreen();
    }
}
