package controller;

import view.ApplyingStudentView;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class ApplyingStudentController {
    private static ApplyingStudentController singletonInstance;
    private static ApplyingStudentView view;
    private static String projectId;

    public ApplyingStudentController(ApplyingStudentView view, String projectId) {
        ApplyingStudentController.view = view;
        ApplyingStudentController.projectId = projectId;

        view.getBackButton().addActionListener(new ApplyingStudentController.NavigatorsListener());
        view.getAssignButton().addActionListener(new ApplyingStudentController.NavigatorsListener());


        String basePath = System.getProperty("user.dir");
        try(BufferedReader br2 = new BufferedReader(new FileReader(basePath + "\\Test\\src\\assets\\application.csv"))){
            String line;
            ((DefaultTableModel) view.getTable().getModel()).setRowCount(0);
            while ((line = br2.readLine()) != null) {
                String[] values = line.split(",");
                if(Objects.equals(values[0], projectId)){
                    int excludedColumnIndex = 0;
                    Object[] rowData = new Object[values.length-1];
                    int j=0;
                    for (int i = 0; i < values.length; i++) {
                        if (i != excludedColumnIndex) {
                            rowData[j]=values[i];
                            j++;
                        }
                    }
                    ((DefaultTableModel) view.getTable().getModel()).insertRow(0, rowData);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ApplyingStudentController getInstance(ApplyingStudentView view, String projectId) {
        if (singletonInstance == null) {
            singletonInstance = new ApplyingStudentController(view, projectId);
        }
        return singletonInstance;
    }

    static class NavigatorsListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getBackButton()) {
                view.dispose();
                NavBarController.LecturerDashboardActionPerformed();
            } else if (e.getSource() == view.getAssignButton()) {
                //assign to perform
                view.dispose();
            }

        }
    }
}
