package controller;

import view.StudentProjectDetailsView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentProjectDetailsController {
    private static StudentProjectDetailsController singletonInstance;
    private static StudentProjectDetailsView view;

    public StudentProjectDetailsController(StudentProjectDetailsView view) {
        StudentProjectDetailsController.view = view;
        view.getBackButton().addActionListener((ActionListener) new NavigatorsListener());//view my project
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
                NavBarController.StudentDashboardView();
            }
        }
    }
}
