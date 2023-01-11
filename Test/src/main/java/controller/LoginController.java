package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utility.LoginListener;
import model.LoginModel;
import view.LoginView;

public class LoginController {
    private final LoginView view;
    private final LoginModel model;

    public LoginController(LoginView view, LoginModel model) {
        this.view = view;
        this.model = model;

        this.view.getLoginButton().addActionListener(new LoginListener(view));
        this.view.getExitButton().addActionListener(new ExitListener());
    }
    public class ExitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    
}
