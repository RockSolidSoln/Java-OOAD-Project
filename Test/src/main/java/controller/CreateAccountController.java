package controller;

import view.CreateAccountView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Admin;
import model.Lecturer;

public class CreateAccountController {
    private static CreateAccountController singletonInstance;
    private final CreateAccountView view;
    //private final Admin adminModel;
    

    public CreateAccountController(CreateAccountView view){
        this.view = view;
        view.getCreateAccountButton().addActionListener(new CreateAccountListener());
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
            System.out.println("--Hello DEBUG--");
            // TODO Auto-generated method stub
            String userId = view.getUserId();
            String password = new String(view.getPassword());
            String email = view.getEmail();
            String phone = view.getPhone();
            String phoneNo = view.getPhone();
            String name = view.getName();
            String specialization = view.getSpecialization();

            String userType = view.getUsertype();

            if(userType.equals("ADMIN")){
                Admin admin = Admin.getInstance(userId, password, name, email, phone);
                admin.StoreCredentials();
                
            } else if(userType.equals("LECTURER")){
                Lecturer lecturer = Lecturer.getInstance(userId, password, name, email, phone); 
                
            }
            else{
                
            }


        }
        
    }

    class ExitListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
        
    }
}
