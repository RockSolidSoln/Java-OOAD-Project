package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class LoginModel {
    public boolean loginAuthenticate(String userid, String password) {
        String basePath = System.getProperty("user.dir");
        try (BufferedReader reader = new BufferedReader(new FileReader(basePath + "\\Test\\src\\assets\\credentials.csv"))) { 
            String line;
            String dbUserId, dbPassWord;
            while ((line = reader.readLine()) != null) {
                
                String[] fields = line.split(",");
                dbUserId = fields[0];
                dbPassWord = fields[1];
                
                if (dbUserId.equals(userid) && dbPassWord.equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
