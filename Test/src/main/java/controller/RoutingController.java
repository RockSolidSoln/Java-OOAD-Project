package controller;

import view.*;

import model.LoginModel;
import model.Project;

public class RoutingController {
    // Users Navigation Bar: Logout
    public static void LogoutActionPerformed() {
        LoginModel model = LoginModel.getInstance(null, null);
        LoginView view = LoginView.getInstance();
        LoginController controller = LoginController.getInstance(view, model);

        view.setVisible(true);
    }

    // Admin Navigation Bar: View Project
    public static void AdminViewProjectActionPerformed() {
        AdminProjectsView view = AdminProjectsView.getInstance();
        AdminProjectsController controller = AdminProjectsController.getInstance(view);

        view.setVisible(true);
    }

    // Admin Navigation Bar: Create Account
    public static void AdminCreateAccountActionPerformed() {
        var createAccountView = AdminCreateAccountView.getInstance();
        var createAccountController = AdminCreateAccountController.getInstance(createAccountView);
        createAccountView.setVisible(true);
    }

    // Admin Navigation Bar: AdminDashBoard
    public static void AdminDashboardActionPerformed() {
        var adminDashboardview = AdminDashboardView.getInstance();
        var adminDashboardcontroller = AdminDashboardController.getInstance(adminDashboardview);
        adminDashboardcontroller.DashBoardLoader(); // To Load the Data.
        adminDashboardview.setVisible(true);
    }
    
    //Admin views a project
    public static void AdminViewProject(String projectId, String projectName, String lecturerId, String specialization, String details){
        AdminProjectDetailsView new_view = new AdminProjectDetailsView(projectId, projectName, lecturerId, specialization, details);
        AdminProjectDetailsController controller = new AdminProjectDetailsController(new_view);
        new_view.setVisible(true);
    }

    //Admin
    public static void AdminViewReport(){
        var adminView = AdminReportView.getInstance();
        var controller = AdminReportController.getInstance(adminView);
        adminView.setVisible(true);
    }


    //Lectured Dashboard
    public static void LecturerDashboardActionPerformed() {
        var lecturerDashboardView = LecturerDashboardView.getInstance();
        var lecturerDashboardController = LecturerDashboardController.getInstance(lecturerDashboardView);
        lecturerDashboardController.DashboardLoader(); // To Load the Data.
        lecturerDashboardView.setVisible(true);
    }

    // Lecturer Navigation Bar: LecturerProjectsView
    public static void LecturerProjectsViewActionPerformed() {
        var lecturerProjectsView = LecturerProjectsView.getInstance();
        var lecturerProjectsController = LecturerProjectsController.getInstance(lecturerProjectsView);
        lecturerProjectsController.ProjectTableLoader();
        lecturerProjectsView.setVisible(true);
    }

    // Lecturer / Admin : Create Project
    public static void CreateProjectActionPerformed() {
        var createProjectView = AdminAndLecturerCreateProjectView.getInstance();
        var projectModel = Project.getInstance(null,null, null, null, null, null);
        var createProjectController = AdminAndLecturerCreateProjectController.getInstance(createProjectView, projectModel);
        createProjectView.setVisible(true);
    }

    //Lecturer: View Specific project
    public static void ViewLecturerProjectDetails(String projectID, String projectName, String specialization, String status){
        
        var lecturerProjectDetailsView= LecturerProjectDetailsView.getInstance(projectID, projectName, specialization, status);
        var lecturerProjectsDetailsController = LecturerProjectsDetailsController.getInstance(lecturerProjectDetailsView);

        lecturerProjectDetailsView.setVisible(true);
    }


    // Lecturer: View Applying student list
    public static void ViewApplyingStudentListPerformed(String projectId){
        LecturerApplicationView new_view = LecturerApplicationView.getInstance();
        LecturerApplicationController controller  = LecturerApplicationController.getInstance(new_view, projectId);
        new_view.setVisible(true);
    }

    //Lecturer: Modify Project
    public static void LecturerModifyProject(String projectId, String projectName, String projectDescription, String projectSpecialization){
        var modifyProjectView = new LecturerModifyProjectView(projectId, projectName, projectDescription, projectSpecialization);
        var modifyProjectController = new LecturerModifyProjectController(modifyProjectView);

        modifyProjectView.setVisible(true);
    }


    //Student: View dashboard
    public static void StudentDashboardView(){
        var studentDashboardView = StudentDashboardView.getInstance();
        var studentDashboardController = StudentDashboardController.getInstance(studentDashboardView);
        studentDashboardController.DashboardLoader(); // To load the data
        studentDashboardView.setVisible(true);
    }

    //Student: View his project details
    public static void StudentProjectDetailsView(){
        var studentProjectDetailsView = StudentProjectDetailsView.getInstance();
        var studentProjectDetailsController = StudentProjectDetailsController.getInstance(studentProjectDetailsView);
        studentProjectDetailsView.setVisible(true);
    }

    //Student: View Available Projects
    public static void StudentAvailableProjectsView(){
        var studentAvailableProjectsView = StudentAvailableProjectsView.getInstance();
        var studentAvailableProjectsController = StudentAvailableProjectsController.getInstance(studentAvailableProjectsView);
        studentAvailableProjectsView.setVisible(true);
    }

    //Student: Apply for a project
    public static void StudentApplyProjectsView(String projectId, String projectName, String lecturerId){
        var studentApplyProjectsView = StudentApplyProjectView.getInstance(projectId, projectName, lecturerId);
        var studentApplyProjectsController = StudentApplyProjectController.getInstance(studentApplyProjectsView);
        studentApplyProjectsView.setVisible(true);
    }




}
