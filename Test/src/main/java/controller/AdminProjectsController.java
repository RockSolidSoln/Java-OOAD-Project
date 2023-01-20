package controller;


import model.AdminRemarkModel;
import model.Project;
import view.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

        ProjectTableLoader(); 
    }
    public void ProjectTableLoader(){
        Project projectModel = Project.getInstance("null", "null", "null","null", "null", "null");
        ArrayList<ArrayList<String>> allProjects = projectModel.getAllProjects();
        
        ((DefaultTableModel) view.getTable().getModel()).setRowCount(0);

        for (ArrayList<String> allProject : allProjects) {
            String[] values = new String[6];
            values[0] = allProject.get(0);
            values[1] = allProject.get(1);
            values[2] = allProject.get(2);
            values[3] = allProject.get(3);
            values[4] = allProject.get(4);
            values[5] = allProject.get(5);

            ((DefaultTableModel) view.getTable().getModel()).insertRow(0, values);
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
                String projectName = (String) view.getTable().getValueAt(selectedRow, 1);
                view.dispose();
                AdminRemarkView remarkSection = new AdminRemarkView(projectID, projectName);
                AdminRemarkModel model = new AdminRemarkModel();
                AdminRemarkController controllerRemark = new AdminRemarkController(remarkSection, model);
                remarkSection.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row from the table.");
            }

            
        }

        private void addProject(ActionEvent e) {
            //Adding project in the database
            AdminAndLecturerCreateProjectView new_view = new AdminAndLecturerCreateProjectView();
            Project model = Project.getInstance(null, null, null, null, null, null);
            AdminAndLecturerCreateProjectController controller = new AdminAndLecturerCreateProjectController(new_view, model);
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
                RoutingController.AdminViewProject(projectID, projectName, lecturerID, specialization, details);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row from the table.");
            }

        }

        @Override
        public void actionPerformed(ActionEvent e) {
                
            if (e.getSource() == view.getButton2()) { // Admin - Dashboard Pressed
                view.dispose();
                RoutingController.AdminDashboardActionPerformed();
            } else if (e.getSource() == view.getButton3()) { // Admin - Create Account Pressed
                view.dispose();
                RoutingController.AdminCreateAccountActionPerformed();
            } else if (e.getSource() == view.getButton4()) { // Admin - View Reports Pressed
                view.dispose();
                RoutingController.AdminViewReport();
            } else if (e.getSource() == view.getButton5()) { // Admin - logout Pressed
                view.dispose();
                RoutingController.LogoutActionPerformed();
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
