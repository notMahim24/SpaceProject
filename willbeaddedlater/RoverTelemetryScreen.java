import javax.swing.*;
import java.awt.*;

class RoverTelemetryScreen extends BaseScreenStructure {
    public RoverTelemetryScreen() {
        centerpanel.setLayout(null);

        JLabel title = new JLabel("ROVER TELEMETRY");
        title.setFont(new Font("Calibri", Font.BOLD, 24));
        title.setForeground(Color.WHITE);
        title.setBounds(220, 30, 400, 30);
        centerpanel.add(title);

        String[] data = {
            "Battery Level: 87%",
            "Core Temp: -32°C",
            "Speed: 12 km/h",
            "Signal Strength: 78%",
            "Navigation Mode: AUTO",
            "Terrain Type: Rocky"
        };

        int y = 80;
        for (String line : data) {
            JLabel label = new JLabel("• " + line);
            label.setFont(new Font("Consolas", Font.PLAIN, 16));
            label.setForeground(Color.GREEN);
            label.setBounds(80, y, 500, 25);
            centerpanel.add(label);
            y += 35;
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new RoverTelemetryScreen();
    }
}
