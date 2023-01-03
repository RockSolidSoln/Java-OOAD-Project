import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


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
            lines = Files.readAllLines(Paths.get("../../assets/credentials.csv")); //read from credentials file

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

            if(check) {             //if name and password match
                System.out.println("---------------------------------------------\n"+
                                   "   Login was Successful\n"+
                                   "---------------------------------------------\n");
                String[] temp = credentials.get(i).split("\\s"); //split at the spaces    //stores username
                break;
            }
        }
    }
    //------------------------------------------------------------------------------------
}
