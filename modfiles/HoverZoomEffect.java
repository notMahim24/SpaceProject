package modfiles;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HoverZoomEffect {
    public HoverZoomEffect(JButton button, ImageIcon originalIcon, int normalSize, int zoomSize) {
        Image originalImg = originalIcon.getImage();
        ImageIcon zoomedIcon = new ImageIcon(originalImg.getScaledInstance(zoomSize, zoomSize, Image.SCALE_SMOOTH));

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBounds(button.getX() - (zoomSize - normalSize) / 2,
                                 button.getY() - (zoomSize - normalSize) / 2,
                                 zoomSize, zoomSize);
                button.setIcon(zoomedIcon);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBounds(button.getX() + (zoomSize - normalSize) / 2,
                                 button.getY() + (zoomSize - normalSize) / 2,
                                 normalSize, normalSize);
                button.setIcon(originalIcon);
            }
        });
    }
}
