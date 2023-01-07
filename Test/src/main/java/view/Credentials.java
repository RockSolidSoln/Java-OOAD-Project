package view;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Credentials {
    /**To store username*/
    private static String username;

    /**Default constructor*/
    public Credentials(){
    }

    /**This method Read Credentials from the file and return the credentials in another Array List*/
    public static ArrayList<String> readCredsFromFile(){
        ArrayList<String> credentials = new ArrayList<>();      /*to store credentials data*/
        List<String> lines = new ArrayList<>();                 /*to read already stored credentials data*/
        try{
            String basePath = System.getProperty("user.dir");
            lines = Files.readAllLines(Paths.get(basePath + "\\Test\\src\\assets\\credentials.csv")); //read from credentials file
            
            for (String line : lines) {
                String[] items = line.split(","); //split the comma, store every word in an array
                username = items[0];    //stores username
                String password = items[1];    // stores password
                credentials.add(username + " " + password); //add it in the credentials array with a space
            }
        }catch(Exception e){
            /*If unable to read credentials from the files*/
            System.out.println("Unable to read Credentials from file");
        }
        /*return credentials to check*/
        return credentials;
    }
    //------------------------------------------------------------------------------------
    public static void authenticateUser(String name, String password) throws Exception {// flag is to check if user is Donor or Ngo
        ArrayList<String> credentials = Credentials.readCredsFromFile();
        boolean check=false;
        
        for (int i = 0; i<credentials.size();i++){
            check = credentials.get(i).equals(name+" "+password); //check if name and password matches in the Credentials files
            
            System.out.println(credentials.get(i));
            if(check) {             //if name and password match
                System.out.println("---------------------------------------------\n"+
                                   "   Login was Successful\n"+
                                   "---------------------------------------------\n");
                // String[] temp = credentials.get(i).split("\\s"); //split at the spaces    //stores username
                break;
            }
        }
    }
    //------------------------------------------------------------------------------------

    /**This method Saves the info of new user*/
    public static void saveCredsToFile(String name, String email, String password, String role, String phone) throws IOException { 
        
        String userId = role+"002";
        ArrayList<String> credentials = readCredsFromFile(); /*read credentials from file accordingly*/
        int innerFlag=0;                        // flag to check is username already exists in credentials

        for (String credential : credentials) {
            String[] items = credential.split(",");     //split the comma
            /*split the spaces*/
            String[] temp = items[0].split("\\s");
            username = temp[0];                  // stores username
            // if (username.equals(name)) {
            //     innerFlag = 1;                    //to mark name already in the user
            // }
        }
            try{
                String basePath = System.getProperty("user.dir");
                String filename= basePath + "\\Test\\src\\assets\\credentials.csv";    //stores the path of the file
                FileWriter fw = new FileWriter(filename,true);          //the true will append the new data
                fw.write("\n"+userId+","+password);              //appends the string to the file
                fw.close();

                String filenameUser = basePath + "\\Test\\src\\main\\assets\\userdata.csv";  
                FileWriter fw1 = new FileWriter(filenameUser,true);          //the true will append the new data
                fw1.write("\n"+userId+","+name+","+email+","+role+","+phone);              //appends the string to the file
                fw1.close();

                System.out.println("""

                        Entry successful!, Your info has been saved in our system
                        ------------------------------------------------------------------------------
                        """);
            }catch(IOException ioe){
                    System.err.println("IOException: " + ioe.getMessage()); /*if failed to write to file*/
            }
        }    
    //------------------------------------------------------------------------------------
}
