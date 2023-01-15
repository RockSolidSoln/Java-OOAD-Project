package controller;


import model.LoginModel;
import model.Project;
import view.AdminProjectsView;
import view.AdminRemarkView;
import view.CreateProjectView;
import view.LoginView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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


        String basePath = System.getProperty("user.dir");
        try (BufferedReader br = new BufferedReader(new FileReader(basePath +"\\Test\\src\\assets\\projects.csv"))) {
            int rowCount = 0;
            while (br.readLine() != null) {
                rowCount++;
            }
            ((DefaultTableModel) view.getTable().getModel()).setRowCount(0);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader br2 = new BufferedReader(new FileReader(basePath+"\\Test\\src\\assets\\projects.csv"))){
            String line;
            while ((line = br2.readLine()) != null) {
                String[] values = line.split(",");
                ((DefaultTableModel)view.getTable().getModel()).insertRow(0, values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AdminProjectsController getInstance(AdminProjectsView view) {
        if (singletonInstance == null) {
            singletonInstance = new AdminProjectsController(view);
        }
        return singletonInstance;
    }

    class ProjectListener implements ActionListener{
        private void jButton1ActionPerformed(ActionEvent e) {
            // View Project

        }

        private void jButton2ActionPerformed(ActionEvent e) {
            //View Report
        }

        private void jButton3ActionPerformed(ActionEvent e) {
            //Logout
            view.dispose();
            LoginModel model = LoginModel.getInstance(null, null);
            LoginView view = new LoginView();
            LoginController controller = new LoginController(view, model);

            view.setVisible(true);
        }

        private void jButton4ActionPerformed(ActionEvent e) {
        }

        private void jButton5ActionPerformed(ActionEvent e){

        }

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

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) {
                System.out.println("Button 1 says hello");
            } else if (e.getSource() == view.getButton2()) {
                System.out.println("Button 2 says hello");
            } else if (e.getSource() == view.getButton3()) {
                System.out.println("Button 3 says hello");
                jButton3ActionPerformed(e);
            } else if (e.getSource() == view.getButton4()) {
                System.out.println("Button 4 says hello");
                jButton4ActionPerformed(e);
            } else if (e.getSource() == view.getButton5()) {
                jButton5ActionPerformed(e);
            } else if (e.getSource() == view.getViewRemarkButton()) {
                System.out.println("Remark button clicked");
                viewRemark(e);
            } else if (e.getSource() == view.getAddProjectButton()) {
                addProject(e);
            } else if (e.getSource() == view.getProjectDetailsButton()) {
                viewProject(e);
            }

        }
    }

}
