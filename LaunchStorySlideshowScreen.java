import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class LaunchStorySlideshowScreen extends BaseScreenStructure {
    private JLabel imageLabel;
    private String[] imagePaths = {
        "F:\\OwnSpaceApp\\images\\slide1.jpg", // launch pad
        "F:\\OwnSpaceApp\\images\\slide2.jpg", // launch
        "F:\\OwnSpaceApp\\images\\slide3.jpg", // mid-space
        "F:\\OwnSpaceApp\\images\\slide4.jpg"  // threat detected
    };
    private int currentSlide = 0;
    private Timer timer;

    public LaunchStorySlideshowScreen() {
        centerpanel.setLayout(null);

        imageLabel = new JLabel();
        imageLabel.setBounds(0, 0, 650, 400);
        centerpanel.add(imageLabel);

        runSlideshow();


        setVisible(true);
    }

    private void runSlideshow() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (currentSlide < imagePaths.length) {
                    ImageIcon icon = new ImageIcon(imagePaths[currentSlide]);
                    Image scaled = icon.getImage().getScaledInstance(650, 400, Image.SCALE_SMOOTH);
                    imageLabel.setIcon(new ImageIcon(scaled));
                    currentSlide++;
                } else {
                    timer.cancel();
                     dispose();
                    new EmergencyHandlingScreen();
                }
            }
        }, 0, 1300); // 3 seconds per slide
    }

    public static void main(String[] args) {
        new LaunchStorySlideshowScreen();
    }
}
