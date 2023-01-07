package controller;

import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.LoginModel;
import view.LoginView;

public class LoginController {
    private LoginView view;
    private LoginModel model;

    public LoginController(LoginView view2, LoginModel model) {
        this.view = view2;
        this.model = model;

        this.view.getLoginButton().addActionListener(new LoginListener());
        this.view.getExitButton().addActionListener(new ExitListener());
    }

    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String username = view.getUsername();
            char[] password = view.getPassword();

            model.setUsername(username);
            model.setPassword(password);

            // Perform login action here (e.g. check against database)
            // For now, just display the entered username and password
            JOptionPane.showMessageDialog(null, "Username: " + model.getUsername() + "\nPassword: " + String.valueOf(model.getPassword()));
        }
    }

    class ExitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
