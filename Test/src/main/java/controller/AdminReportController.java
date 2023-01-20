package controller;

import view.AdminReportView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminReportController {
    private static AdminReportController singletonInstance;
    private final AdminReportView view;
    //private final Admin adminModel;


    public AdminReportController(AdminReportView view){
        this.view = view;
        view.getDashboardButton().addActionListener(new AdminReportController.NavigatorsListener()); //dashboard
        view.getCreateButton().addActionListener(new AdminReportController.NavigatorsListener()); //create account
        view.getLogButton().addActionListener(new AdminReportController.NavigatorsListener());//logout
        view.getViewProjectButton().addActionListener(new AdminReportController.NavigatorsListener());//view project
        view.getViewRemarkButton().addActionListener(new AdminReportController.NavigatorsListener());//view remark
        view.getUndoButton().addActionListener(new AdminReportController.NavigatorsListener());//undo
        view.getviewByButton().addActionListener(new AdminReportController.NavigatorsListener());//
    }

    public static AdminReportController getInstance(AdminReportView view) {
        if (singletonInstance == null) {
            singletonInstance = new AdminReportController(view);
        }
        return singletonInstance;
    }

    class NavigatorsListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getCreateButton()) { //Admin - Create account
                view.dispose();
                RoutingController.AdminCreateAccountActionPerformed();
            } else if (e.getSource() == view.getLogButton()) { // Admin - Logout
                view.dispose();
                RoutingController.LogoutActionPerformed();
            } else if (e.getSource() == view.getViewProjectButton()) { // Admin - View Project Pressed
                view.dispose();
                RoutingController.AdminViewProjectActionPerformed();
            } else if (e.getSource() == view.getDashboardButton()) { // Admin - View Project Pressed
                view.dispose();
                RoutingController.AdminDashboardActionPerformed();
            } else if (e.getSource() == view.getViewRemarkButton()) { // Admin - Logout Pressed

            } else if (e.getSource() == view.getUndoButton()) { // Admin - Logout Pressed


            }else if (e.getSource() == view.getviewByButton()) { // Admin - Logout Pressed

            }

        }
    }

}
