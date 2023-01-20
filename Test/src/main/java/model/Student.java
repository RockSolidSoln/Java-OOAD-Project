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

        Database.FilewriteBack(filename, lines, true); 
    }

    public static Student getDetailsInstance(String id){
        String fileName = ("\\Test\\src\\assets\\student.csv");
        String userId = id;
        String[] details = Database.FindDataFromDB(fileName, userId);
        System.out.println(details[0] + " " + details[1] + " " + details[2] + " " + details[3] +  " " + details[4]);
        Student studentInstance = Student.getInstance(details[0],null, details[1], details[2], details[3], details[4]); 

        return studentInstance;
    }


}
