import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class EmergencyHandlingScreen extends BaseScreenStructure {
    public EmergencyHandlingScreen() {
        centerpanel.setLayout(null);

        JLabel title = new JLabel("EMERGENCY HANDLING PROTOCOLS");
        title.setFont(new Font("Calibri", Font.BOLD, 24));
        title.setForeground(Color.RED);
        title.setBounds(150, 30, 500, 30);
        centerpanel.add(title);

        String[] alerts = {
            "• Oxygen leak detected in sector 3",
            "• Manual override required: reactor core cooling",
            "• Emergency beacon deployed",
            "• Hull breach sealed with foam insulation"
        };

        int y = 80;
        for (String alert : alerts) {
            JLabel label = new JLabel(alert);
            label.setFont(new Font("Consolas", Font.PLAIN, 16));
            label.setForeground(Color.LIGHT_GRAY);
            label.setBounds(60, y, 600, 25);
            centerpanel.add(label);
            y += 40;
        }

        JButton fix = new JButton("QUICK FIX ISSUES -->>   ");
        fix.setFont(new Font("Calibri",Font.BOLD,26));
        fix.setBackground(Color.BLACK);
        fix.setForeground(Color.GREEN);
        fix.setBounds(120, 300, 350, 50);

        // Remove all border visuals
        fix.setBorder(BorderFactory.createEmptyBorder());  
        fix.setFocusPainted(false);                        
        fix.setContentAreaFilled(false);                   
        fix.setOpaque(true);                    
        
        fix.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new MissionControlScreen();
            }
            
        });

        centerpanel.add(fix);
        setVisible(true);
            
    
    }

    public static void main(String[] args) {
        new EmergencyHandlingScreen();
    }

}
