package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public static void FilewriteBack(String path, ArrayList<String> lines) {
        String basePath = System.getProperty("user.dir");

        try {
            String filename = (basePath + path); // stores the path of the file
            FileWriter fw = new FileWriter(filename, true); // the true will append the new data
            for (int i = 0; i < lines.size(); i++) {
                fw.write(lines.get(i));
            }
            fw.close();

            System.out.println("""
                    -----------------------------------------------------------------------------
                    Entry successful!, Your info has been saved in our system
                    ------------------------------------------------------------------------------
                    """);
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage()); /* if failed to write to file */
        }
    }

    /**
     * This method Read Credentials from the file and return the credentials in
     * another Array List
     */
    public static List<String> readFile(String path) {
        List<String> lines = null; /* to read already stored credentials data */
        try {
            String basePath = System.getProperty("user.dir");
            lines = Files.readAllLines(Paths.get(basePath + path)); // read from credentials file

            // for (String line : lines) {
            // String[] items = line.split(","); //split the comma, store every word in an
            // array
            // username = items[0]; //stores username
            // String password = items[1]; // stores password
            // credentials.add(username + " " + password); //add it in the credentials array
            // with a space
            // }
        } catch (Exception e) {
            /* If unable to read credentials from the files */
            System.out.println("Unable to read Credentials from file");
        }
        /* return credentials to check */
        return lines;
    }

    // To find details of an Object from the DB, using its Id and returning them in
    // Array of Strings.
    public static String[] FindDataFromDB(String path, String matchId) {
        String temp = "";
        String[] items = temp.split(",");
        try {
            String basePath = System.getProperty("user.dir");
            String filePath = basePath + path;
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            for (String line : lines) {
                items = line.split(",");
                if (items[0].equals(matchId)) {
                    return items;
                }
            }
            System.out.println("From Database-FindDataFromDB: The userId not matched with any in the Database");
        } catch (Exception e) {
            System.out.println("File Opening Error");
        }

        return items;
    }
    
    // To get the List of the Projects from the Database.
    public static ArrayList<ArrayList<String>> getProjectList(String path) {
        ArrayList <ArrayList<String>> allContents = new ArrayList< ArrayList<String>>();
        ArrayList <String> row;
       
        String basePath = System.getProperty("user.dir");
        String filePath = basePath + path;
        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                String[] items = line.split(",");
                row = new ArrayList<String>();
                row.add(items[0]);
                row.add(items[1]);
                row.add(items[2]);
                row.add(items[3]);
                row.add(items[4]);
                row.add(items[5]);
                
                allContents.add(row);
            }
    
        } catch (IOException e) {
            
            e.printStackTrace();
        }

        return allContents;
    }

    //To filter the data according to the matchId from the CSV files. 
    public static ArrayList<ArrayList<String>> dataFiltration(String path, String match, int col){
        
    }
}
