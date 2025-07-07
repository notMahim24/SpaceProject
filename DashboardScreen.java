import javax.swing.*;
import javax.swing.border.LineBorder;

import modfiles.HoverEffectOnButton;

import java.awt.*;

public class DashboardScreen extends BaseScreenStructure {

    public DashboardScreen() {
        // Heading
        JLabel heading = new JLabel("WELCOME BACK CHIEF");
        heading.setFont(new Font("Calibri", Font.BOLD, 28));
        heading.setForeground(Color.WHITE);
        heading.setBounds(160, 30, 400, 40);
        centerpanel.add(heading);

        // Section Titles & Status Info
        addStatus("Missions Completed:", "2", 90);
        addStatus("Active Mission:", "NONE", 130, Color.YELLOW);
        addStatus("Communication Link:", "ONLINE", 170, new Color(0, 220, 0));
        addStatus("System Health:", "STABLE", 210, new Color(0, 180, 255));
        addStatus("Last Login:", "04 July 2025, 11:52", 250);

        // Locked Missions Info
        // JLabel locked = new JLabel("Locked Missions: Jupiter, Neptune");
        // locked.setFont(new Font("Calibri", Font.ITALIC, 15));
        // locked.setForeground(Color.GRAY);
        // locked.setBounds(180, 290, 350, 25);
        // centerpanel.add(locked);

        // Start New Mission Button (Moved down)
        JButton startBtn = new JButton("START NEW MISSION");
        startBtn.setFont(new Font("SansSerif", Font.BOLD, 18));
        startBtn.setBounds(200, 330, 250, 45);
        startBtn.setBackground(Color.BLACK);
        startBtn.setForeground(Color.WHITE);
        startBtn.setBorder(new LineBorder(Color.WHITE, 2));
        new HoverEffectOnButton(startBtn);
        centerpanel.add(startBtn);
        startBtn.setFocusPainted(false);

        // Button action to proceed to project screen
        startBtn.addActionListener(e -> {
            dispose();
            new ProjectScreen();
        });

        setVisible(true);
    }

    // Utility to add status label + value
    void addStatus(String label, String value, int y) {
        addStatus(label, value, y, Color.LIGHT_GRAY);
    }

    void addStatus(String label, String value, int y, Color valueColor) {
        JLabel l1 = new JLabel(label);
        l1.setFont(new Font("Calibri", Font.PLAIN, 18));
        l1.setForeground(Color.WHITE);
        l1.setBounds(50, y, 180, 25);
        centerpanel.add(l1);

        JLabel l2 = new JLabel(value);
        l2.setFont(new Font("Consolas", Font.BOLD, 18));
        l2.setForeground(valueColor);
        l2.setBounds(220, y, 200, 25);
        centerpanel.add(l2);
    }

    public static void main(String[] args) {
        new DashboardScreen();
    }
}
