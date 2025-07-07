import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class ExpCrieteriaScreen extends BaseScreenStructure{
    public ExpCrieteriaScreen(){
        // Heading: "EXPLORATION CRITERIA"
        JLabel title = new JLabel("EXPLORATION CRITERIA");
        title.setFont(new Font("Calibri", Font.BOLD, 28));
        title.setForeground(Color.WHITE);
        title.setBounds(330, 20, 300, 30);
        centerpanel.add(title);

        // Underline bar
        JPanel underline = new JPanel();
        underline.setBackground(Color.WHITE);
        underline.setBounds(320, 50, 300, 2); // Adjust width to match title
        centerpanel.add(underline);

        // Minor heading: Training Module
        JLabel training = new JLabel("Training Module");
        training.setFont(new Font("Calibri", Font.BOLD,18));
        training.setForeground(Color.WHITE);
        training.setBounds(240, 70, 300, 25);
        centerpanel.add(training);

        JLabel trainingDesc = new JLabel("Simulate mission conditions for crew or AI:survival, emergencies, and ship systems.");
        trainingDesc.setFont(new Font("Calibri", Font.PLAIN, 14));
        trainingDesc.setForeground(Color.LIGHT_GRAY);
        trainingDesc.setBounds(80, 100, 500, 20);
        centerpanel.add(trainingDesc);

        // Minor heading: Fuel & Resource Planning
        JLabel fuel = new JLabel("Fuel & Resource Planning");
        fuel.setFont(new Font("Calibri", Font.BOLD, 18));
        fuel.setForeground(Color.WHITE);
        fuel.setBounds(200, 135, 300, 25);
        centerpanel.add(fuel);

        JLabel fuelDesc = new JLabel("Manage fuel, oxygen, water, and power to balance efficiency and survival.");
        fuelDesc.setFont(new Font("Calibri", Font.PLAIN, 14));
        fuelDesc.setForeground(Color.LIGHT_GRAY);
        fuelDesc.setBounds(90, 165, 500, 20);
        centerpanel.add(fuelDesc);

        // Minor heading: Environmental Suit Compatibility
        JLabel suit = new JLabel("Environmental Suit Compatibility");
        suit.setFont(new Font("Calibri", Font.BOLD, 18));
        suit.setForeground(Color.WHITE);
        suit.setBounds(200, 195, 300, 25);
        centerpanel.add(suit);

        JLabel suitDesc = new JLabel("Equip suits for planetary conditions:pressure, radiation, and terrain.");
        suitDesc.setFont(new Font("Calibri", Font.PLAIN, 14));
        suitDesc.setForeground(Color.LIGHT_GRAY);
        suitDesc.setBounds(100, 230, 380, 20);
        centerpanel.add(suitDesc);

        // Minor heading: Communication Protocols
        JLabel comms = new JLabel("Communication Protocols");
        comms.setFont(new Font("Calibri", Font.BOLD, 18));
        comms.setForeground(Color.WHITE);
        comms.setBounds(200, 270, 300, 25);
        centerpanel.add(comms);

        JLabel commsDesc = new JLabel("Configure long-range comms with delay handling and manual fallback options.");
        commsDesc.setFont(new Font("Calibri", Font.PLAIN, 14));
        commsDesc.setForeground(Color.LIGHT_GRAY);
        commsDesc.setBounds(80, 290, 480, 40);
        centerpanel.add(commsDesc);

        setVisible(true);

    }

    public static void main(String[] args) {
        new ExpCrieteriaScreen();
    }
}
