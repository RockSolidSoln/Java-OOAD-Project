package controller;

import view.LecturerProjectsDetailsView;
import view.LecturerProjectsView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LecturerProjectsController {
    private static LecturerProjectsController singletonInstance;
    private static LecturerProjectsView view;

    public LecturerProjectsController(LecturerProjectsView view) {
        LecturerProjectsController.view = view;

        view.getButton1().addActionListener(new LecturerProjectsController.NavigatorsListener()); //dashboard
        view.getButton2().addActionListener(new LecturerProjectsController.NavigatorsListener()); //view projects, active
        view.getButton3().addActionListener(new LecturerProjectsController.NavigatorsListener()); //logout
        view.getButton4().addActionListener(new LecturerProjectsController.NavigatorsListener()); //create new project
        view.getViewButton().addActionListener(new LecturerProjectsController.NavigatorsListener());

        String basePath = System.getProperty("user.dir");
        try(BufferedReader br2 = new BufferedReader(new FileReader(basePath + "\\Test\\src\\assets\\projects.csv"))){
            String line;
            ((DefaultTableModel) view.getTable().getModel()).setRowCount(0);
            while ((line = br2.readLine()) != null) {
                String[] values = line.split(",");

                Object[] rowData = new Object[values.length-1];
                int j=0;
                for (int i = 0; i < values.length; i++) {
                    if (i != 2 && i!=4) {
                        rowData[j]=values[i];
                        j++;
                    }
                }
                ((DefaultTableModel) view.getTable().getModel()).insertRow(0, rowData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
            if (e.getSource() == view.getButton1()) { // Lecturer - Dashboard
                view.dispose();
                NavBarController.LecturerDashboardActionPerformed(e);
            } else if (e.getSource() == view.getButton3()) { // Lecturer - Logout Button Pressed
                view.dispose();
                NavBarController.LogoutActionPerformed(e);
            } else if (e.getSource() == view.getButton4()) { // Lecturer - Create New Project Pressed
                view.dispose();
                NavBarController.CreateProjectActionPerformed(e);
            } else if (e.getSource() == view.getViewButton()) { // Project-Details Button Pressed
                int selectedRow = view.getTable().getSelectedRow();
                if (selectedRow != -1) {
                    // get the value of the project ID column
                    String projectID = (String) view.getTable().getValueAt(selectedRow, 0);
                    String projectName = (String) view.getTable().getValueAt(selectedRow, 1);
                    String specialization = (String) view.getTable().getValueAt(selectedRow, 2);
                    String status = (String) view.getTable().getValueAt(selectedRow, 3);
                    
                    view.dispose();
                    LecturerProjectsDetailsView new_view = new LecturerProjectsDetailsView(projectID, projectName, specialization, status);
                    LecturerProjectsDetailsController controller = new LecturerProjectsDetailsController(new_view);

                    new_view.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a row from the table.");
                }

//
            }

        }
    }

}
