package controller;

import model.Project;
import view.ModifyProjectView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ModifyProjectController {
    private static ModifyProjectController singletonInstance;
    private static ModifyProjectView view;

    public ModifyProjectController(ModifyProjectView view){
        ModifyProjectController.view = view;

        view.getButton1().addActionListener(new ModifyProjectController.NavigatorsListener());
        view.getButton2().addActionListener(new ModifyProjectController.NavigatorsListener()); //go back to view projects but keep in mind admin and lec is using same

        List<String> specialization = new ArrayList<String>();
        specialization.add("Software Engineering");
        specialization.add("Data Scientist");
        specialization.add("Game Development");

        for(String s : specialization){
            view.getSpecializationBox().addItem(s);
        }
    }

    public static ModifyProjectController getInstance(ModifyProjectView view, Project model) {
        if (singletonInstance == null) {
            singletonInstance = new ModifyProjectController(view);
        }
        return singletonInstance;
    }

    static class NavigatorsListener implements ActionListener {
        private void ModifyProjectActionPerformed(ActionEvent e) {
            // After clicking the save button
            String projectId = view.getProjectId();
            String lecturer = view.getLecturerId();
            String projectName = view.getProject();
            String specialization = view.getSpecialization();
            String description = view.getDescription();

            if(lecturer.isEmpty() || projectName.isEmpty() || specialization.isEmpty() || description.isEmpty()) {
                // Display an error message
                JOptionPane.showMessageDialog(null, "Please fill out all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                // modify a model instance
                // -- TEMPORARY : ID Incrementer

            }

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) {
                ModifyProjectActionPerformed(e);
            } else if (e.getSource() == view.getButton2()) { // CreateProject - Go Back Pressed
                view.dispose();
            }

        }
    }
}
