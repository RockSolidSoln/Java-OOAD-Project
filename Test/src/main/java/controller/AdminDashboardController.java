package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.LoginModel;
import view.AdminDashboardView;
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
    }

    public static AdminDashboardController getInstance(AdminDashboardView view) {
        if (singletonInstance == null) {
                singletonInstance = new AdminDashboardController(view);
        }
        return singletonInstance;
    }


    static class NavigatorsListener implements ActionListener{
        private void jButton1ActionPerformed(ActionEvent e) {
            // TODO add your handling code here:

        }

        private void jButton2ActionPerformed(ActionEvent e) {
            // TODO add your handling code here:
        }

        private void jButton3ActionPerformed(ActionEvent e) {
            view.dispose();
            LoginModel model = LoginModel.getInstance(null, null);
            LoginView view = new LoginView();
            LoginController controller = new LoginController(view, model);

            view.setVisible(true);
        }

        private void jButton4ActionPerformed(ActionEvent e) {
            // TODO add your handling code here:
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) {
                System.out.println("Button 1 says hello");
            } else if (e.getSource() == view.getButton2()) {
                System.out.println("Button 2 says hello");
            } else if (e.getSource() == view.getButton3()) {
                System.out.println("Button 3 says hello");
                jButton3ActionPerformed(e);
            } else if (e.getSource() == view.getButton4()) {
                System.out.println("Button 4 says hello");
            }

        }
    }

}
