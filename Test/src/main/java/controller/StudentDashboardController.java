package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Objects;

import model.Database;
import model.LoginModel;
import model.Student;
import view.StudentDashboardView;

public class StudentDashboardController {

    private static StudentDashboardController singletonInstance;
    private static StudentDashboardView view;

    public static StudentDashboardController getInstance(StudentDashboardView view) {
        if (singletonInstance == null) {
            singletonInstance = new StudentDashboardController(view);
        }
        return singletonInstance;
    }

    public StudentDashboardController(StudentDashboardView view) {
        StudentDashboardController.view = view;

        view.getButton1().addActionListener(new NavigatorsListener());// view my project
        view.getButton2().addActionListener(new NavigatorsListener());// logout
        view.getButton3().addActionListener(new NavigatorsListener());// view active and sp projects
        view.getButton4().addActionListener(new NavigatorsListener());// dashboard, active

    }
    public void DashboardLoader(){
        Student student = Student.getDetailsInstance(LoginModel.getUserId());
        view.getNameField().setText(student.getName());
        view.getEmailField().setText(student.getEmail());
        view.getSpecializationField().setText(student.getSpecialization());
        view.getIDField().setText(student.getUsername());
        view.getNavNameField().setText(student.getUsername());
    }

    static class NavigatorsListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) {
                RoutingController.StudentProjectDetailsView();
            } else if (e.getSource() == view.getButton2()) {
                view.dispose();
                RoutingController.LogoutActionPerformed();
            } else if (e.getSource() == view.getButton3()) {
                view.dispose();
                RoutingController.StudentAvailableProjectsView();
            }
        }
    }

}
