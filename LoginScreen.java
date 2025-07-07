import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import modfiles.ButtonStyle;
import modfiles.HoverEffectOnButton;

public class LoginScreen extends BaseScreenStructure {

    public LoginScreen() {

        JLabel heading = new JLabel("COMMANDER LOGIN");
        heading.setFont(new Font("Calibri", Font.BOLD, 35));
        heading.setForeground(Color.WHITE);
        heading.setBounds(180, 50, 400, 100);
        centerpanel.add(heading);
        
        JLabel userLabel = new JLabel("Username:");
        userLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
        userLabel.setForeground(Color.WHITE);
        userLabel.setBounds(150, 160, 100, 25);
        centerpanel.add(userLabel);
        
        JTextField usernameField = new JTextField();
        usernameField.setBounds(260, 160, 250, 25);
        centerpanel.add(usernameField);
        
        JLabel passLabel = new JLabel("Password:");
        passLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
        passLabel.setForeground(Color.WHITE);
        passLabel.setBounds(150, 210, 100, 25);
        centerpanel.add(passLabel);
        
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(260, 210, 250, 25);
        centerpanel.add(passwordField);
        
        JButton okButton = new JButton("OK");
        ButtonStyle.setstyle(okButton);
        okButton.setBorder(new LineBorder(Color.WHITE,2,true));
        okButton.setBounds(300, 270, 80, 30);
        new HoverEffectOnButton(okButton);
        centerpanel.add(okButton);

        
        okButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        boolean isAuthenticated = DBHelper.authenticate(username, password);
        if (isAuthenticated) {
           // JOptionPane.showMessageDialog(null, "Login Successful!");
            dispose();
            new VerifyScreen();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }
});

        

        JButton auth = new JButton("^~~^");
        auth.setForeground(Color.WHITE);
        auth.setBackground(Color.BLACK);
        auth.setBounds(520, 364, 30, 20);
        auth.setFocusPainted(false);
        auth.setBorder(new EmptyBorder(0,0,0,0));
        centerpanel.add(auth);

        auth.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               dispose();
               new SignupScreen();
            }
            
        });


        JLabel gotos = new JLabel("Not Authorized?...AUTHORIZATION FORM");
        gotos.setFont(new Font("Calibri", Font.ITALIC, 17));
        gotos.setForeground(Color.WHITE);
        gotos.setBounds(210, 360, 300, 30);
        centerpanel.add(gotos);
        
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new LoginScreen();











    }
}
