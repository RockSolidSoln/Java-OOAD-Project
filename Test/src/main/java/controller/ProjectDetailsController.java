package controller;

import view.ProjectDetailsView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectDetailsController {
    private static ProjectDetailsView view = null;
    private static ProjectDetailsController singletonInstance;

    public ProjectDetailsController(ProjectDetailsView view) {
        ProjectDetailsController.view = view;

        view.getBackButton().addActionListener(new AdminDashboardController.NavigatorsListener());
    }

    public static ProjectDetailsController getInstance(ProjectDetailsView view){
        if(singletonInstance == null){
            singletonInstance = new ProjectDetailsController(view);
        }
        return singletonInstance;
    }

    static class NavigationListener implements ActionListener{
        private void jButton1ActionPerformed(ActionEvent e) {
            // After clicking the back button go back
        }

        private void jButton2ActionPerformed(ActionEvent e) {
            // TODO add your handling code here:
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getBackButton()) {
                System.out.println("Button 1 says hello");
                jButton1ActionPerformed(e);
//        } else if (e.getSource() == view.getButton2()) {
//            System.out.println("Button 2 says hello");
//            jButton2ActionPerformed(e);
            }

        }
    }

}
