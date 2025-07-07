import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;


public class ZeroGravityTrainingScreen extends BaseScreenStructure {
    private int questionIndex = 0;
    private int score = 0;

    private JLabel promptLabel;
    private JButton[] optionButtons = new JButton[3];
    private String[][] questions = {
        {
            "A wrench is drifting toward the airlock controls! What do you do?",
            "Grab it with your gloved hand.",
            "Kick off the wall to reach it faster.",
            "Let it drift — it won’t harm anything.",
            "0" // correct index
        },
        {
            "You're spinning uncontrollably after pushing off a surface. Which stance helps stabilize?",
            "Tuck into a ball",
            "Stretch arms out",
            "Hold your breath",
            "0"
        },
        {
            "Which item helps you fix an oxygen valve breach?",
            "Screwdriver",
            "Wrench",
            "Gloves",
            "0"
        }
    };

    public ZeroGravityTrainingScreen() {
        centerpanel.setLayout(null);

        JLabel title = new JLabel("ZERO-G TRAINING SIMULATION");
        title.setFont(new Font("Consolas", Font.BOLD, 24));
        title.setForeground(Color.WHITE);
        title.setBounds(150, 20, 400, 30);
        centerpanel.add(title);

        promptLabel = new JLabel("", SwingConstants.CENTER);
        promptLabel.setFont(new Font("Calibri", Font.PLAIN, 16));
        promptLabel.setForeground(Color.LIGHT_GRAY);
        promptLabel.setBounds(30, 80, 590, 60);
        centerpanel.add(promptLabel);

        int btnY = 170;
        for (int i = 0; i < optionButtons.length; i++) {
            JButton btn = new JButton();
            btn.setBounds(100, btnY + i * 60, 450, 40);
            btn.setBackground(Color.BLACK);
            btn.setForeground(Color.WHITE);
            btn.setFont(new Font("SansSerif", Font.PLAIN, 16));
            btn.setBorder(new LineBorder(Color.WHITE));
            btn.setFocusPainted(false);
            int finalI = i;
            btn.addActionListener(e -> checkAnswer(finalI));
            optionButtons[i] = btn;
            centerpanel.add(btn);
        }

        loadQuestion();

        setVisible(true);
    }

    void loadQuestion() {
        if (questionIndex >= questions.length) {
            showResult();
            return;
        }

        String[] q = questions[questionIndex];
        promptLabel.setText("<html><div style='text-align:center;'>" + q[0] + "</div></html>");
        for (int i = 0; i < 3; i++) {
            optionButtons[i].setText(q[i + 1]);
            optionButtons[i].setEnabled(true);
        }
    }

    void checkAnswer(int selected) {
        String correct = questions[questionIndex][4];
        if (Integer.toString(selected).equals(correct)) {
            score++;
        }
        questionIndex++;
        loadQuestion();
    }

    void showResult() {
        JOptionPane.showMessageDialog(this,
                "Training Complete! Your Score: " + score + "/" + questions.length,
                "Mission Debrief",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
        new MissionReadyLogScreen(); 
    }

    public static void main(String[] args) {
        new ZeroGravityTrainingScreen();
    }
}
