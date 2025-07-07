import javax.swing.*;
import javax.swing.border.LineBorder;

import modfiles.HoverEffectOnButton;

import java.awt.*;

public class MissionReadyLogScreen extends BaseScreenStructure {

    public MissionReadyLogScreen() {
        centerpanel.setLayout(null);

        JLabel heading = new JLabel("MISSION READY");
        heading.setFont(new Font("Consolas", Font.BOLD, 26));
        heading.setForeground(Color.GREEN);
        heading.setBounds(220, 30, 300, 30);
        centerpanel.add(heading);

        JLabel logLabel = new JLabel("Training Module Completion Log:");
        logLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
        logLabel.setForeground(Color.LIGHT_GRAY);
        logLabel.setBounds(60, 90, 300, 25);
        centerpanel.add(logLabel);

        JTextArea logArea = new JTextArea();
        logArea.setEditable(false);
        logArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        logArea.setBackground(Color.BLACK);
        logArea.setForeground(Color.WHITE);
        logArea.setText("✔ Zero-G Reflex Simulation\n✔ Life Support Protocol\n✔ Console Familiarization\n✔ Emergency Evac Simulation\n\nAll systems optimal.");
        logArea.setBounds(60, 120, 520, 130);
        centerpanel.add(logArea);

        JButton launchBtn = new JButton("LAUNCH CONSOLE");
        launchBtn.setFont(new Font("SansSerif", Font.BOLD, 18));
        launchBtn.setForeground(Color.CYAN);
        launchBtn.setBackground(Color.BLACK);
        launchBtn.setBorder(new LineBorder(Color.CYAN));
        launchBtn.setFocusPainted(false);
        launchBtn.setBounds(230, 280, 200, 40);
        new HoverEffectOnButton(launchBtn);
        centerpanel.add(launchBtn);

        launchBtn.addActionListener(e -> {
            dispose();
            new CommandConsole(); // Or ConsoleScreen
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MissionReadyLogScreen();
    }
}