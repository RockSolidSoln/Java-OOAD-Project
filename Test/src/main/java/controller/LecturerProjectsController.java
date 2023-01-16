package controller;

import view.AdminDashboardView;
import view.LecturerProjectsView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Objects;

public class LecturerProjectsController {
    private static LecturerProjectsController singletonInstance;
    private static LecturerProjectsView view;

    public LecturerProjectsController(LecturerProjectsView view) {
        LecturerProjectsController.view = view;

        view.getButton1().addActionListener(new LecturerProjectsController.NavigatorsListener());
        view.getButton2().addActionListener(new LecturerProjectsController.NavigatorsListener());
        view.getButton3().addActionListener(new LecturerProjectsController.NavigatorsListener());
        view.getButton4().addActionListener(new LecturerProjectsController.NavigatorsListener());
        view.getViewButton().addActionListener(new LecturerProjectsController.NavigatorsListener());
    }

    public static LecturerProjectsController getInstance(LecturerProjectsView view) {
        if (singletonInstance == null) {
            singletonInstance = new LecturerProjectsController(view);
        }
        return singletonInstance;
    }

    static class NavigatorsListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) { // Create Account Button Pressed
                view.dispose();
//                NavBarController.AdminCreateAccountActionPerformed(e);
            } else if (e.getSource() == view.getButton2()) { // View Report Button Pressed
                view.dispose();
//                NavBarController.AdminViewReportActionPerformed(e);
            } else if (e.getSource() == view.getButton3()) { // Logout Button Pressed
                view.dispose();
                NavBarController.LogoutActionPerformed(e);
            } else if (e.getSource() == view.getButton4()) { // View Project Button Pressed
                view.dispose();
//                NavBarController.AdminViewProjectActionPerformed(e);
            } else if (e.getSource() == view.getViewButton()) { // Dashboard Button Pressed
//                view.dispose();
//                NavBarController.AdminDashboardActionPerformed(e);
            }

        }
    }

}
