package controller;

import model.Project;
import model.Database;
import model.LoginModel;
import view.CreateProjectView;
import view.LecturerDashboardView;
import view.LecturerProjectsView;
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

        view.getButton1().addActionListener(new NavigatorsListener());//create new project 
        view.getButton2().addActionListener(new NavigatorsListener());//view projects
        view.getButton3().addActionListener(new NavigatorsListener());//Logout
        view.getButton4().addActionListener(new NavigatorsListener());//Skipped : Lecturer dashboard (current view)

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
                view.getNavNameField().setText(Id);
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


        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) { // Lecturer - Create Project Button Pressed
                NavBarController.CreateProjectActionPerformed(e);
            } else if (e.getSource() == view.getButton2()) { // Lecturer - View Projects Button Pressed
                view.dispose();
                NavBarController.LecturerProjectsViewActionPerformed(e);
                
            } else if (e.getSource() == view.getButton3()) { // Logout Button Pressed
                view.dispose();
                NavBarController.LogoutActionPerformed(e);
            }
        }
    }

}
