import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MissionControlScreen extends BaseScreenStructure {
    public MissionControlScreen() {
        centerpanel.setLayout(null);

        JLabel title = new JLabel("MISSION CONTROL CENTER");
        title.setFont(new Font("Calibri", Font.BOLD, 26));
        title.setForeground(Color.WHITE);
        title.setBounds(190, 25, 400, 30);
        centerpanel.add(title);

        JButton emergencyBtn = createModuleButton("Emergency Handling", 100);
        JButton telemetryBtn = createModuleButton("Rover Telemetry", 170);
        JButton missionLogBtn = createModuleButton("Final Mission Log", 240);
        missionLogBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               dispose();
               new FinalMissionLogScreen();
            }
            
        });

        centerpanel.add(emergencyBtn);
        centerpanel.add(telemetryBtn);
        centerpanel.add(missionLogBtn);

        setVisible(true);
    }

    private JButton createModuleButton(String label, int y) {
        JButton button = new JButton(label);
        button.setBounds(180, y, 300, 40);
        button.setFont(new Font("Consolas", Font.PLAIN, 16));
        button.setBackground(Color.BLACK);
        button.setForeground(Color.CYAN);
        button.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        return button;
    }

    public static void main(String[] args) {
        new MissionControlScreen();
    }
}