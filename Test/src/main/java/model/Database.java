package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Database {
    public static void FilewriteBack(String path, ArrayList<String> lines){
        String basePath = System.getProperty("user.dir");

        try{
            String filename= (basePath + path);    //stores the path of the file
            FileWriter fw = new FileWriter(filename,true);          //the true will append the new data
            for(int i=0; i<lines.size(); i++){
                fw.write(lines.get(i));
            }
            fw.close();

            System.out.println("""
                        -----------------------------------------------------------------------------
                        Entry successful!, Your info has been saved in our system
                        ------------------------------------------------------------------------------
                        """);
        }catch(IOException ioe){
            System.err.println("IOException: " + ioe.getMessage()); /*if failed to write to file*/
        }
    }
}
