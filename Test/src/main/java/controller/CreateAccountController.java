package controller;

import view.AdminDashboardView;
import view.CreateAccountView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import model.Admin;
import model.Lecturer;
import model.Student;
import model.User;

public class CreateAccountController {
    private static CreateAccountController singletonInstance;
    private final CreateAccountView view;
    //private final Admin adminModel;
    

    public CreateAccountController(CreateAccountView view){
        this.view = view;
        view.getCreateAccountButton().addActionListener(new CreateAccountListener());
        view.getExitButton().addActionListener(new ExitListener());
        view.getButton3().addActionListener(new CreateAccountController.NavigatorsListener());//dashboard
        view.getButton4().addActionListener(new CreateAccountController.NavigatorsListener());//view project
        view.getButton5().addActionListener(new CreateAccountController.NavigatorsListener());//Skipped: active screen (current screen)
        view.getButton6().addActionListener(new CreateAccountController.NavigatorsListener());//view report
        view.getButton7().addActionListener(new CreateAccountController.NavigatorsListener());//logout
    }

    public static CreateAccountController getInstance(CreateAccountView view) {
        if (singletonInstance == null) {
            singletonInstance = new CreateAccountController(view);
        }
        return singletonInstance;
    }

    class NavigatorsListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getButton3()) { //Admin - dashboard pressed
                view.dispose();
                NavBarController.AdminDashboardActionPerformed();
            } else if (e.getSource() == view.getButton4()) { // Admin - View Project pressed
                view.dispose();
                NavBarController.AdminViewProjectActionPerformed();
            } else if (e.getSource() == view.getButton6()) { // Admin - View Report Pressed
                view.dispose();
                NavBarController.AdminViewReportActionPerformed();
            } else if (e.getSource() == view.getButton7()) { // Admin - Logout Pressed
                view.dispose();
                NavBarController.LogoutActionPerformed();
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
                // Storing Credentials for the user (admin/lecturer/ student).
                User user = User.getInstance(userId, password, name, email, phone);
                user.StoreCredentials();

                //Storing details for the user.
                if(userType.equals("ADMIN")){
                    Admin admin = Admin.getInstance(userId, password, name, email, phone);
                    admin.StoreDetails(); // storing admin details in the DB

                } else if(userType.equals("LECTURER")){
                    Lecturer lecturer = Lecturer.getInstance(userId, password, name, email, phone);
                    lecturer.StoreDetails(); // storing lecturer details in the DB
                }
                else{
                    Student student = Student.getInstance(userId, password, name, email, phone, specialization);
                    student.StoreDetails();   // storing student details in the DB
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
