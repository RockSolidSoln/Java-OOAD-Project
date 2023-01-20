package controller;

import view.AdminCreateAccountView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import javax.swing.JOptionPane;

import model.Admin;
import model.Lecturer;
import model.Student;
import model.User;
/**
 *
 * @author
 */
public class AdminCreateAccountController {
    private static AdminCreateAccountController singletonInstance;
    private final AdminCreateAccountView view;
    //private final Admin adminModel;
    

    public AdminCreateAccountController(AdminCreateAccountView view){
        this.view = view;
        view.getCreateAccountButton().addActionListener(new CreateAccountListener());
        view.getExitButton().addActionListener(new ExitListener());
        view.getButton3().addActionListener(new AdminCreateAccountController.NavigatorsListener()); /*dashboard */
        view.getButton4().addActionListener(new AdminCreateAccountController.NavigatorsListener()); /*view projec */
        view.getButton5().addActionListener(new AdminCreateAccountController.NavigatorsListener()); /* Skipped: active screen (current screen)*/
        view.getButton6().addActionListener(new AdminCreateAccountController.NavigatorsListener()); /*view repor */
        view.getButton7().addActionListener(new AdminCreateAccountController.NavigatorsListener()); /*logout */
    }

    public static AdminCreateAccountController getInstance(AdminCreateAccountView view) {
        if (singletonInstance == null) {
            singletonInstance = new AdminCreateAccountController(view);
        }
        return singletonInstance;
    }

    class NavigatorsListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton3()) {  /*Admin - dashboard pressed  */
                view.dispose();
                RoutingController.AdminDashboardActionPerformed();
            } else if (e.getSource() == view.getButton4()) {  /*Admin - View Project pressed */
                view.dispose();
                RoutingController.AdminViewProjectActionPerformed();
            } else if (e.getSource() == view.getButton6()) {  /*Admin - View Report Pressed */
                view.dispose();
                RoutingController.AdminViewReportPerformed();
            } else if (e.getSource() == view.getButton7()) { // Admin - Logout Pressed
                view.dispose();
                RoutingController.LogoutActionPerformed();
            }

        }
    }
    class CreateAccountListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            String userId = view.getUserId();
            String password = new String(view.getPassword());
            String email = view.getEmail();
            String phone = view.getPhone();
            String name = view.getName();
            String confirmPassword = new String(view.getPassword2());
            String specialization = view.getSpecialization();

            String userType = view.getUsertype();

            if(Objects.equals(password, confirmPassword)){
                /*Storing Credentials for the user (admin/lecturer/ student). */ 
                User user = User.getInstance(userId, password, name, email, phone);
                user.StoreCredentials();
                JOptionPane.showMessageDialog(null, "Account created successfully");

                /*Storing details for the user.*/
                if(userType.equals("ADMIN")){
                    Admin admin = Admin.getInstance(userId, password, name, email, phone);
                    admin.StoreDetails(); /* storing admin details in the DB*/
                    JOptionPane.showMessageDialog(null, "Account created successfully");

                } else if(userType.equals("LECTURER")){
                    Lecturer lecturer = Lecturer.getInstance(userId, password, name, email, phone);
                    lecturer.StoreDetails(); /* storing lecturer details in the DB*/ 
                    JOptionPane.showMessageDialog(null, "Account created successfully");

                }
                else{
                    Student student = Student.getInstance(userId, password, name, email, phone, specialization);
                    student.StoreDetails();   /*storing student details in the DB */ 
                }

            } else{
                view.displayFailureMessage();
            }


        }

    }
    class ExitListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.dispose();
        }

    }
}
