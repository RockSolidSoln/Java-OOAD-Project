package controller;


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

        view.getButton1().addActionListener(new AdminProjectsController.ProjectListener());
        view.getButton2().addActionListener(new AdminProjectsController.ProjectListener());
        view.getButton3().addActionListener(new AdminProjectsController.ProjectListener());
        view.getButton4().addActionListener(new AdminProjectsController.ProjectListener());
        view.getButton5().addActionListener(new AdminProjectsController.ProjectListener());
        view.getProjectDetailsButton().addActionListener(new AdminProjectsController.ProjectListener());
        view.getViewRemarkButton().addActionListener(new AdminProjectsController.ProjectListener());
        view.getAddProjectButton().addActionListener(new AdminProjectsController.ProjectListener());

        
        Project projectModel = Project.getInstance();
        ArrayList<Project> allProjects = projectModel.getProjectList();
        
        ((DefaultTableModel) view.getTable().getModel()).setRowCount(0);

        for(int i = 0; i < allProjects.size(); i++){
            String[] values = new String[6];
            values[0] = allProjects.get(i).getProjectId(); 
            values[1] = allProjects.get(i).getProjectName(); 
            values[2] = allProjects.get(i).getLecturer();
            values[3] = allProjects.get(i).getSpecialization();
            values[4] = allProjects.get(i).getDescription();
            values[5] = allProjects.get(i).getProjectStatus();

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
            Project model = Project.getInstance();
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
//                AdminRemarkController controllerRemark = new AdminRemarkController(new_view);
                new_view.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row from the table.");
            }

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) {
                System.out.println("Button 1 says hello");
            } else if (e.getSource() == view.getButton2()) {
                System.out.println("Button 2 says hello");
            } else if (e.getSource() == view.getButton3()) {
                NavBarController.LogoutActionPerformed(e);
            } else if (e.getSource() == view.getButton4()) {
                System.out.println("Button 4 says hello");
            } else if (e.getSource() == view.getButton5()) {
                //
            } else if (e.getSource() == view.getViewRemarkButton()) {
                viewRemark(e);
            } else if (e.getSource() == view.getAddProjectButton()) {
                addProject(e);
            } else if (e.getSource() == view.getProjectDetailsButton()) {
                viewProject(e);
            }

        }
    }

}
