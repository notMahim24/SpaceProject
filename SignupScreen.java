import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

import modfiles.ButtonStyle;
import modfiles.HoverEffectOnButton;

public class SignupScreen extends BaseScreenStructure {

    public SignupScreen() {

        JLabel heading = new JLabel("AUTHORIZATION FORM");
        heading.setFont(new Font("Calibri", Font.BOLD, 32));
        heading.setForeground(Color.WHITE);
        heading.setBounds(180, 60, 400, 50);
        centerpanel.add(heading);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
        userLabel.setForeground(Color.WHITE);
        userLabel.setBounds(130, 130, 100, 25);
        centerpanel.add(userLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(280, 130, 250, 25);
        centerpanel.add(usernameField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
        emailLabel.setForeground(Color.WHITE);
        emailLabel.setBounds(130, 170, 100, 25);
        centerpanel.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(280, 170, 250, 25);
        centerpanel.add(emailField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
        passLabel.setForeground(Color.WHITE);
        passLabel.setBounds(130, 210, 100, 25);
        centerpanel.add(passLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(280, 210, 250, 25);
        centerpanel.add(passwordField);

        JLabel confirmPassLabel = new JLabel("Confirm Password:");
        confirmPassLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
        confirmPassLabel.setForeground(Color.WHITE);
        confirmPassLabel.setBounds(130, 250, 150, 25);
        centerpanel.add(confirmPassLabel);

        JPasswordField confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(280, 250, 250, 25);
        centerpanel.add(confirmPasswordField);

        JButton submitButton = new JButton("SUBMIT");
        ButtonStyle.setstyle(submitButton);
        submitButton.setBorder(new LineBorder(Color.WHITE, 2, true));
        submitButton.setBounds(290, 330, 100, 30);
        new HoverEffectOnButton(submitButton);
        centerpanel.add(submitButton);

        submitButton.addActionListener(e -> {
        String username = usernameField.getText().trim();
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        // Validate inputs
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (password.length() < 4) {  // example password length check
            JOptionPane.showMessageDialog(null, "Password must be at least 4 characters long.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // If all validations pass, try to insert user into DB
        boolean success = DBHelper.insertUser(username, email, password);

        if (success) {
            JOptionPane.showMessageDialog(null, "Registration successful! You may now login.");
            dispose();
            new LoginScreen();
        } else {
            JOptionPane.showMessageDialog(null, "Registration failed. Username or email might already exist.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        
        });


        setVisible(true);
    }

    public static void main(String[] args) {
        new SignupScreen();
    }
}
