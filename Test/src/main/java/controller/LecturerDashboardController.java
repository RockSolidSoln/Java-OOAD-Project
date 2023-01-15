package controller;

import model.Project;
import model.Database;
import model.LoginModel;
import view.CreateProjectView;
import view.LecturerDashboardView;
import view.LoginView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Objects;

public class LecturerDashboardController {
    private static LecturerDashboardController singletonInstance;
    private static LecturerDashboardView view;

    public LecturerDashboardController(LecturerDashboardView view){
        LecturerDashboardController.view = view;

        view.getButton1().addActionListener(new NavigatorsListener());
        view.getButton2().addActionListener(new NavigatorsListener());
        view.getButton3().addActionListener(new NavigatorsListener());

        List<String> informations = Database.readFile("\\Test\\src\\assets\\lecturer.csv");
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
                view.getNavNameField().setText(username);
            }

        }
    }
    public static LecturerDashboardController getInstance(LecturerDashboardView view){
        if(singletonInstance == null){
            singletonInstance = new LecturerDashboardController(view);
        }
        return singletonInstance;
    } 


    static class NavigatorsListener implements ActionListener{
        private void jButton1ActionPerformed(ActionEvent e) {
            // Create Project
            CreateProjectView new_view = new CreateProjectView();
            Project new_model = Project.getInstance();
            CreateProjectController controller = new CreateProjectController(new_view, new_model);

            new_view.getJComboBox().setSelectedItem(LoginModel.getUserId()); //should be set as the logged in ID
            new_view.getJComboBox().setEnabled(false);
            new_view.setVisible(true);

        }

        private void jButton2ActionPerformed(ActionEvent e) {
            // TODO add your handling code here:
        }

        private void jButton3ActionPerformed(ActionEvent e) {
            // Logout
            view.dispose();
            LoginModel model = LoginModel.getInstance(null, null);
            LoginView view = new LoginView();
            LoginController controller = new LoginController(view, model);

            view.setVisible(true);
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) {
                System.out.println("Button 1 says hello");
                jButton1ActionPerformed(e);
            } else if (e.getSource() == view.getButton2()) {
                System.out.println("Button 2 says hello");
            } else if (e.getSource() == view.getButton3()) {
                jButton3ActionPerformed(e);
                System.out.println("Button 3 says hello");
            }
        }
    }

}
