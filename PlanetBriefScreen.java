import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlanetBriefScreen extends BaseScreenStructure {

    public PlanetBriefScreen(String planetName) {
        // Set layout to null for absolute positioning
        centerpanel.setLayout(null);

        String fileName = "F:\\OwnSpaceApp\\images\\" + planetName + "Bg.jpg";



        // Background image
        JLabel bgLabel = new JLabel(new ImageIcon(new ImageIcon(fileName)
                .getImage().getScaledInstance(700, 400, Image.SCALE_SMOOTH)));
        bgLabel.setBounds(0, 0, 650, 400);
        centerpanel.add(bgLabel);

        // Overlay panel
        JPanel overlay = new JPanel();
        overlay.setLayout(null);
        overlay.setBackground(new Color(0, 0, 0, 0)); // semi-transparent black
        overlay.setBounds(20, 40, 620, 350);
        bgLabel.add(overlay);

        // Heading
        JLabel heading = new JLabel("MISSION BRIEF: " + planetName.toUpperCase());
        heading.setFont(new Font("Calibri", Font.BOLD, 24));
        heading.setForeground(Color.WHITE);
        heading.setBounds(30, 60, 500, 30);
        overlay.add(heading);

        // Cinematic briefing text
        JLabel text = new JLabel("<html><div style='width:560px'>"
                + "The nether dust rises... Welcome to <b>" + planetName + "</b>.<br><br>"
                + "You’ve been chosen to lead the frontier operations. "
                + "This is more than a mission—it’s a legacy in the making. "
                + "Terrain scans show variable conditions. Resources are limited. "
                + "Survival, science, and strategy must work hand in hand.<br><br>"
                + "Gear up, Commander. Your journey begins now."
                + "</div></html>");
        text.setFont(new Font("Calibri", Font.PLAIN, 15));
        text.setForeground(Color.LIGHT_GRAY);
        text.setBounds(30, 80, 560, 160);
        overlay.add(text);

        // Proceed button
        JButton proceed = new JButton("PROCEED");
        proceed.setFont(new Font("Consolas", Font.BOLD, 16));
        proceed.setForeground(Color.GREEN);
        proceed.setBackground(Color.BLACK);
        proceed.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        proceed.setFocusPainted(false);
        proceed.setBounds(450, 300, 140, 30);
        proceed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               dispose();
                new ExplorationObjectiveScreen(planetName);
            }
            
        });

        
        overlay.add(proceed);

        setVisible(true);
    }

    public static void main(String[] args) {
        new PlanetBriefScreen("Mars");
    }
}
