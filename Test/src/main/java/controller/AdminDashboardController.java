package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import model.CreateProjectModel;
import model.Database;
import model.LoginModel;
import view.AdminDashboardView;
import view.CreateProjectView;
import view.CreateAccountView;
import view.LoginView;

public class AdminDashboardController {

    private static AdminDashboardController singletonInstance; 
    private static AdminDashboardView view;

    public AdminDashboardController(AdminDashboardView view) {
        AdminDashboardController.view = view;

        view.getButton1().addActionListener(new NavigatorsListener());
        view.getButton2().addActionListener(new NavigatorsListener());
        view.getButton3().addActionListener(new NavigatorsListener());
        view.getButton4().addActionListener(new NavigatorsListener());

        List<String> informations = Database.readFile("\\Test\\src\\assets\\admin.csv");
        for (String line : informations) {
            String[] items = line.split(","); //split the comma, store every word in an array
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

    public static AdminDashboardController getInstance(AdminDashboardView view) {
        if (singletonInstance == null) {
                singletonInstance = new AdminDashboardController(view);
        }
        return singletonInstance;
    }


    static class NavigatorsListener implements ActionListener{
        private void jButton1ActionPerformed(ActionEvent e) {
            // View Project

        }

        private void jButton2ActionPerformed(ActionEvent e) {
            //View Report
        }

        private void jButton3ActionPerformed(ActionEvent e) {
            //Logout
            view.dispose();
            LoginModel model = LoginModel.getInstance(null, null);
            LoginView view = new LoginView();
            LoginController controller = new LoginController(view, model);

            view.setVisible(true);
        }

        private void jButton4ActionPerformed(ActionEvent e) {
            //Create Account
            view.dispose();
         //   CreateProjectModel model = CreateProjectModel.getInstance();
         //   CreateProjectView view = new CreateProjectView();
          //  CreateProjectController controller = new CreateProjectController(view, model);

            view.setVisible(true);

        }

        private void jButton5ActionPerformed(ActionEvent e){
            //Dashboard
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) { // Create Account Button
                view.dispose(); // Admin Dashboard View closed
                var createAccountView = CreateAccountView.getInstance(); 
                createAccountView.setVisible(true);
                
            } else if (e.getSource() == view.getButton2()) {
                System.out.println("Button 2 says hello");
            } else if (e.getSource() == view.getButton3()) {
                System.out.println("Button 3 says hello");
                jButton3ActionPerformed(e);
            } else if (e.getSource() == view.getButton4()) {
                System.out.println("Button 4 says hello");
                jButton4ActionPerformed(e);
            } else if (e.getSource() == view.getButton5()) {
                jButton5ActionPerformed(e);
            }

        }
    }

}
