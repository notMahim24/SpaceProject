import javax.swing.*;
import java.awt.*;

public class SystemConfigScreen extends BaseScreenStructure {

    public SystemConfigScreen() {
        centerpanel.setLayout(null);

        // Title
        JLabel title = new JLabel("SYSTEM CONFIGURATION");
        title.setFont(new Font("Calibri", Font.BOLD, 28));
        title.setForeground(Color.WHITE);
        title.setBounds(200, 40, 400, 30);
        centerpanel.add(title);

        int y = 100;

        addSection("Navigation System Calibration",
            "Sync orbital data with onboard systems, set landing coordinates, and verify terrain scanning algorithms.",
            y);

        y += 60;
        addSection("Environmental Systems Setup",
            "Adjust temperature, pressure and oxygen control units to match planetary data and suit specifications.",
            y);

        y += 60;
        addSection("Rover-AI Sync",
            "Initialize shared mission protocols between AI pilot and terrain rovers. Run diagnostics on autonomy.",
            y);

        y += 60;
        addSection("Contingency Protocols",
            "Upload fallback recovery procedures, manual override permissions, and offline operation tasks.",
            y);

        // Deploy button
        JButton deployButton = new JButton("DEPLOY CONFIGURATION");
        deployButton.setFont(new Font("Consolas", Font.BOLD, 14));
        deployButton.setForeground(Color.GREEN);
        deployButton.setBackground(Color.BLACK);
        deployButton.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        deployButton.setFocusPainted(false);
        deployButton.setBounds(425, 350, 180, 30);
        centerpanel.add(deployButton);

        setVisible(true);
    }

    private void addSection(String heading, String description, int y) {
        JLabel headLabel = new JLabel("• " + heading);
        headLabel.setFont(new Font("Calibri", Font.BOLD, 18));
        headLabel.setForeground(Color.WHITE);
        headLabel.setBounds(50, y, 600, 15);
        centerpanel.add(headLabel);

        JLabel bodyLabel = new JLabel("<html><div style='width:580px'>" + description + "</div></html>");
        bodyLabel.setFont(new Font("Calibri", Font.PLAIN, 14));
        bodyLabel.setForeground(Color.LIGHT_GRAY);
        bodyLabel.setBounds(50, y + 15, 580, 30);
        centerpanel.add(bodyLabel);
    }

    public static void main(String[] args) {
        new SystemConfigScreen();
    }
}
