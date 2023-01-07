package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.LoginModel;
import view.AdminDashboardView;
import view.LoginView;

public class LoginController {
    private final LoginView view;
    private final LoginModel model;

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

            String passwords = new String(password);
            Boolean loginSuccess;
            loginSuccess = model.loginAuthenticate(username, passwords);
            if (loginSuccess) {
                view.displayLoginSuccessMessage();
                System.out.println("Succeful login Habibi");
                if(username.charAt(0) == 'A'){
                    view.dispose();
                    AdminDashboardView adminDashboardview = AdminDashboardView.getInstance();
                    AdminDashboardController adminDashboardcontroller = AdminDashboardController.getInstance(adminDashboardview);
                    adminDashboardview.setVisible(true);
                }
            } else {
                view.displayLoginFailureMessage();
            }
        }
    }

    static class ExitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
