package controller;

import view.LecturerDashboardView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LecturerDashboardController {
    private static LecturerDashboardController singletonInstance;
    private static LecturerDashboardView view;

    public LecturerDashboardController(LecturerDashboardView view){
        LecturerDashboardController.view = view;

        view.getButton1().addActionListener(new NavigatorsListener());
        view.getButton2().addActionListener(new NavigatorsListener());
        view.getButton3().addActionListener(new NavigatorsListener());

    }
    public static LecturerDashboardController getInstance(LecturerDashboardView view){
        if(singletonInstance == null){
            singletonInstance = new LecturerDashboardController(view);
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
            }
        }
    }

}
