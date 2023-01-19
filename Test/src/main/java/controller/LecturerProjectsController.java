package controller;

import view.LecturerProjectDetailsView;
import view.LecturerProjectsView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.Database;
import model.LoginModel;
import model.Project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


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

        Project projectModel = Project.getInstance("null", "null", "null","null", "null", "null");
        ArrayList<ArrayList<String>> filteredContents = projectModel.FilterByLecturerId(LoginModel.getUserId());
        //System.out.println("DEBBBBBUG:   "+ LoginModel.getUserId());
        ((DefaultTableModel) view.getTable().getModel()).setRowCount(0);

        for(int i = 0; i < filteredContents.size(); i++){
            String[] values = new String[4];
            values[0] = filteredContents.get(i).get(0); 
            values[1] = filteredContents.get(i).get(1);
            values[2] = filteredContents.get(i).get(3);
            values[3] = filteredContents.get(i).get(5);

            ((DefaultTableModel) view.getTable().getModel()).insertRow(0, values);
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
                NavBarController.LecturerDashboardActionPerformed();
            } else if (e.getSource() == view.getButton3()) { // Lecturer - Logout Button Pressed
                view.dispose();
                NavBarController.LogoutActionPerformed();
            } else if (e.getSource() == view.getButton4()) { // Lecturer - Create New Project Pressed
                view.dispose();
                NavBarController.CreateProjectActionPerformed();
            } else if (e.getSource() == view.getViewButton()) { // Project-Details Button Pressed
                int selectedRow = view.getTable().getSelectedRow();
                if (selectedRow != -1) {
                    // get the value of the project ID column
                    String projectID = (String) view.getTable().getValueAt(selectedRow, 0);
                    String projectName = (String) view.getTable().getValueAt(selectedRow, 1);
                    String specialization = (String) view.getTable().getValueAt(selectedRow, 2);
                    String status = (String) view.getTable().getValueAt(selectedRow, 3);
                    
                    view.dispose();
                    NavBarController.ViewLecturerProjectDetails(projectID, projectName, specialization, status);
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a row from the table.");
                }

//
            }

        }
    }

}
