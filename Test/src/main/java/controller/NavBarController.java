package controller;

import view.AdminDashboardView;
import view.AdminProjectsView;
import view.CreateAccountView;
import view.LoginView;

import java.awt.event.ActionEvent;
import java.io.IOException;

import model.LoginModel;

public class NavBarController {

    //Admin Navigation Bar: View Project
    public static void AdminViewProjectActionPerformed(ActionEvent e) {
        AdminProjectsView view = AdminProjectsView.getInstance();
        AdminProjectsController controller = AdminProjectsController.getInstance(view);

        view.setVisible(true);
    }

    //Admin Navigation Bar: View Report
    public static void AdminViewReportActionPerformed(ActionEvent e) {

    }

    //Admin Navigation Bar: Logout
    public static void AdminLogoutActionPerformed(ActionEvent e) {
        LoginModel model = LoginModel.getInstance(null, null);
        LoginView view = LoginView.getInstance(); 
        LoginController controller = LoginController.getInstance(view, model);

        view.setVisible(true);
    }

    //Admin Navigation Bar: Create Account
    public static void AdminCreateAccountActionPerformed(ActionEvent e) {
        var createAccountView = CreateAccountView.getInstance();
        var createAccountController = CreateAccountController.getInstance(createAccountView);
        createAccountView.setVisible(true);
    }

    ////Admin Navigation Bar: DashBoard
    public static void AdminDashboardActionPerformed(ActionEvent e) {

    }

}
