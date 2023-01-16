package controller;

import view.LecturerProjectsDetailsView;
import view.LecturerProjectsView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LecturerProjectsDetailsController {
    private static LecturerProjectsDetailsController singletonInstance;
    private static LecturerProjectsDetailsView view;

    public LecturerProjectsDetailsController(LecturerProjectsDetailsView view) {
        LecturerProjectsDetailsController.view = view;

        view.getActivateDeactivateButton().addActionListener(new LecturerProjectsDetailsController.NavigatorsListener());
        view.getBackButton().addActionListener(new LecturerProjectsDetailsController.NavigatorsListener());
        view.getUnassignButton().addActionListener(new LecturerProjectsDetailsController.NavigatorsListener());
        view.getModifyButton().addActionListener(new LecturerProjectsDetailsController.NavigatorsListener());
        view.getApplyingListButton().addActionListener(new LecturerProjectsDetailsController.NavigatorsListener());
    }

    public static LecturerProjectsDetailsController getInstance(LecturerProjectsDetailsView view) {
        if (singletonInstance == null) {
            singletonInstance = new LecturerProjectsDetailsController(view);
        }
        return singletonInstance;
    }

    static class NavigatorsListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getActivateDeactivateButton()) { // Create Account Button Pressed
                view.dispose();
//                NavBarController.AdminCreateAccountActionPerformed(e);
            } else if (e.getSource() == view.getBackButton()) { // View Report Button Pressed
                view.dispose();
//                NavBarController.AdminViewReportActionPerformed(e);
            } else if (e.getSource() == view.getUnassignButton()) { // Logout Button Pressed
                view.dispose();
            } else if (e.getSource() == view.getModifyButton()) { // View Project Button Pressed
                view.dispose();
//                NavBarController.AdminViewProjectActionPerformed(e);
            } else if (e.getSource() == view.getApplyingListButton()) { // Dashboard Button Pressed
//                view.dispose();
//                NavBarController.AdminDashboardActionPerformed(e);
            }

        }
    }

}
