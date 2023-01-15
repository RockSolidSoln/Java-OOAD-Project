package model;

import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private String name;
    private String email;
    private String phone;

   

    public User(String username, String password, String name, String email, String phone){
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPhone(){
        return phone;
    }

    public void StoreCredentials(){
        
        String line = "\n"+ this.username +"," + this.password;
        ArrayList <String> lines = new ArrayList<String>();
        lines.add(line);
        String filename= ("\\Test\\src\\assets\\credentials.csv");

        Database.FilewriteBack(filename, lines); 
    }
}
