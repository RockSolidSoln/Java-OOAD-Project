package model;

import java.util.ArrayList;

public class Lecturer extends User{
    private static Lecturer singletonInstance;
    Lecturer(String username, String password, String name, String email, String phone){
        super(username, password, name, email, phone);
    }

    public static Lecturer getInstance(String username, String password, String name, String email, String phone){
        if(singletonInstance == null){
            singletonInstance = new Lecturer(username, password, name, email, phone);
        }
        return singletonInstance;
    }


}
