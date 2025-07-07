import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import modfiles.HoverEffectOnButton;

public class TrainingSessionScreen extends BaseScreenStructure {

    public TrainingSessionScreen() {
        // Main heading
        JLabel heading = new JLabel("TRAINING MODULE SESSION");
        heading.setFont(new Font("Calibri", Font.BOLD, 26));
        heading.setForeground(Color.WHITE);
        heading.setBounds(50, 30, 600, 30);
        centerpanel.add(heading);

        int startY = 90;

        addSection("• Emergency Protocols Training",
            "Simulate onboard and planetary emergencies: decompression, fire, or life-support failures."
            , startY);

        startY += 80;

        addSection("• Gravity and Mobility Simulation",
            "Train in zero-G and low-G scenarios to adapt to planetary motion. Includes walking and tool handling.",
            startY);

        startY += 80;

        addSection("• Systems Monitoring Exercises",
            "Practice monitoring power, life support, fuel reserves, and diagnostics during mission simulation",
            startY);

        startY += 80;

        // Right-arrow button
        JButton nextBtn = new JButton("Start Training");
        nextBtn.setFont(new Font("SansSerif", Font.BOLD, 22));
        nextBtn.setFocusPainted(false);
        nextBtn.setBackground(Color.BLACK);
        nextBtn.setForeground(Color.WHITE);
        nextBtn.setBorder(new EmptyBorder(0,0,0,0));
        nextBtn.setBounds(230, 340, 190, 40);
        new HoverEffectOnButton(nextBtn);
        centerpanel.add(nextBtn);

        nextBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ModuleSelectionScreen();
            }
            
        });

        setVisible(true);
    }

    private void addSection(String title, String description, int y) {
        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 18));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(50, y, 600, 25);
        centerpanel.add(titleLabel);

        JLabel descLabel = new JLabel("<html><div style='width:580px'>" + description + "</div></html>");
        descLabel.setFont(new Font("Calibri", Font.PLAIN, 14));
        descLabel.setForeground(Color.LIGHT_GRAY);
        descLabel.setBounds(50, y + 25, 600, 40);
        centerpanel.add(descLabel);
    }

    public static void main(String[] args) {
        new TrainingSessionScreen();
    }
}
