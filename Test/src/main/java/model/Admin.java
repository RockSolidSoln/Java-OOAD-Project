package model;

import java.util.ArrayList;

public class Admin extends User{
    private static Admin singletonInstance;
    Admin(String username, String password, String name, String email, String phone){
        super(username, password, name, email, phone);
    }

    public static Admin getInstance(String username, String password, String name, String email, String phone){
        if(singletonInstance == null){
            singletonInstance = new Admin(username, password, name, email, phone);
        }
        return singletonInstance;
    }


    public void StoreCredentials(){
        
        String line = "\n"+ super.getUsername() +"," + super.getPassword();
        ArrayList <String> lines = new ArrayList<String>();
        lines.add(line);
        String filename= ("\\Test\\src\\assets\\credentials.csv");
        

        Database.FilewriteBack(filename, lines); 
    }
    
}
