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

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getBackButton()) {
                System.out.println("Button 1 says hello");
                //go back button

//        } else if (e.getSource() == view.getButton2()) {
//            System.out.println("Button 2 says hello");
//            jButton2ActionPerformed(e);
            }

        }
    }

}
