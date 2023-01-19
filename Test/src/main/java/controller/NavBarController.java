package controller;

import view.*;

import java.awt.event.ActionEvent;
import java.io.IOException;

import model.LoginModel;
import model.Project;

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

    public static void LecturerDashboardActionPerformed(ActionEvent e) {
        var lecturerDashboardView = LecturerDashboardView.getInstance();
        var lecturerDashboardController = LecturerDashboardController.getInstance(lecturerDashboardView);
        lecturerDashboardView.setVisible(true);
    }

    // Lecturer Navigation Bar: LecturerProjectsView
    public static void LecturerProjectsViewActionPerformed(ActionEvent e) {
        var lecturerProjectsView = LecturerProjectsView.getInstance();
        var lecturerProjectsController = LecturerProjectsController.getInstance(lecturerProjectsView);
        lecturerProjectsView.setVisible(true);
    }

    // Lecturer / Admin : Create Project
    public static void CreateProjectActionPerformed(ActionEvent e) {
        var createProjectView = CreateProjectView.getInstance();
        var projectModel = Project.getInstance(null,null, null, null, null, null);
        var createProjectController = CreateProjectController.getInstance(createProjectView, projectModel);
        createProjectView.setVisible(true);
    }

    //Lecturer: View Specific project
    public static void ViewLecturerProjectDetails(String projectID, String projectName, String specialization, String status){
        LecturerProjectDetailsView new_view = new LecturerProjectDetailsView(projectID, projectName, specialization, status);
        LecturerProjectsDetailsController controller = new LecturerProjectsDetailsController(new_view);

        new_view.setVisible(true);
    }


    // Lecturer: View Applying student list
    public static void ViewApplyingStudentListPerformed(String projectId){
        ApplyingStudentView new_view = ApplyingStudentView.getInstance();
        ApplyingStudentController controller  = ApplyingStudentController.getInstance(new_view, projectId);
        new_view.setVisible(true);
    }

    

}
