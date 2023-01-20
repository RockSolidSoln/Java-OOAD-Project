package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Admin;
import model.LoginModel;
import view.*;

public class AdminDashboardController {

    private static AdminDashboardController singletonInstance;
    private static AdminDashboardView view;

    public AdminDashboardController(AdminDashboardView view) {
        AdminDashboardController.view = view;

        view.getButton1().addActionListener(new NavigatorsListener());
        view.getButton2().addActionListener(new NavigatorsListener());
        view.getButton3().addActionListener(new NavigatorsListener());
        view.getButton4().addActionListener(new NavigatorsListener());

        DashBoardLoader();
        
    }

    public void DashBoardLoader(){
        Admin admin = Admin.getDetailsInstance(LoginModel.getUserId());
      //  System.out.println("DEBUGG: FRom AdminDashBoardController -- " + admin.getUsername());
        view.getNameField().setText(admin.getName()); // Displaying the Name on Dashboard
        view.getEmailField().setText(admin.getEmail()); // Displaying the Email on Dashboard
        view.getPhoneField().setText(admin.getPhone()); // Displaying the PhoneNo on Dashboard
        view.getIDField().setText(admin.getUsername());  // Displaying the Id on Dashboard
        view.getNavNameField().setText(admin.getUsername());

    }
    
    public static AdminDashboardController getInstance(AdminDashboardView view) {
        if (singletonInstance == null) {
            singletonInstance = new AdminDashboardController(view);
        }
        return singletonInstance;
    }

    static class NavigatorsListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) { // Create Account Button Pressed
                view.dispose();
                RoutingController.AdminCreateAccountActionPerformed();
            } else if (e.getSource() == view.getButton2()) { // View Report Button Pressed
                view.dispose();
                RoutingController.AdminViewReport();
            } else if (e.getSource() == view.getButton3()) { // Logout Button Pressed
                view.dispose();
                RoutingController.LogoutActionPerformed();
                } else if (e.getSource() == view.getButton4()) { // View Project Button Pressed
                view.dispose();
                RoutingController.AdminViewProjectActionPerformed();
            }

        }
    }

}
