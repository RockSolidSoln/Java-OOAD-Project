package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class LoginModel {
    public String userId;
    public String password;
    private static LoginModel singletonInstance;
    LoginModel(String userId, String password){
        this.userId = userId;
        this.password = password;
    }

    public static LoginModel getInstance(String userId, String password) {
        if (singletonInstance == null) {
                singletonInstance = new LoginModel(userId, password);
        }
        return singletonInstance;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean loginAuthenticate() {
        String basePath = System.getProperty("user.dir");
        try (BufferedReader reader = new BufferedReader(new FileReader(basePath + "\\Test\\src\\assets\\credentials.csv"))) { 
            String line;
            String dbUserId, dbPassWord;
            while ((line = reader.readLine()) != null) {
                
                String[] fields = line.split(",");
                dbUserId = fields[0];
                dbPassWord = fields[1];
                
                if (dbUserId.equals(this.userId) && dbPassWord.equals(this.password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
