package controller;


import model.LoginModel;
import model.Project;
import view.AdminProjectsView;
import view.CreateAccountView;
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

        view.getButton1().addActionListener(new AdminDashboardController.NavigatorsListener());
        view.getButton2().addActionListener(new AdminDashboardController.NavigatorsListener());
        view.getButton3().addActionListener(new AdminDashboardController.NavigatorsListener());
        view.getButton4().addActionListener(new AdminDashboardController.NavigatorsListener());
        view.getButton5().addActionListener(new AdminDashboardController.NavigatorsListener());
        view.getProjectDetailsButton().addActionListener(new AdminDashboardController.NavigatorsListener());
        view.getViewRemarkButton().addActionListener(new AdminDashboardController.NavigatorsListener());
        view.getAddProjectButton().addActionListener(new AdminDashboardController.NavigatorsListener());


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
            //Create Account
            view.dispose();

        }

        private void jButton5ActionPerformed(ActionEvent e){
            int selectedRow = view.getTable().getSelectedRow();
            if (selectedRow != -1) {
                // get the value of the project ID column
                String projectID = (String) view.getTable().getValueAt(selectedRow, 0);
                // redirect to ProjectDetails JFrame here
    //                    RemarkSection remarkSection = new RemarkSection(projectID);
    //                    remarkSection.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row from the table.");
            }

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) { // Create Account Button
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
            }

        }
    }

}
