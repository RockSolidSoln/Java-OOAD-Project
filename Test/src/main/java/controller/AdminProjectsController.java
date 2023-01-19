package controller;


import model.Database;
import model.LoginModel;
import model.Project;
import view.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AdminProjectsController {
    private final AdminProjectsView view;
    private static AdminProjectsController singletonInstance;

    public AdminProjectsController(AdminProjectsView view) {
        this.view = view;

        view.getButton1().addActionListener(new AdminProjectsController.ProjectListener());//skipped: view projects (current screen)
        view.getButton2().addActionListener(new AdminProjectsController.ProjectListener());//dashboard
        view.getButton3().addActionListener(new AdminProjectsController.ProjectListener());//create account
        view.getButton4().addActionListener(new AdminProjectsController.ProjectListener());//view reports
        view.getButton5().addActionListener(new AdminProjectsController.ProjectListener());//logout
        view.getProjectDetailsButton().addActionListener(new AdminProjectsController.ProjectListener());
        view.getViewRemarkButton().addActionListener(new AdminProjectsController.ProjectListener());
        view.getAddProjectButton().addActionListener(new AdminProjectsController.ProjectListener());

        Project projectModel = Project.getInstance("null", "null", "null","null", "null", "null");
        ArrayList<ArrayList<String>> allProjects = projectModel.getAllProjects();
        
        ((DefaultTableModel) view.getTable().getModel()).setRowCount(0);

        for(int i = 0; i < allProjects.size(); i++){
            String[] values = new String[6];
            values[0] = allProjects.get(i).get(0); 
            values[1] = allProjects.get(i).get(1); 
            values[2] = allProjects.get(i).get(2); 
            values[3] = allProjects.get(i).get(3); 
            values[4] = allProjects.get(i).get(4); 
            values[5] = allProjects.get(i).get(5); 

            ((DefaultTableModel)view.getTable().getModel()).insertRow(0, values);
        }
        
        
    }

    public static AdminProjectsController getInstance(AdminProjectsView view){
        if (singletonInstance == null) {
            singletonInstance = new AdminProjectsController(view);
        }
        return singletonInstance;
    }

    class ProjectListener implements ActionListener{
        private void viewRemark(ActionEvent e) {
            int selectedRow = view.getTable().getSelectedRow();
            if (selectedRow != -1) {
                // get the value of the project ID column
                String projectID = (String) view.getTable().getValueAt(selectedRow, 0);
                view.dispose();
                AdminRemarkView remarkSection = new AdminRemarkView(projectID);
                AdminRemarkController controllerRemark = new AdminRemarkController(remarkSection);
                remarkSection.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row from the table.");
            }

            
        }

        private void addProject(ActionEvent e) {
            //Adding project in the database
            CreateProjectView new_view = new CreateProjectView();
            Project model = Project.getInstance(null, null, null, null, null, null);
            CreateProjectController controller = new CreateProjectController(new_view, model);
            new_view.setVisible(true);
        }

        private void viewProject(ActionEvent e) {
            //View specific project
            int selectedRow = view.getTable().getSelectedRow();
            if (selectedRow != -1) {
                // get the value of the project ID column
                String projectID = (String) view.getTable().getValueAt(selectedRow, 0);
                String projectName = (String) view.getTable().getValueAt(selectedRow, 1);
                String lecturerID = (String) view.getTable().getValueAt(selectedRow, 2);
                String specialization = (String) view.getTable().getValueAt(selectedRow, 3);
                String details = (String) view.getTable().getValueAt(selectedRow, 4);

                view.dispose();
                ProjectDetailsView new_view = new ProjectDetailsView(projectID, projectName, lecturerID, specialization, details);
                ProjectDetailsController controller = new ProjectDetailsController(new_view);
                new_view.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row from the table.");
            }

        }

        @Override
        public void actionPerformed(ActionEvent e) {
                
            if (e.getSource() == view.getButton2()) { // Admin - Dashboard Pressed
                view.dispose();
                NavBarController.AdminDashboardActionPerformed(e);
            } else if (e.getSource() == view.getButton3()) { // Admin - Create Account Pressed
                view.dispose();
                NavBarController.AdminCreateAccountActionPerformed(e);
            } else if (e.getSource() == view.getButton4()) { // Admin - View Reports Pressed
                view.dispose();
                NavBarController.AdminViewReportActionPerformed(e);
            } else if (e.getSource() == view.getButton5()) { // Admin - logout Pressed
                view.dispose();
                NavBarController.LogoutActionPerformed(e);
            }
            
            
            else if (e.getSource() == view.getViewRemarkButton()) {
                viewRemark(e);
            } else if (e.getSource() == view.getAddProjectButton()) {
                addProject(e);
            } else if (e.getSource() == view.getProjectDetailsButton()) {
                viewProject(e);
            }

        }
    }

}
