package controller;

import view.StudentApplyProjectView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ApplicationModel;
import model.LoginModel;
import model.Student;

/**
 *
 * @author tanzir
 */
public class StudentApplyProjectController {
    private static StudentApplyProjectController singletonInstance;
    private static StudentApplyProjectView view;

    public StudentApplyProjectController(StudentApplyProjectView view) {
        StudentApplyProjectController.view = view;
        view.getBackButton().addActionListener((ActionListener) new NavigatorsListener());// view my project
        view.getApplyButton().addActionListener((ActionListener) new NavigatorsListener());// apply for a project
    }

    public static StudentApplyProjectController getInstance(StudentApplyProjectView view) {
        if (singletonInstance == null) {
            singletonInstance = new StudentApplyProjectController(view);
        }
        return singletonInstance;
    }

    static class NavigatorsListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getBackButton()) {
                view.dispose();
                RoutingController.StudentAvailableProjectsViewActionPerformed();
            } else if (e.getSource() == view.getApplyButton()) {
                Student student = Student.getDetailsInstance(LoginModel.getUserId());
                ApplicationModel applicationModel = ApplicationModel.getInstance(view.getProjectId(), student.getUsername(), student.getName());
                applicationModel.StoreDetails();
                view.displayMessage();
                view.dispose();
                RoutingController.StudentAvailableProjectsViewActionPerformed();
            }

        }
    }
}