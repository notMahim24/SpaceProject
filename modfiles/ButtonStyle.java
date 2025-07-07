package modfiles;
import javax.swing.JButton;

import java.awt.*;

public class ButtonStyle {
  
    public static void setstyle(JButton button){
    button.setFont(new Font("Calibri", Font.BOLD, 16));
    button.setFocusPainted(false);
    button.setBackground(Color.BLACK);
    button.setForeground(Color.WHITE);
    button.setBorder(new RoundedBorder(Color.WHITE, 1, 40));
    }
}
