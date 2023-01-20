package controller;

import view.LecturerApplicationView;
import view.LecturerProjectDetailsView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Project;

public class LecturerProjectsDetailsController {
    private static LecturerProjectsDetailsController singletonInstance;
    private static LecturerProjectDetailsView view;

    public LecturerProjectsDetailsController(LecturerProjectDetailsView view) {
        LecturerProjectsDetailsController.view = view;

        view.getActivateDeactivateButton().addActionListener(new LecturerProjectsDetailsController.NavigatorsListener());
        view.getBackButton().addActionListener(new LecturerProjectsDetailsController.NavigatorsListener());
        view.getUnassignButton().addActionListener(new LecturerProjectsDetailsController.NavigatorsListener());
        view.getModifyButton().addActionListener(new LecturerProjectsDetailsController.NavigatorsListener());
        view.getApplyingListButton().addActionListener(new LecturerProjectsDetailsController.NavigatorsListener());
    }

    public static LecturerProjectsDetailsController getInstance(LecturerProjectDetailsView view) {
        if (singletonInstance == null) {
            singletonInstance = new LecturerProjectsDetailsController(view);
        }
        return singletonInstance;
    }

    static class NavigatorsListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getActivateDeactivateButton()) {
                Project projectModel = Project.getInstance(null, null, null, null, null, null);
                String ChangedStatus = projectModel.ChangeActiveStatus(view.getProjectId());
                view.displaySuccessMessage(ChangedStatus);
                view.dispose();
                NavBarController.LecturerProjectsViewActionPerformed();
            } else if (e.getSource() == view.getBackButton()) {
                view.dispose();
                NavBarController.LecturerProjectsViewActionPerformed();
            } else if (e.getSource() == view.getUnassignButton()) {
                view.dispose();
            } else if (e.getSource() == view.getModifyButton()) {
                
                view.dispose();
//
            } else if (e.getSource() == view.getApplyingListButton()) {
                NavBarController.ViewApplyingStudentListPerformed(view.getProjectId());
                view.dispose();
            }

        }
    }

}
