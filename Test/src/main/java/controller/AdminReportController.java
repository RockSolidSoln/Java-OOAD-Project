package controller;

import model.Project;
import view.AdminRemarkView;
import view.AdminReportView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author salah
 */
public class AdminReportController {
    public static AdminReportController singletonInstance;
    private final AdminReportView view;


    public AdminReportController(AdminReportView view){
        this.view = view;
        view.getDashboardButton().addActionListener(new AdminReportController.NavigatorsListener()); //dashboard
        view.getCreateButton().addActionListener(new AdminReportController.NavigatorsListener()); //create account
        view.getLogButton().addActionListener(new AdminReportController.NavigatorsListener());//logout
        view.getViewProjectButton().addActionListener(new AdminReportController.NavigatorsListener());//view project
        view.getViewRemarkButton().addActionListener(new AdminReportController.NavigatorsListener());//view remark
        view.getUndoButton().addActionListener(new AdminReportController.NavigatorsListener());//undo
        view.getviewByButton().addActionListener(new AdminReportController.NavigatorsListener());//

        ProjectTableLoader();
    }
    public static AdminReportController getInstance(AdminReportView view) {
        if (singletonInstance == null) {
            singletonInstance = new AdminReportController(view);
        }
        return singletonInstance;
    }


    public void ProjectTableLoader(){
        Project projectModel = Project.getInstance("null", "null", "null","null", "null", "null", "null");
        ArrayList<ArrayList<String>> allProjects = projectModel.getAllProjects();

        ((DefaultTableModel) view.getTable().getModel()).setRowCount(0);

        for (ArrayList<String> allProject : allProjects) {
            String[] values = new String[7];
            values[0] = allProject.get(0);
            values[1] = allProject.get(1);
            values[2] = allProject.get(2);
            values[3] = allProject.get(3);
            values[4] = allProject.get(4);
            values[5] = allProject.get(5);
            values[6] = "Something";

            ((DefaultTableModel) view.getTable().getModel()).insertRow(0, values);
        }
    }


    class NavigatorsListener implements ActionListener {

        private void viewByButtonActionPerformed() {
            
            if (view.getTable().getSelectedRow() != -1 && view.getTable().getSelectedColumn() != -1) {
                int selectedRow = view.getTable().getSelectedRow();
                int selectedCol = view.getTable().getSelectedColumn();
                if (selectedRow >= 0 && selectedCol >= 0) {
                    Object selectedValue = view.getTable().getValueAt(selectedRow, selectedCol);
                    List<String[]> selectedRows = new ArrayList<>();
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\salah\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\newpackage\\project.csv"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            String[] values = line.split(",");
                            if (values[selectedCol].equals(selectedValue)) {
                                selectedRows.add(values);
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    DefaultTableModel model = new DefaultTableModel(new String[]{"Project ID", "Project Name", "Lecturer Name", "Specialization", "Assigned", "Status", "Comment"}, 0);
                    for (String[] row : selectedRows) {
                        model.addRow(row);
                    }
                    view.getTable().setModel(model);
                }
            }
        }
        private void viewRemarkButtonActionPerformed(java.awt.event.ActionEvent evt) {

            int selectedRow = view.getTable().getSelectedRow();
            if (selectedRow != -1) {
                // get the value of the project ID column
                String projectID = (String) view.getTable().getValueAt(selectedRow, 0);
                String projectName = (String) view.getTable().getValueAt(selectedRow, 1);
                // redirect to ProjectDetails JFrame here
                AdminRemarkView remarkSection = new AdminRemarkView(projectID, projectName);
                remarkSection.setVisible(true);
            }else {
                // show a pop-up message
                JOptionPane.showMessageDialog(null, "Please select a row from the table.");
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getCreateButton()) { //Admin - Create account
                view.dispose();
                RoutingController.AdminCreateAccountActionPerformed();
            } else if (e.getSource() == view.getLogButton()) { // Admin - Logout
                view.dispose();
                RoutingController.LogoutActionPerformed();
            } else if (e.getSource() == view.getViewProjectButton()) { // Admin - View Project Pressed
                view.dispose();
                RoutingController.AdminViewProjectActionPerformed();
            } else if (e.getSource() == view.getDashboardButton()) { // Admin - View Project Pressed
                view.dispose();
                RoutingController.AdminDashboardActionPerformed();
            } else if (e.getSource() == view.getViewRemarkButton()) { // Admin - Logout Pressed
                viewByButtonActionPerformed();
            } else if (e.getSource() == view.getUndoButton()) { // Admin - Logout Pressed
                DefaultTableModel originalModel = (DefaultTableModel) view.getTable().getModel();
                view.getTable().setModel(originalModel);
            } else if (e.getSource() == view.getviewByButton()) { // Admin - Logout Pressed

            }

        }
    }

}

