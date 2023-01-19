package controller;

import view.AdminProjectDetailsView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminProjectDetailsController {
    private static AdminProjectDetailsView view = null;
    private static AdminProjectDetailsController singletonInstance;

    public AdminProjectDetailsController(AdminProjectDetailsView view) {
        AdminProjectDetailsController.view = view;
        view.getBackButton().addActionListener(new AdminProjectDetailsController.NavigatorsListener());
    }

    public static AdminProjectDetailsController getInstance(AdminProjectDetailsView view){
        if(singletonInstance == null){
            singletonInstance = new AdminProjectDetailsController(view);
        }
        return singletonInstance;
    }

    static class NavigatorsListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getBackButton()) {
                NavBarController.AdminViewProjectActionPerformed();
            }

        }
    }

}
