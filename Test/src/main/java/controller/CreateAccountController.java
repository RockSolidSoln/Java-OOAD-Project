package controller;

import view.CreateAccountView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccountController {
    private static CreateAccountController singletonInstance;
    private static CreateAccountView view;
//    private static Admin adminModel;


    public CreateAccountController(CreateAccountView view){
        this.view = view;

        this.view.getCreateAccountButton().addActionListener(new CreateAccountListener());
        this.view.getExitButton().addActionListener(new ExitListener());
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

            String phoneNo = view.getPhone();
            String name = view.getName();
            String specialization = view.getSpecialization();

            String userType = view.getUsertype();

            if(userType.equals("Admin")){

            } else if(userType.equals("Lecturer")){

            }
            else{
                
            }


        }
        
    }

    class ExitListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            
        }
        
    }
}
