package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.LoginModel;
import view.*;
/**
 *
 * @author
 */
public class LoginController {
    private final LoginView view;
    private final LoginModel model;
    private static LoginController singletonInstance;

    public static LoginController getInstance(LoginView view, LoginModel model) {
        if (singletonInstance == null) {
            singletonInstance = new LoginController(view, model);
        }

        return singletonInstance;
    }

    public LoginController(LoginView view2, LoginModel model) {
        this.view = view2;
        this.model = model;

        this.view.getLoginButton().addActionListener(new LoginListener());
        this.view.getExitButton().addActionListener(new ExitListener());
        this.view.getUserIdField().addKeyListener(new EnterListener());
        this.view.getPasswordField().addKeyListener(new EnterListener());
    }

    // Getting the needed data to
    public void submitButton() {
        String userId = view.getUserId();
        String password = new String(view.getPassword());
        model.setUserId(userId);
        model.setPassword(password);

      
        Boolean loginSuccess;
        loginSuccess = model.loginAuthenticate();

        // Redirecting Users after successful login based on account type to thier
        // respective dashboard
        if (loginSuccess) {
            if (userId.charAt(0) == 'A') {
                view.dispose();
                RoutingController.AdminDashboardActionPerformed();
            } else if (userId.charAt(0) == 'L') {
                view.dispose();
                RoutingController.LecturerDashboardActionPerformed();
            } else {
                view.dispose();
                RoutingController.StudentDashboardView();
            }
        } else {
            view.displayLoginFailureMessage();
        }
    }

    /*IF enter is pressed on the keyboard this button is activated*/
    class EnterListener implements KeyListener {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                System.out.println("enter pressed");
                if (view.getUserId() != null && view.getPassword() != null) {
                    submitButton();
                }
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
    /*checking if the userid and password are not null */
    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (view.getUserId() != null && view.getPassword() != null) {
                submitButton();
            }
        }
    }
           
    class ExitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
