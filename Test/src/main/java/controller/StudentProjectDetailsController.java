package controller;

import view.StudentProjectDetailsView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.LoginModel;
import model.Project;
/**
 *
 * @author salah
 */
public class StudentProjectDetailsController {
    private static StudentProjectDetailsController singletonInstance;
    private static StudentProjectDetailsView view;

    public StudentProjectDetailsController(StudentProjectDetailsView view) {
        StudentProjectDetailsController.view = view;
        view.getBackButton().addActionListener((ActionListener) new NavigatorsListener());//view my project
        
        Project projectModel = Project.getProjectInstanceFromStudent(LoginModel.getUserId());
        view.getProjectName().setText(projectModel.getProjectName());
        view.getSpecialization().setText(projectModel.getSpecialization());
        view.getDetails().setText(projectModel.getDescription());
    }



    public static StudentProjectDetailsController getInstance(StudentProjectDetailsView view) {
        if (singletonInstance == null) {
            singletonInstance = new StudentProjectDetailsController(view);
        }
        return singletonInstance;
    }
    static class NavigatorsListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getBackButton()) {
                view.dispose();
                RoutingController.StudentDashboardView();
            }
        }
    }
}
