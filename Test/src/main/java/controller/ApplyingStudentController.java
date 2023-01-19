package controller;

import view.ApplyingStudentView;
import view.LecturerProjectsDetailsView;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ApplyingStudentController {
    private static ApplyingStudentController singletonInstance;
    private static ApplyingStudentView view;

    public ApplyingStudentController(ApplyingStudentView view) {
        ApplyingStudentController.view = view;

        view.getBackButton().addActionListener(new ApplyingStudentController.NavigatorsListener());
        view.getAssignButton().addActionListener(new ApplyingStudentController.NavigatorsListener());


        String basePath = System.getProperty("user.dir");
        //should be student list
        try(BufferedReader br2 = new BufferedReader(new FileReader(basePath + "\\Test\\src\\assets\\projects.csv"))){
            String line;
            ((DefaultTableModel) view.getTable().getModel()).setRowCount(0);
            while ((line = br2.readLine()) != null) {
                String[] values = line.split(",");
                ((DefaultTableModel)view.getTable().getModel()).insertRow(0, values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ApplyingStudentController getInstance(ApplyingStudentView view) {
        if (singletonInstance == null) {
            singletonInstance = new ApplyingStudentController(view);
        }
        return singletonInstance;
    }

    static class NavigatorsListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getBackButton()) {
                view.dispose();
                NavBarController.LecturerDashboardActionPerformed(e);
            } else if (e.getSource() == view.getAssignButton()) {
                view.dispose();
            }

        }
    }
}
