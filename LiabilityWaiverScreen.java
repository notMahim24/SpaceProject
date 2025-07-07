import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LiabilityWaiverScreen extends BaseScreenStructure {

    public LiabilityWaiverScreen() {
        // Big Red X
        JLabel bigX = new JLabel("✖");
        bigX.setFont(new Font("Dialog", Font.BOLD, 40));
        bigX.setForeground(Color.RED);
        bigX.setBounds(220, 21, 40, 40);
        centerpanel.add(bigX);

        // Title
        JLabel title = new JLabel("Aerospace Exploration Liability Waiver");
        title.setFont(new Font("Calibri", Font.BOLD, 22));
        title.setForeground(Color.WHITE);
        title.setBounds(260, 30, 500, 30);
        centerpanel.add(title);

        int y = 80;

        addSection("Assumption of Risk:",
            "By participating in this mission, you acknowledge and accept the inherent risks of aerospace "
            + "exploration, including equipment failure and environmental hazards.", y);

        y += 70;

        addSection("No Warranty:",
            "This mission is provided “as is” without warranties. The developers and sponsors are not "
            + "liable for any damages resulting from your participation.", y);

        y += 70;

        addSection("User Responsibility:",
            "You agree to conduct the mission responsibly, comply with laws and safety standards, and "
            + "indemnify the developers against any claims arising from misuse.", y);

        y += 70;

        addSection("Acceptance:",
            "By proceeding, you confirm you have read and accepted this waiver.", y);

             // Proceed button
        JButton proceedButton = new JButton("PROCEED");
        proceedButton.setBounds(470, 350, 120, 35);
        proceedButton.setFont(new Font("Calibri", Font.BOLD, 20));
        proceedButton.setForeground(Color.RED);
        proceedButton.setBackground(Color.BLACK);
        proceedButton.setBorder(new EmptyBorder(0,0,0,0));
        proceedButton.setFocusPainted(false);
        centerpanel.add(proceedButton);

        proceedButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LaunchStorySlideshowScreen();
            }
            
        });

        setVisible(true);
    }

    private void addSection(String heading, String body, int y) {
        JLabel headLabel = new JLabel(heading);
        headLabel.setFont(new Font("Calibri", Font.BOLD, 17));
        headLabel.setForeground(Color.WHITE);
        headLabel.setBounds(40, y, 600, 25);
        centerpanel.add(headLabel);

        JLabel bodyLabel = new JLabel("<html><div style='width:580px'>" + body + "</div></html>");
        bodyLabel.setFont(new Font("Calibri", Font.PLAIN, 14));
        bodyLabel.setForeground(Color.LIGHT_GRAY);
        bodyLabel.setBounds(40, y + 25, 580, 30);
        centerpanel.add(bodyLabel);
    }

    public static void main(String[] args) {
        new LiabilityWaiverScreen();
    }
}
