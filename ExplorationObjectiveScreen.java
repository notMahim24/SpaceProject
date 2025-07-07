import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ExplorationObjectiveScreen extends BaseScreenStructure {

    public ExplorationObjectiveScreen(String planetName) {
        // Set layout for background layering
        centerpanel.setLayout(null);

        // Background image
        String fileName = "F:\\OwnSpaceApp\\images\\" + planetName + "Bg.jpg";
        JLabel bgLabel = new JLabel(new ImageIcon(
            new ImageIcon(fileName).getImage().getScaledInstance(650, 400, Image.SCALE_SMOOTH)
        ));
        bgLabel.setBounds(0, 0, 650, 400);
        centerpanel.add(bgLabel);

        // Overlay panel (transparent for dark effect)
        JPanel overlay = new JPanel();
        overlay.setLayout(null);
        overlay.setBackground(new Color(0, 0, 0, 0));  // semi-transparent dark
        overlay.setBounds(20, 30, 610, 330);
        bgLabel.add(overlay);

        // Heading
        JLabel heading = new JLabel("EXPLORATION OBJECTIVES : " + planetName.toUpperCase());
        heading.setFont(new Font("Calibri", Font.BOLD, 24));
        heading.setForeground(Color.WHITE);
        heading.setBounds(30, 20, 550, 30);
        overlay.add(heading);

        // Mission objectives
        int startY = 60;
        addObjective("Terrain Analysis", getPrimaryMission(planetName), startY, overlay);
        addObjective("System Diagnostics", getSecondaryMission(planetName), startY += 70, overlay);
        addObjective("Crew/Rover Operations", getCrewTasks(planetName), startY += 70, overlay);
      //  addObjective("Communication Setup", getAdditionalObjective(planetName), startY += 70, overlay);

        // Proceed Button
        JButton nextBtn = new JButton("PROCEED →");
        nextBtn.setFont(new Font("Consolas", Font.BOLD, 16));
        nextBtn.setFocusPainted(false);
        nextBtn.setBackground(Color.BLACK);
        nextBtn.setForeground(Color.CYAN);
        nextBtn.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        nextBtn.setBounds(430, 270, 140, 30);

        nextBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              dispose();
              new LoadingScreen();
            }
            
        });

        overlay.add(nextBtn);

        setVisible(true);
    }

    // Modified addObjective method with overlay as container
    void addObjective(String title, String description, int y, JPanel overlay) {
        JLabel titleLabel = new JLabel("• " + title);
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 17));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(30, y, 550, 20);
        overlay.add(titleLabel);

        JLabel descLabel = new JLabel("<html><div style='width:540px'>" + description + "</div></html>");
        descLabel.setFont(new Font("Calibri", Font.PLAIN, 14));
        descLabel.setForeground(Color.LIGHT_GRAY);
        descLabel.setBounds(30, y + 22, 540, 40);
        overlay.add(descLabel);
    }

    // Mission content per planet (unchanged)
    String getPrimaryMission(String planet) {
        return switch (planet.toLowerCase()) {
            case "mars" -> "Perform in-depth terrain scans using multispectral sensors to identify safe paths and geological interests.";
            case "moon" -> "Survey surface topology to determine ideal regions for base foundation and material collection.";
            case "jupiter" -> "Conduct remote observation of upper atmosphere for storm patterns and magnetic anomalies.";
            case "neptune" -> "Deploy surface probes to assess terrain under extreme cold and pressure conditions.";
            default -> "Carry out wide-area terrain evaluation with navigation hazard mapping.";
        };
    }

    String getSecondaryMission(String planet) {
        return switch (planet.toLowerCase()) {
            case "mars" -> "Run full diagnostics on onboard life-support systems, propulsion checks, and energy efficiency protocols.";
            case "moon" -> "Perform lunar gear endurance trials including dust resistance and temperature shielding.";
            case "jupiter" -> "Validate onboard systems under radiation-intensive zones with redundancy fallback tests.";
            case "neptune" -> "Examine all insulation and thermal control modules under subzero conditions.";
            default -> "Conduct baseline tests of propulsion, energy supply, and environmental monitoring modules.";
        };
    }

    String getCrewTasks(String planet) {
        return switch (planet.toLowerCase()) {
            case "mars" -> "Coordinate manual EVA simulations, habitat setup sequences, and deploy atmospheric samplers.";
            case "moon" -> "Practice terrain navigation with reduced-gravity simulators and manual data relay.";
            case "jupiter" -> "Simulate remote rover overrides, including weather intervention protocols.";
            case "neptune" -> "Conduct deep-field calibration tests and remote task scheduling in cryogenic mode.";
            default -> "Execute critical task routines, emergency drills, and autonomous maintenance.";
        };
    }

    String getAdditionalObjective(String planet) {
        return switch (planet.toLowerCase()) {
            case "mars" -> "Establish delayed communication relays and fallback transmission systems with Earth mission control.";
            case "moon" -> "Test short-range relay towers and lunar orbit satellite links for direct uplink validation.";
            case "jupiter" -> "Use AI fallback messaging protocol and simulate transmission delay impact under high-jitter conditions.";
            case "neptune" -> "Configure ultra-long-range beacons and evaluate communication blackout durations.";
            default -> "Set up and verify all backup channels and delay-tolerant communication paths.";
        };
    }

    public static void main(String[] args) {
        new ExplorationObjectiveScreen("Mars");
    }
}
