import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConsoleScreen extends BaseScreenStructure {

    public ConsoleScreen() {
        // Console heading
        JLabel heading = new JLabel("--- COMMAND CONSOLE ---");
        heading.setBounds(30, 20, 500, 24);
        heading.setFont(new Font("Consolas", Font.BOLD, 24));
        heading.setBackground(Color.BLACK);
        heading.setForeground(Color.GREEN);
        centerpanel.add(heading);

        // Console output panel
        JPanel consolepanel = new JPanel();
        consolepanel.setLayout(new BoxLayout(consolepanel, BoxLayout.Y_AXIS));
        consolepanel.setBounds(30, 60, 600, 263);
        consolepanel.setBackground(Color.BLACK);
        centerpanel.add(consolepanel);

        // Console lines to simulate
        String[] lines = {
            ">> Verifying orbital parameters...",
            ">> Initializing AI assistance protocols...",
            ">> Secure link with ground control established.",
            ">> All crew modules operational.",
            ">> Launch window synchronization complete.",
            ">> Final system checks: OK.",
            ">> Establishing secure uplink with ground control...",
            ">> Syncing planetary orbital parameters...",
            ">> Calibrating long-range antenna arrays...",
            ">> AI pilot core systems booting...",
            ">> Quantum core stabilized.",
            ">> Sensor grid alignment in progress...",
            ">> Atmospheric data stream received from satellite relay.",
            ">> Ready for launch command input..."
        };

     // Thread to simulate sequential console output
Thread linethread = new Thread(() -> {
    for (String line : lines) {
        try {
            Thread.sleep(800); // delay between lines
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JLabel consoleLine = new JLabel(line);
        consoleLine.setFont(new Font("Consolas", Font.PLAIN, 16));
        consoleLine.setForeground(Color.GREEN);
        
        SwingUtilities.invokeLater(() -> {
            consolepanel.add(consoleLine);
            consolepanel.revalidate();
        });
    }

    // After all lines are printed, add buttons
    SwingUtilities.invokeLater(() -> {
        JButton launchBtn = new JButton("INITIATE LAUNCH");
        launchBtn.setFont(new Font("Consolas", Font.BOLD, 14));
        launchBtn.setForeground(Color.GREEN);
        launchBtn.setBackground(Color.BLACK);
        launchBtn.setFocusPainted(false);
        launchBtn.setBorder(null);
        launchBtn.setBounds(480, 340, 160, 30);
        centerpanel.add(launchBtn);

        launchBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              dispose();
              new LiabilityWaiverScreen();
            }
            
        });

        JButton abortBtn = new JButton("ABORT MISSION");
        abortBtn.setFont(new Font("Consolas", Font.BOLD, 14));
        abortBtn.setForeground(Color.RED);
        abortBtn.setBackground(Color.BLACK);
        abortBtn.setFocusPainted(false);
        abortBtn.setBorder(null);
        abortBtn.setBounds(30, 340, 160, 30);
        centerpanel.add(abortBtn);

        abortBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               dispose();
               System.exit(0);
            }
            
        });

        centerpanel.revalidate();
        centerpanel.repaint();
    });
});

        
        linethread.start();
        setVisible(true);
    }

    public static void main(String[] args) {
        new ConsoleScreen();
    }
}
