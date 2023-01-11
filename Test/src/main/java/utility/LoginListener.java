package utility;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.AdminDashboardController;
import model.LoginModel;
import view.AdminDashboardView;
import view.LoginView;

public class LoginListener implements ActionListener {
    LoginView view; 
    public LoginListener(LoginView view){
        this.view = view;
    }
    public void actionPerformed(ActionEvent e) {
        String username = view.getUsername();
        char[] password = view.getPassword();
        
        String passwords = new String(password);
        LoginModel loginModel = LoginModel.getInstance(username, passwords);

        Boolean loginSuccess;
        loginSuccess = loginModel.loginAuthenticate();
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

