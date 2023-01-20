package model;

import java.util.ArrayList;
/**
 *
 * @author
 */
public class Admin extends User{
    private static Admin singletonInstance;
    Admin(String username, String password, String name, String email, String phone){
        super(username, password, name, email, phone);
    }

    public static Admin getInstance(String username, String password, String name, String email, String phone){
        if(singletonInstance == null){
            singletonInstance = new Admin(username, password, name, email, phone);
        }
        else
            singletonInstance.UpdateInstance(username, password, name, email, phone);
        return singletonInstance;
    }
    
    //to update the singleton instance. 
    public void UpdateInstance(String username, String password, String name, String email, String phone){
        super.UpdateInstance(username, password, name, email, phone);
    }

    @Override
    public void StoreDetails(){
        String line = super.getUsername() +"," + super.getName() + "," + super.getEmail() + "," + super.getPhone();
        ArrayList <String> lines = new ArrayList<String>();
        lines.add(line);
        String fileName= ("\\Test\\src\\assets\\admin.csv");

        Database.FilewriteBack(fileName, lines, true); 
    }
    
    public static Admin getDetailsInstance(String id){
        String fileName = ("\\Test\\src\\assets\\admin.csv");
        String userId = id;
        String[] details = Database.FindDataFromDB(fileName, userId);
        System.out.println(details[0] + " " + details[1] + " " + details[2] + " " + details[3]);
        Admin adminInstance = Admin.getInstance(details[0],null, details[1], details[2], details[3]); 

        return adminInstance;
    }
}
