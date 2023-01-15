package model;

import java.util.ArrayList;

public class Student extends User{
    private String specialization;
    private static Student singletonInstance;

    public Student(String username, String password, String name, String email, String phone, String specialization){
        super(username, password, name, email, phone);
        this.specialization = specialization;
    }

    public static Student getInstance(String username, String password, String name, String email, String phone, String specialization){
        if(singletonInstance == null){
            singletonInstance = new Student(username, password, name, email, phone, specialization);
        }
        else
            singletonInstance.UpdateInstance(username, password, name, email, phone, specialization);
        return singletonInstance;
    }

    public void UpdateInstance(String username, String password, String name, String email, String phone, String specialization){
        super.UpdateInstance(username, password, name, email, phone);
        this.specialization = specialization;
    }

    public String getSpecialization(){
        return specialization;
    }

    @Override
    public void StoreDetails(){
        String line = super.getUsername() +"," + super.getName() + "," + super.getEmail() + "," + super.getPhone() + "," + specialization + "\n";
        ArrayList <String> lines = new ArrayList<String>();
        lines.add(line);
        String filename= ("\\Test\\src\\assets\\student.csv");

        Database.FilewriteBack(filename, lines); 
    }


}
