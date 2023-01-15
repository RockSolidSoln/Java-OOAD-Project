package controller;

import model.CreateProjectModel;
import model.LoginModel;
import view.CreateProjectView;
import view.LoginView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CreateProjectController {
    private static CreateProjectController singletonInstance;
    private static CreateProjectView view;
    private static CreateProjectModel model;

    public CreateProjectController(CreateProjectView view, CreateProjectModel model){
        CreateProjectController.model = model;
        CreateProjectController.view = view;

        view.getButton1().addActionListener(new CreateProjectController.NavigatorsListener());
        view.getButton2().addActionListener(new CreateProjectController.NavigatorsListener());
        view.getButton3().addActionListener(new CreateProjectController.NavigatorsListener());
        view.getButton4().addActionListener(new CreateProjectController.NavigatorsListener());
        view.getButton5().addActionListener(new CreateProjectController.NavigatorsListener());
        view.getButton6().addActionListener(new CreateProjectController.NavigatorsListener());

        List<String> lecturers = CreateProjectModel.getlecturer();
        for (String lecturer : lecturers) {
            view.getJComboBox().addItem(lecturer);
        }
    }

    public static CreateProjectController getInstance(CreateProjectView view) {
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
            // TODO add your handling code here:
        }

        private void jButton3ActionPerformed(ActionEvent e) {

        }

        private void jButton4ActionPerformed(ActionEvent e) {
            //Logout
            view.dispose();
            LoginModel model = LoginModel.getInstance(null, null);
            LoginView view = new LoginView();
            LoginController controller = new LoginController(view, model);

            view.setVisible(true);
        }

        private void jButton5ActionPerformed(ActionEvent e) {
            // TODO add your handling code here:
        }

        private void jButton6ActionPerformed(ActionEvent e) {
            // TODO add your handling code here:
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) {
                System.out.println("Button 1 says hello");
                jButton1ActionPerformed(e);
            } else if (e.getSource() == view.getButton2()) {
                System.out.println("Button 2 says hello");
            } else if (e.getSource() == view.getButton3()) {
                System.out.println("Button 3 says hello");
                jButton3ActionPerformed(e);
            } else if (e.getSource() == view.getButton4()) {
                System.out.println("Button 4 says hello");
                jButton4ActionPerformed(e);
            } else if (e.getSource() == view.getButton5()) {
                System.out.println("Button 5 says hello");
            } else if (e.getSource() == view.getButton6()) {
                System.out.println("Button 6 says hello");
            }

        }
    }
}
