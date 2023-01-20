package controller;

import model.Project;
import model.Lecturer;
import model.LoginModel;
import view.AdminAndLecturerCreateProjectView;
import view.LecturerDashboardView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author tanzir
 */
public class LecturerDashboardController {
    private static LecturerDashboardController singletonInstance;
    private static LecturerDashboardView view;

    public LecturerDashboardController(LecturerDashboardView view) {
        LecturerDashboardController.view = view;

        view.getButton1().addActionListener(new NavigatorsListener());/*create new project */
        view.getButton2().addActionListener(new NavigatorsListener());/* view projects*/ 
        view.getButton3().addActionListener(new NavigatorsListener());/*Logout*/
        view.getButton4().addActionListener(new NavigatorsListener());/* Skipped : Lecturer dashboard (current view)*/ 
        
        DashboardLoader();
    }
    /*This function loads the Dashboard with all the information presented there */
    public void DashboardLoader(){
        Lecturer lecturer = Lecturer.getDetailsInstance(LoginModel.getUserId());
        view.getNameField().setText(lecturer.getName());
        view.getEmailField().setText(lecturer.getEmail());
        view.getPhoneField().setText(lecturer.getPhone());
        view.getIDField().setText(lecturer.getUsername());
        view.getNavNameField().setText(lecturer.getUsername());
    }

    public static LecturerDashboardController getInstance(LecturerDashboardView view) {
        if (singletonInstance == null) {
            singletonInstance = new LecturerDashboardController(view);
        }
        return singletonInstance;
    }

    static class NavigatorsListener implements ActionListener {
        private void jButton1ActionPerformed(ActionEvent e) {
            // Create Project
            AdminAndLecturerCreateProjectView new_view = new AdminAndLecturerCreateProjectView();
            Project new_model = Project.getInstance(null, null, null, null, null, null);
            AdminAndLecturerCreateProjectController controller = new AdminAndLecturerCreateProjectController(new_view, new_model);

            new_view.getJComboBox().setSelectedItem(LoginModel.getUserId()); // should be set as the logged in ID
            new_view.getJComboBox().setEnabled(false);
            new_view.setVisible(true);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton1()) { /*Lecturer - Create Project Button Pressed*/
                RoutingController.CreateProjectActionPerformed();
            } else if (e.getSource() == view.getButton2()) { /*Lecturer - View Projects Button Pressed */ 
                view.dispose();
                RoutingController.LecturerProjectsViewActionPerformed();
            } else if (e.getSource() == view.getButton3()) { /*Logout Button Pressed */ 
                view.dispose();
                RoutingController.LogoutActionPerformed();
            }
        }
    }

}
