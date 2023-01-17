package controller;

import view.AdminDashboardView;
import view.AdminProjectsView;
import view.CreateAccountView;
import view.LecturerProjectsView;
import view.LoginView;

import java.awt.event.ActionEvent;
import java.io.IOException;

import model.LoginModel;

public class NavBarController {
    // Users Navigation Bar: Logout
    public static void LogoutActionPerformed(ActionEvent e) {
        LoginModel model = LoginModel.getInstance(null, null);
        LoginView view = LoginView.getInstance();
        LoginController controller = LoginController.getInstance(view, model);

        view.setVisible(true);
    }

    // Admin Navigation Bar: View Project
    public static void AdminViewProjectActionPerformed(ActionEvent e) {
        AdminProjectsView view = AdminProjectsView.getInstance();
        AdminProjectsController controller = AdminProjectsController.getInstance(view);

        view.setVisible(true);
    }

    // Admin Navigation Bar: View Report
    public static void AdminViewReportActionPerformed(ActionEvent e) {

    }

    // Admin Navigation Bar: Create Account
    public static void AdminCreateAccountActionPerformed(ActionEvent e) {
        var createAccountView = CreateAccountView.getInstance();
        var createAccountController = CreateAccountController.getInstance(createAccountView);
        createAccountView.setVisible(true);
    }

    // Admin Navigation Bar: AdminDashBoard
    public static void AdminDashboardActionPerformed(ActionEvent e) {
        var adminDashboardview = AdminDashboardView.getInstance();
        var adminDashboardcontroller = AdminDashboardController.getInstance(adminDashboardview);
        adminDashboardview.setVisible(true);
    }

    // Lecturer Navigation Bar: LecturerProjectsView
    public static void LecturerProjectsViewActionPerformed(ActionEvent e) {
        var lecturerProjectsView = new LecturerProjectsView();
        var lecturerProjectsController = new LecturerProjectsController(lecturerProjectsView);
        lecturerProjectsView.setVisible(true);
    }

    // Lecturer Navigation Bar: LecturerCreateProject
    public static void LecturerCreateProjectActionPerformed(ActionEvent e) {
        var lectureProjectsView = new LecturerProjectsView();
        var lectureProjectsController = new LecturerProjectsController(lectureProjectsView);
        lectureProjectsView.setVisible(true);
    }

    

}
