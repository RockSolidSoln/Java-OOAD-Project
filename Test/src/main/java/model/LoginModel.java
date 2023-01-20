package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class LoginModel {
    public static String userId;
    public String password;
    private static LoginModel singletonInstance;
    LoginModel(String userId, String password){     /*  Constructor for password and UserId*/
        this.userId = userId;
        this.password = password;
    }
    /* getting the singleton instance for loginModel */ 
    public static LoginModel getInstance(String userId, String password) {
        if (singletonInstance == null) {
                singletonInstance = new LoginModel(userId, password);
        }
        else    
            singletonInstance.UpdateInstance(userId, password);
        return singletonInstance;
    }

    public void UpdateInstance(String userId, String password){
        this.userId = userId;
        this.password = password;
    }

    /*  Setter for UserID */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    /* Getter for UserID */
    public static String getUserId() {
        return userId;
    }
    /*Setter for Password*/
    public void setPassword(String password) {
        this.password = password;
    }

        /*Verification Process for login where we read from credentials.csv  */
    public boolean loginAuthenticate() {
        String basePath = System.getProperty("user.dir");
        try (BufferedReader reader = new BufferedReader(new FileReader(basePath + "\\Test\\src\\assets\\credentials.csv"))) { /*Credentials is the main and the only file for authentication purposes */
            String line;
            String dbUserId, dbPassWord;
            while ((line = reader.readLine()) != null) {
                
                String[] fields = line.split(",");  /*  Filtering the csv file */
                dbUserId = fields[0];
                dbPassWord = fields[1];
                
                if (dbUserId.equals(this.userId) && dbPassWord.equals(this.password)) {         /*  If Authentication is successful */
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;                               /*If Authentication failed */ 
    }
}
