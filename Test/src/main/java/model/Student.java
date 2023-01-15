package model;

public class Student extends User{
    private String specialization;
    private static Student singletonInstance;

    Student(String username, String password, String name, String email, String phone, String specialization){
        super(username, password, name, email, phone);
        this.specialization = specialization;
    }

    public static Student getInstance(String username, String password, String name, String email, String phone, String specialization){
        if(singletonInstance == null){
            singletonInstance = new Student(username, password, name, email, phone, specialization);
        }
        return singletonInstance;
    }


}
