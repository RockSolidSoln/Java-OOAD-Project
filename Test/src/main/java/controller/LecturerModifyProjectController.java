package controller;

import model.Project;
import view.LecturerModifyProjectView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author anis
 */
public class LecturerModifyProjectController {
    private static LecturerModifyProjectController singletonInstance;
    private static LecturerModifyProjectView view;

    public LecturerModifyProjectController(LecturerModifyProjectView view){
        LecturerModifyProjectController.view = view;

        view.getButton1().addActionListener(new LecturerModifyProjectController.NavigatorsListener()); /*Button to create Project */
        view.getButton2().addActionListener(new LecturerModifyProjectController.NavigatorsListener()); //go back to view projects but keep in mind admin and lec is using same

        List<String> specialization = new ArrayList<String>();
        specialization.add("Software Engineering");
        specialization.add("Data Science");
        specialization.add("Game Development");

        for(String s : specialization){
            view.getSpecializationBox().addItem(s);
        }
    }

    public static LecturerModifyProjectController getInstance(LecturerModifyProjectView view, Project model) {
        if (singletonInstance == null) {
            singletonInstance = new LecturerModifyProjectController(view);
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
                /* Display an error message*/ 
                JOptionPane.showMessageDialog(null, "Please fill out all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                /* modify a model instance*/ 
                /*-- TEMPORARY : ID Incrementer */ 
                Project.modifyProject(projectId, projectName, specialization, description); 
            }

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) {
                ModifyProjectActionPerformed(e);
            } else if (e.getSource() == view.getButton2()) { /* CreateProject - Go Back Pressed*/ 
                view.dispose();
                RoutingController.LecturerProjectsViewActionPerformed();
            }

        }
    }
}
