package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginModel {
    private String username;
    private char[] password;
    private ActionListener actionListener;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public char[] getPassword() {
        return password;
    }

    public void checkLogin() {
        // check username and password against database or other authentication method
        actionListener.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "login"));
    }
}
