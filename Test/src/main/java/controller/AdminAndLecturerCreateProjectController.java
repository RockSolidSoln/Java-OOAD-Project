package controller;

import model.Project;
import view.AdminAndLecturerCreateProjectView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class AdminAndLecturerCreateProjectController {
    private static AdminAndLecturerCreateProjectController singletonInstance;
    private static AdminAndLecturerCreateProjectView view;
    private static Project model = Project.getInstance(null, null, null, null, null, null);

    public AdminAndLecturerCreateProjectController(AdminAndLecturerCreateProjectView view, Project model){
        AdminAndLecturerCreateProjectController.model = model;
        AdminAndLecturerCreateProjectController.view = view;

        view.getButton1().addActionListener(new AdminAndLecturerCreateProjectController.NavigatorsListener());
        view.getButton2().addActionListener(new AdminAndLecturerCreateProjectController.NavigatorsListener()); //go back to view projects but keep in mind admin and lec is using same

        List<String> lecturers = Project.getlecturerId();
        for (String lecturer : lecturers) {
            view.getJComboBox().addItem(lecturer);
        }

        List<String> specialization = new ArrayList<String>();
        specialization.add("Software Engineering");
        specialization.add("Data Scientist");
        specialization.add("Game Development");

        for(String s : specialization){
            view.getSpecializationBox().addItem(s);
        }
    }

    public static AdminAndLecturerCreateProjectController getInstance(AdminAndLecturerCreateProjectView view, Project model) {
        if (singletonInstance == null) {
            singletonInstance = new AdminAndLecturerCreateProjectController(view, model);
        }
        return singletonInstance;
    }

    static class NavigatorsListener implements ActionListener {
        private void AddProjectActionPerformed(ActionEvent e) {
            // After clicking the save button
            String lecturer = view.getLecturerId();
            String projectName = view.getProject();
            String specialization = view.getSpecialization();
            String description = view.getDescription();
            if(lecturer.isEmpty() || projectName.isEmpty() || specialization.isEmpty() || description.isEmpty()) {
                // Display an error message
                JOptionPane.showMessageDialog(null, "Please fill out all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                // create a model instance
                // -- TEMPORARY : ID Incrementer

                String basePath = System.getProperty("user.dir");
                int counter = 0;
                try (BufferedReader br = new BufferedReader(new FileReader(basePath + "\\Test\\src\\assets\\projects.csv"))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        counter++;
                    }
                }catch (IOException ioe) {
                        ioe.printStackTrace();
                }
                counter++;
                String projectId = "PR" + String.valueOf(counter);
                Project.getInstance(projectId, projectName, specialization, description, lecturer, "active");

                model.saveProject();
                JOptionPane.showMessageDialog(null, "The Project was successfully saved.", "Success", JOptionPane.INFORMATION_MESSAGE);
            }

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) {
                AddProjectActionPerformed(e);
            } else if (e.getSource() == view.getButton2()) { // CreateProject - Go Back Pressed
                view.dispose();
            }

        }
    }
}
