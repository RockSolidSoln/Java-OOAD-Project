package controller;

import view.StudentAvailableProjectsView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentAvailableProjectsController {
    private static StudentAvailableProjectsController singletonInstance;
    private static StudentAvailableProjectsView view;

    public StudentAvailableProjectsController(StudentAvailableProjectsView view) {
        StudentAvailableProjectsController.view = view;
        view.getButton1().addActionListener(new StudentAvailableProjectsController.NavigatorsListener());//view my project
        view.getButton2().addActionListener(new StudentAvailableProjectsController.NavigatorsListener());//logout
        view.getButton3().addActionListener(new StudentAvailableProjectsController.NavigatorsListener());//dashboard
    }

    public static StudentAvailableProjectsController getInstance(StudentAvailableProjectsView view) {
        if (singletonInstance == null) {
            singletonInstance = new StudentAvailableProjectsController(view);
        }
        return singletonInstance;
    }

    static class NavigatorsListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) {
                view.dispose();
                NavBarController.StudentProjectDetailsView();
            } else if (e.getSource() == view.getButton2()) {
                view.dispose();
                NavBarController.LogoutActionPerformed();
            } else if (e.getSource() == view.getButton3()) {
                view.dispose();
                NavBarController.StudentDashboardView();
            }
        }
    }
}
