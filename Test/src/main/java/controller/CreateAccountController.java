package controller;

import view.AdminDashboardView;
import view.CreateAccountView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    }

    public static CreateAccountController getInstance(CreateAccountView view) {
        if (singletonInstance == null) {
            singletonInstance = new CreateAccountController(view);
        }
        return singletonInstance;
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
            String specialization = view.getSpecialization();

            String userType = view.getUsertype();

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


        }
        
    }

    class ExitListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.dispose();
            var adminDashboardview = AdminDashboardView.getInstance();
            var adminDashboardcontroller = AdminDashboardController.getInstance(adminDashboardview);
            adminDashboardview.setVisible(true);
        }

    }
}
