package model;

public class Student extends User{
    private String specialization;

    Student(String username, String password, String name, String email, String phone){
        super(username, password, name, email, phone);
    }

    
}
