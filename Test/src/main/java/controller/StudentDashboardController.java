package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Objects;

import model.Database;
import model.LoginModel;
import view.LoginView;
import view.StudentDashboardView;

public class StudentDashboardController {

    private static StudentDashboardController singletonInstance;
    private static StudentDashboardView view;
    public static StudentDashboardController getInstance(StudentDashboardView view) {
        if (singletonInstance == null) {
            singletonInstance = new StudentDashboardController(view);
        }
        return singletonInstance;
    }

    public StudentDashboardController(StudentDashboardView view) {
        StudentDashboardController.view = view;

        view.getButton1().addActionListener(new NavigatorsListener());//view my project
        view.getButton2().addActionListener(new NavigatorsListener());//logout
        view.getButton3().addActionListener(new NavigatorsListener());//view active and sp projects
        view.getButton4().addActionListener(new NavigatorsListener());//dashboard, active

        List<String> informations = Database.readFile("\\Test\\src\\assets\\student.csv");
        for (String line : informations) {
            String[] items = line.split(","); //split the comma, store every word in an array
            if(Objects.equals(LoginModel.getUserId(), items[0])) {
                String Id = items[0];
                String username = items[1];    //stores username
                String email = items[2];    // stores password
                String phone = items[4]; // stores

                view.getNameField().setText(username);
                view.getEmailField().setText(email);
                view.getPhoneField().setText(phone);
                view.getIDField().setText(Id);
                view.getNavNameField().setText(Id);
            }

        }
    }

    static class NavigatorsListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) {
                System.out.println("Button 1 says hello");
            } else if (e.getSource() == view.getButton2()) {
                view.dispose();
                NavBarController.LogoutActionPerformed();
            } else if (e.getSource() == view.getButton3()) {

            }
        }
    }

}
