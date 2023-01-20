package model;

import java.util.ArrayList;
/**
 *
 * @author Tanzir
 */
public abstract class User {
    private String username;
    private String password;
    private String name;
    private String email;
    private String phone;

    private static User singletonInstance;

    public abstract void StoreDetails();

    public User(String username, String password, String name, String email, String phone){
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public static User getInstance(String username, String password, String name, String email, String phone) {
        if (singletonInstance == null) {
            singletonInstance = new User(username, password, name, email, phone){
                public void StoreDetails() {}
            };
        }
        else 
            singletonInstance.UpdateInstance(username, password, name, email, phone);
        
        return singletonInstance;
    }

    public void UpdateInstance(String username, String password, String name, String email, String phone){
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
        
        String line = this.username +"," + this.password;
        ArrayList <String> lines = new ArrayList<String>();
        lines.add(line);
        String filename= ("\\Test\\src\\assets\\credentials.csv");

        Database.FilewriteBack(filename, lines, true); 
    }

    
}
