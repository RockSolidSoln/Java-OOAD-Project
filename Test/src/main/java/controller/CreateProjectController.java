package controller;

import view.CreateProjectView;

import java.awt.event.ActionListener;

public class CreateProjectController {
    private static CreateProjectController singletonInstance;
    private static CreateProjectView view;

    public CreateProjectController(CreateProjectView view){

    }

    public static CreateProjectController getInstance(CreateProjectView view) {
        if (singletonInstance == null) {
            singletonInstance = new CreateProjectController(view);
        }
        return singletonInstance;
    }

    static abstract class NavigatorsListener implements ActionListener {

    }
}
