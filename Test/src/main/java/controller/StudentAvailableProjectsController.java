package controller;

import view.StudentAvailableProjectsView;

import javax.swing.table.DefaultTableModel;

import model.LoginModel;
import model.Project;
import model.Student;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class StudentAvailableProjectsController {
    private static StudentAvailableProjectsController singletonInstance;
    private static StudentAvailableProjectsView view;

    public StudentAvailableProjectsController(StudentAvailableProjectsView view) {
        StudentAvailableProjectsController.view = view;
        view.getButton1().addActionListener(new StudentAvailableProjectsController.NavigatorsListener());// view my
                                                                                                         // project
        view.getButton2().addActionListener(new StudentAvailableProjectsController.NavigatorsListener());// logout
        view.getButton3().addActionListener(new StudentAvailableProjectsController.NavigatorsListener());// dashboard
        view.getViewButton().addActionListener(new StudentAvailableProjectsController.NavigatorsListener());// dashboard

        ProjectTableLoader();
    }

    public void ProjectTableLoader() {
        Project projectModel = Project.getInstance("null", "null", "null", "null", "null", "null");
        Student student = Student.getDetailsInstance(LoginModel.getUserId());
        ArrayList<ArrayList<String>> filteredContents = projectModel.filterBySpecializationAndStatus(student.getSpecialization());
        
        ((DefaultTableModel) view.getTable().getModel()).setRowCount(0);
        for (ArrayList<String> allProject : filteredContents) {
            String[] values = new String[3];
            values[0] = allProject.get(0);
            values[1] = allProject.get(1);
            values[2] = allProject.get(2);
            System.out.println("Debugg:   " + values[0]);

            ((DefaultTableModel) view.getTable().getModel()).insertRow(0, values);
        }

    }

    public static StudentAvailableProjectsController getInstance(StudentAvailableProjectsView view) {
        if (singletonInstance == null) {
            singletonInstance = new StudentAvailableProjectsController(view);
        }

        return singletonInstance;
    }

    static class NavigatorsListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) {
                view.dispose();
                RoutingController.StudentProjectDetailsView();
            } else if (e.getSource() == view.getButton2()) {
                view.dispose();
                RoutingController.LogoutActionPerformed();
            } else if (e.getSource() == view.getButton3()) {
                view.dispose();
                RoutingController.StudentDashboardView();
            } else if (e.getSource() == view.getViewButton()) {
                int selectedRow = view.getTable().getSelectedRow();
                if (selectedRow != -1) {
                    // get the value of the project ID column
                    String projectID = (String) view.getTable().getValueAt(selectedRow, 0);
                    String projectName = (String) view.getTable().getValueAt(selectedRow, 1);
                    String lecturerID = (String) view.getTable().getValueAt(selectedRow, 2);

                    view.dispose();
                    RoutingController.StudentApplyProjectsView(projectID, projectName, lecturerID);
                }
            }

        }
    }
}
