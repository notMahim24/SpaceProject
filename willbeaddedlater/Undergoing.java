import java.awt.*;
import javax.swing.*;

public class Undergoing extends BaseScreenStructure {

    public Undergoing() {
        // Skip centerpanel usage for this screen
        centerpanel.setVisible(false);

        // Set layout for full content pane
        getContentPane().setLayout(null);

        // Create a panel to contain dots and text
        JPanel loadingPanel = new JPanel();
        loadingPanel.setLayout(new BoxLayout(loadingPanel, BoxLayout.Y_AXIS));
        loadingPanel.setBackground(Color.BLACK);
        loadingPanel.setBounds(230, 200, 500, 300); // adjust as needed
        add(loadingPanel);

        // Dot display (simple version using labels)
        JLabel dots = new JLabel("●   ●   ●   ●", SwingConstants.CENTER);
        dots.setFont(new Font("Calibri", Font.BOLD, 38));
        dots.setForeground(Color.WHITE);
        dots.setAlignmentX(Component.CENTER_ALIGNMENT);
        loadingPanel.add(dots);

        loadingPanel.add(Box.createVerticalStrut(25)); // spacing

        JLabel message = new JLabel("Undergoing Training... Please Wait", SwingConstants.CENTER);
        message.setFont(new Font("Calibri", Font.PLAIN, 28));
        message.setForeground(Color.LIGHT_GRAY);
        message.setAlignmentX(Component.CENTER_ALIGNMENT);
        loadingPanel.add(message);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Undergoing();
    }
}
