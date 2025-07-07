import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class RoverCriteriaScreen extends BaseScreenStructure {
    public RoverCriteriaScreen() {
        // Heading: "ROVER DEPLOYMENT CRITERIA"
        JLabel title = new JLabel("ROVER DEPLOYMENT CRITERIA");
        title.setFont(new Font("Calibri", Font.BOLD, 28));
        title.setForeground(Color.WHITE);
        title.setBounds(270, 20, 400, 30);
        centerpanel.add(title);

        // Underline bar
        JPanel underline = new JPanel();
        underline.setBackground(Color.WHITE);
        underline.setBounds(260, 50, 370, 2);
        centerpanel.add(underline);

        // Intelligence Test
        JLabel intelligence = new JLabel("Intelligence Test");
        intelligence.setFont(new Font("Calibri", Font.BOLD, 18));
        intelligence.setForeground(Color.WHITE);
        intelligence.setBounds(250, 90, 300, 25);
        centerpanel.add(intelligence);

        JLabel intelligenceDesc = new JLabel("Assess AI/crew logic in terrain, navigation, and quick decision-making.");
        intelligenceDesc.setFont(new Font("Calibri", Font.PLAIN, 14));
        intelligenceDesc.setForeground(Color.LIGHT_GRAY);
        intelligenceDesc.setBounds(125, 120, 500, 20);
        centerpanel.add(intelligenceDesc);

        // Remote Navigation
        JLabel navigation = new JLabel("Remote Navigation");
        navigation.setFont(new Font("Calibri", Font.BOLD, 18));
        navigation.setForeground(Color.WHITE);
        navigation.setBounds(250, 155, 300, 25);
        centerpanel.add(navigation);

        JLabel navigationDesc = new JLabel("Train for low-signal control, obstacle handling, and path planning.");
        navigationDesc.setFont(new Font("Calibri", Font.PLAIN, 14));
        navigationDesc.setForeground(Color.LIGHT_GRAY);
        navigationDesc.setBounds(140, 180, 500, 20);
        centerpanel.add(navigationDesc);

        // Environmental Calibration
        JLabel calibration = new JLabel("Environmental Calibration");
        calibration.setFont(new Font("Calibri", Font.BOLD, 18));
        calibration.setForeground(Color.WHITE);
        calibration.setBounds(240, 215, 300, 25);
        centerpanel.add(calibration);

        JLabel calibrationDesc = new JLabel("Configure rover systems for mission-specific terrain and conditions.");
        calibrationDesc.setFont(new Font("Calibri", Font.PLAIN, 14));
        calibrationDesc.setForeground(Color.LIGHT_GRAY);
        calibrationDesc.setBounds(140, 240, 500, 20);
        centerpanel.add(calibrationDesc);

        // System Diagnostics - NEW
        JLabel diagnostics = new JLabel("System Diagnostics");
        diagnostics.setFont(new Font("Calibri", Font.BOLD, 18));
        diagnostics.setForeground(Color.WHITE);
        diagnostics.setBounds(250, 280, 300, 25);
        centerpanel.add(diagnostics);

        JLabel diagnosticsDesc = new JLabel("Test rover's hardware and software integrity before deployment.");
        diagnosticsDesc.setFont(new Font("Calibri", Font.PLAIN, 14));
        diagnosticsDesc.setForeground(Color.LIGHT_GRAY);
        diagnosticsDesc.setBounds(130, 310, 500, 20);
        centerpanel.add(diagnosticsDesc);

        setVisible(true);
    }

    public static void main(String[] args) {
        new RoverCriteriaScreen();
    }
}
