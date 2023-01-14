package controller;

import view.CreateAccountView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccountController {
    private static CreateAccountController singletonInstance;
    private static CreateAccountView view;

    public CreateAccountController(CreateAccountView view){

    }

    public static CreateAccountController getInstance(CreateAccountView view) {
        if (singletonInstance == null) {
            singletonInstance = new CreateAccountController(view);
        }
        return singletonInstance;
    }

    static abstract class NavigatorsListener implements ActionListener{

    }
}
