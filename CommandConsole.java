import java.awt.*;
import javax.swing.*;

public class CommandConsole extends BaseScreenStructure {

    public CommandConsole() {
        // Skip centerpanel usage for this screen
        centerpanel.setVisible(false);

        // Set layout for full content pane
        getContentPane().setLayout(null);

        // Create a panel to contain dots and text
        JPanel loadingPanel = new JPanel();
        loadingPanel.setLayout(new BoxLayout(loadingPanel, BoxLayout.Y_AXIS));
        loadingPanel.setBackground(Color.BLACK);
        loadingPanel.setBounds(230, 250, 500, 300); // adjust as needed
        add(loadingPanel);

        JLabel message = new JLabel("Initializing Command Console....", SwingConstants.CENTER);
        message.setFont(new Font("Calibri", Font.PLAIN, 28));
        message.setForeground(Color.LIGHT_GRAY);
        message.setAlignmentX(Component.CENTER_ALIGNMENT);
        loadingPanel.add(message);

        Timer timer = new Timer(3000, e -> {
            dispose();
            new ConsoleScreen();
        });
        timer.setRepeats(false);
        timer.start();

        setVisible(true);
    }

    public static void main(String[] args) {
        new CommandConsole();
    }
}
