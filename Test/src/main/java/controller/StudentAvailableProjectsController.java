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
        view.getViewButton().addActionListener(new StudentAvailableProjectsController.NavigatorsListener());//dashboard
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
            } else if (e.getSource() == view.getViewButton()) {
                int selectedRow = view.getTable().getSelectedRow();
                if (selectedRow != -1) {
                    // get the value of the project ID column
                    String projectID = (String) view.getTable().getValueAt(selectedRow, 0);
                    String projectName = (String) view.getTable().getValueAt(selectedRow, 1);
                    String lecturerID = (String) view.getTable().getValueAt(selectedRow, 2);

                    view.dispose();
                    NavBarController.StudentApplyProjectsView(projectID, projectName, lecturerID);
                }
            }

        }
    }
}
