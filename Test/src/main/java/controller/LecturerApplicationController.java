package controller;

import view.LecturerApplicationView;

import javax.swing.table.DefaultTableModel;

import model.ApplicationModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author
 */
public class LecturerApplicationController {
    private static LecturerApplicationController singletonInstance;
    private static LecturerApplicationView view;
    private static String projectId;

    public LecturerApplicationController(LecturerApplicationView view, String projectId) {
        LecturerApplicationController.view = view;
        LecturerApplicationController.projectId = projectId;

        view.getBackButton().addActionListener(new LecturerApplicationController.NavigatorsListener()); /*Go back  */
        view.getAssignButton().addActionListener(new LecturerApplicationController.NavigatorsListener());/*Assign button for lecturer to assign and un-assign students for a specific project */

        ProjectTableLoader();
        
    }

    public void ProjectTableLoader(){
        ApplicationModel applicationModel = ApplicationModel.getInstance(projectId, null, null);
        ArrayList<ArrayList<String>> filteredContents = applicationModel.filterByProjectId(projectId);
        ((DefaultTableModel) view.getTable().getModel()).setRowCount(0);

        for (ArrayList<String> allProject : filteredContents) {

            String[] values = new String[2];
            values[0] = allProject.get(1);
            values[1] = allProject.get(2);
           // values[2] = allProject.get(2);
            // System.out.println("Debugg:   " + values[1]);
            ((DefaultTableModel) view.getTable().getModel()).insertRow(0, values);
        }


    }

    public static LecturerApplicationController getInstance(LecturerApplicationView view, String projectId) {
        if (singletonInstance == null) {
            singletonInstance = new LecturerApplicationController(view, projectId);
        }
        return singletonInstance;
    }

    static class NavigatorsListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getBackButton()) {
                view.dispose();
                RoutingController.LecturerDashboardActionPerformed();
            } else if (e.getSource() == view.getAssignButton()) {
                /*assign to perform */
                int selectedRow = view.getTable().getSelectedRow();
                if (selectedRow != -1) {
                    // get the value of the project ID column

                    String studentId = (String) view.getTable().getValueAt(selectedRow, 0);
                    String studentName = (String) view.getTable().getValueAt(selectedRow, 1);
                    ApplicationModel.AssignStudent(String projectId, String studentId);
                    view.dispose();
                }
            }

        }
    }
}
