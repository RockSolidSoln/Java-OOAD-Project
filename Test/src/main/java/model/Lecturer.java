package model;

import java.util.ArrayList;

public class Lecturer extends User{
    private static Lecturer singletonInstance;
    Lecturer(String username, String password, String name, String email, String phone){
        super(username, password, name, email, phone);
    }
    /*  Getting singleton Instance */
    public static Lecturer getInstance(String username, String password, String name, String email, String phone){
        if(singletonInstance == null){
            singletonInstance = new Lecturer(username, password, name, email, phone);
        }
        else   
            singletonInstance.UpdateInstance(username, password, name, email, phone);
        return singletonInstance;
    }

    /*to update the singleton instance. */
    public void UpdateInstance(String username, String password, String name, String email, String phone){
        super.UpdateInstance(username, password, name, email, phone);
    }
    /* Storing data for Lecturer in lecturer.csv */
    @Override
    public void StoreDetails(){
        String line = super.getUsername() +"," + super.getName() + "," + super.getEmail() + "," + super.getPhone() + "\n";
        ArrayList <String> lines = new ArrayList<String>();
        lines.add(line);
        String filename= ("\\Test\\src\\assets\\lecturer.csv");

        Database.FilewriteBack(filename, lines, true); 
    }
}
