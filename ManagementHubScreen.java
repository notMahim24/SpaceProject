// 🚀 SINGLE COMBINED SCREEN: ManagementHubScreen.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.LineBorder;

public class ManagementHubScreen extends BaseScreenStructure {
    public ManagementHubScreen() {
        JLabel heading = new JLabel("AEROSPACE MANAGEMENT HUB");
        heading.setFont(new Font("Calibri", Font.BOLD, 26));
        heading.setForeground(Color.WHITE);
        heading.setBounds(200, 20, 400, 30);
        centerpanel.add(heading);

        // SECTION 1: Passenger Registration Summary
        JLabel regLabel = new JLabel("Passenger Registration");
        regLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        regLabel.setForeground(Color.CYAN);
        regLabel.setBounds(60, 70, 300, 25);
        centerpanel.add(regLabel);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setForeground(Color.LIGHT_GRAY);
        nameLabel.setBounds(80, 100, 80, 20);
        centerpanel.add(nameLabel);

        JLabel nameVal = new JLabel("Alice Carson");
        nameVal.setForeground(Color.WHITE);
        nameVal.setBounds(160, 100, 200, 20);
        centerpanel.add(nameVal);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setForeground(Color.LIGHT_GRAY);
        ageLabel.setBounds(80, 125, 80, 20);
        centerpanel.add(ageLabel);

        JLabel ageVal = new JLabel("35");
        ageVal.setForeground(Color.WHITE);
        ageVal.setBounds(160, 125, 200, 20);
        centerpanel.add(ageVal);

        JLabel natLabel = new JLabel("Nationality:");
        natLabel.setForeground(Color.LIGHT_GRAY);
        natLabel.setBounds(80, 150, 80, 20);
        centerpanel.add(natLabel);

        JLabel natVal = new JLabel("USA");
        natVal.setForeground(Color.WHITE);
        natVal.setBounds(160, 150, 200, 20);
        centerpanel.add(natVal);

        JLabel statusLabel = new JLabel("Clearance:");
        statusLabel.setForeground(Color.LIGHT_GRAY);
        statusLabel.setBounds(80, 175, 80, 20);
        centerpanel.add(statusLabel);

        JLabel statusVal = new JLabel("✔ Yes");
        statusVal.setForeground(Color.GREEN);
        statusVal.setBounds(160, 175, 200, 20);
        centerpanel.add(statusVal);

        // SECTION 2: Mission Planning
        JLabel planLabel = new JLabel("Mission Planning");
        planLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        planLabel.setForeground(Color.CYAN);
        planLabel.setBounds(60, 210, 300, 25);
        centerpanel.add(planLabel);

        JLabel planData = new JLabel("Crew Size: 4   |   Fuel Level: 85%   |   Destination: Mars");
        planData.setForeground(Color.WHITE);
        planData.setBounds(80, 240, 500, 20);
        centerpanel.add(planData);

        // SECTION 3: Space Tour Packages (Selectable)
        JLabel tourLabel = new JLabel("Select a Space Tour Package");
        tourLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        tourLabel.setForeground(Color.CYAN);
        tourLabel.setBounds(60, 280, 400, 25);
        centerpanel.add(tourLabel);

        ButtonGroup tourGroup = new ButtonGroup();

        JRadioButton opt1 = new JRadioButton("Mars Walk - $1,000,000 - 60 Days");
        opt1.setForeground(Color.WHITE);
        opt1.setBackground(Color.BLACK);
        opt1.setBounds(80, 310, 300, 20);

        JRadioButton opt2 = new JRadioButton("Moon Flyby - $300,000 - 14 Days");
        opt2.setForeground(Color.WHITE);
        opt2.setBackground(Color.BLACK);
        opt2.setBounds(80, 335, 300, 20);

        JRadioButton opt3 = new JRadioButton("ISS Orbit Stay - $150,000 - 7 Days");
        opt3.setForeground(Color.WHITE);
        opt3.setBackground(Color.BLACK);
        opt3.setBounds(80, 360, 300, 20);

        tourGroup.add(opt1);
        tourGroup.add(opt2);
        tourGroup.add(opt3);

        centerpanel.add(opt1);
        centerpanel.add(opt2);
        centerpanel.add(opt3);

        // Confirm Button
        JButton confirmBtn = new JButton("Confirm ");
        confirmBtn.setBounds(490, 360, 100, 25);
        confirmBtn.setForeground(Color.WHITE);
        confirmBtn.setBackground(Color.BLACK);
        confirmBtn.setFocusPainted(false);
        confirmBtn.setBorder(new LineBorder(Color.WHITE));
        centerpanel.add(confirmBtn);

        confirmBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new DashboardScreen();
            }
            
        });

      

        setVisible(true);
    }

    public static void main(String[] args) {
        new ManagementHubScreen();
    }
}
