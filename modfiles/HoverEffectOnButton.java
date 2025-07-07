package modfiles;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class HoverEffectOnButton {

    private final Color originalBg;
    private final Color originalFg;

    public HoverEffectOnButton(JButton button) {
        // Save original colors
        originalBg = button.getBackground();
        originalFg = button.getForeground();

        // Add mouse listener for hover effect
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(Color.WHITE);
                button.setForeground(Color.BLACK);
                button.setFocusPainted(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(originalBg);
                button.setForeground(originalFg);
            }
        });
    }
}
