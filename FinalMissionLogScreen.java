import javax.swing.*;
import java.awt.*;

class FinalMissionLogScreen extends BaseScreenStructure {
    public FinalMissionLogScreen() {
        centerpanel.setLayout(null);

        JLabel title = new JLabel("FINAL MISSION LOG");
        title.setFont(new Font("Calibri", Font.BOLD, 24));
        title.setForeground(Color.YELLOW);
        title.setBounds(200, 30, 400, 30);
        centerpanel.add(title);

        JTextArea logArea = new JTextArea();
        logArea.setBounds(60, 120, 500, 100);
        logArea.setBackground(Color.BLACK);
        logArea.setForeground(Color.LIGHT_GRAY);
        logArea.setFont(new Font("Consolas", Font.PLAIN, 14));
        logArea.setText("- Launch Successful\n- Terrain Scan Completed\n- AI Navigation Enabled\n- Sample Collected: Martian Soil\n- Return Path Calculated\n- No Casualties");
        logArea.setEditable(false);
        centerpanel.add(logArea);

        JLabel status = new JLabel("Mission Status: SUCCESS");
        status.setFont(new Font("Calibri",Font.BOLD,24));
        status.setForeground(Color.CYAN);
        status.setBackground(Color.BLACK);
        status.setBounds(200,300,400,30);
        centerpanel.add(status);
        

        setVisible(true);
    }

    public static void main(String[] args) {
        new FinalMissionLogScreen();
    }
}
