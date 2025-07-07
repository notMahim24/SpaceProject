import java.awt.*;
import javax.swing.*;

public class VerifyScreen extends BaseScreenStructure {
    public VerifyScreen() {
        // Skip centerpanel usage for this screen
        centerpanel.setVisible(false);

        // Set layout for full content pane
        getContentPane().setLayout(null);

        // Create a panel to contain dots and text
        JPanel loadingPanel = new JPanel();
        loadingPanel.setLayout(new BoxLayout(loadingPanel, BoxLayout.Y_AXIS));
        loadingPanel.setBackground(Color.BLACK);
        loadingPanel.setBounds(320, 270, 300, 100); // adjust as needed
        add(loadingPanel);

       
        JLabel message = new JLabel("VERIFYING QUANTUM ID...........", SwingConstants.CENTER);
        message.setFont(new Font("Calibri", Font.ITALIC, 22));
        message.setForeground(Color.WHITE);
        message.setAlignmentX(Component.CENTER_ALIGNMENT);
        loadingPanel.add(message);

        Timer timer = new Timer(3000, e -> {
            dispose(); // Close VerifyScreen
            new ManagementHubScreen(); // Open Dashboard
        });
        timer.setRepeats(false); // Only run once
        timer.start();


        setVisible(true);
    }

    public static void main(String[] args) {
        new VerifyScreen();
    }
}
