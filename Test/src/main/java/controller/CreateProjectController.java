package controller;

import model.Project;
import view.CreateProjectView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CreateProjectController {
    private static CreateProjectController singletonInstance;
    private static CreateProjectView view;
    private static Project model;

    public CreateProjectController(CreateProjectView view, Project model){
        CreateProjectController.model = model;
        CreateProjectController.view = view;

        view.getButton1().addActionListener(new CreateProjectController.NavigatorsListener());
        view.getButton2().addActionListener(new CreateProjectController.NavigatorsListener()); //go back to view projects but keep in mind admin and lec is using same

        List<String> lecturers = Project.getlecturer();
        for (String lecturer : lecturers) {
            view.getJComboBox().addItem(lecturer);
        }
    }

    public static CreateProjectController getInstance(CreateProjectView view, Project model) {
        if (singletonInstance == null) {
            singletonInstance = new CreateProjectController(view, model);
        }
        return singletonInstance;
    }

    static class NavigatorsListener implements ActionListener {
        private void jButton1ActionPerformed(ActionEvent e) {
            // After clicking the save button
            String lecturer = view.getLecturerId();
            String project = view.getProject();
            String specialization = view.getSpecialization();
            String setDescription = view.getDescription();
            if(lecturer.isEmpty() || project.isEmpty() || specialization.isEmpty() || setDescription.isEmpty()) {
                // Display an error message
                JOptionPane.showMessageDialog(null, "Please fill out all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                model.setLecturer(lecturer);
                model.setProjectName(project);
                model.setSpecialization(specialization);
                model.setDescription(setDescription);

                model.saveProject();
                JOptionPane.showMessageDialog(null, "The Project was successfully saved.", "Success", JOptionPane.INFORMATION_MESSAGE);
            }

        }

        private void jButton2ActionPerformed(ActionEvent e) {
            // Go Back
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) {
                jButton1ActionPerformed(e);
            } else if (e.getSource() == view.getButton2()) {
                jButton2ActionPerformed(e);
            }

        }
    }
}
