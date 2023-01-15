package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.LoginModel;
import view.AdminDashboardView;
import view.LecturerDashboardView;
import view.LoginView;
import view.StudentDashboardView;

public class LoginController {
    private final LoginView view;
    private final LoginModel model;
    private static LoginController singletonInstance;

    public static LoginController getInstance(LoginView view, LoginModel model){
        if(singletonInstance == null){
            singletonInstance = new LoginController(view, model);
        }
        
        return singletonInstance;
    }

    public LoginController(LoginView view2, LoginModel model) {
        this.view = view2;
        this.model = model;

        this.view.getLoginButton().addActionListener(new LoginListener());
        this.view.getExitButton().addActionListener(new ExitListener());
    }

    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userId = view.getUserId();
            String password = new String(view.getPassword()); 
            model.setUserId(userId);
            model.setPassword(password); 
            
            Boolean loginSuccess;
            loginSuccess = model.loginAuthenticate();

            
            if (loginSuccess) {
                if(userId.charAt(0) == 'A'){
                    view.dispose(); 
                    var adminDashboardview = AdminDashboardView.getInstance();
                    var adminDashboardcontroller = AdminDashboardController.getInstance(adminDashboardview);
                    adminDashboardview.setVisible(true);
                } else if(userId.charAt(0) == 'L'){
                    view.dispose();
                    var lecturerDashboardView = LecturerDashboardView.getInstance();
                    var lecturerDashboardController = LecturerDashboardController.getInstance(lecturerDashboardView);
                    lecturerDashboardView.setVisible(true);
                } else{
                    view.dispose();
                    var studentDashboardView = StudentDashboardView.getInstance();
                    var studentDashboardController = StudentDashboardController.getInstance(studentDashboardView);
                    studentDashboardView.setVisible(true);
                }
            } else {
                view.displayLoginFailureMessage();
            }
        }
    }

    class ExitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
