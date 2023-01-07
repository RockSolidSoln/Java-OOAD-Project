package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.AdminDashboardView;

public class AdminDashboardController {

    private static AdminDashboardView view;

    public AdminDashboardController(AdminDashboardView view) {
        AdminDashboardController.view = view;

        view.getButton1().addActionListener(new NavigatorsListener());
        view.getButton2().addActionListener(new NavigatorsListener());
        view.getButton3().addActionListener(new NavigatorsListener());
        view.getButton4().addActionListener(new NavigatorsListener());
    }


    static class NavigatorsListener implements ActionListener{
        private void jButton1ActionPerformed(ActionEvent e) {
            // TODO add your handling code here:

        }

        private void jButton2ActionPerformed(ActionEvent e) {
            // TODO add your handling code here:
        }

        private void jButton3ActionPerformed(ActionEvent e) {
            // TODO add your handling code here:
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
            } else if (e.getSource() == view.getButton4()) {
                System.out.println("Button 4 says hello");
            }

        }
    }

}
