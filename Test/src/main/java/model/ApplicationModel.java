package model;

import java.util.ArrayList;
/**
 *
 * @author
 */
public class ApplicationModel {
    private String projectId;
    private String studentId;
    private String studentName;

    private static ApplicationModel singletonInstance;

    private ApplicationModel(String projectId, String studentId, String studentName){
        this.projectId = projectId;
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public static ApplicationModel getInstance(String projectId, String studentId, String studentName){
        if (singletonInstance == null) {
            singletonInstance = new ApplicationModel(projectId, studentId, studentName);
        }
        else
            singletonInstance.updateInstance(projectId, studentId, studentName);
        return singletonInstance;
    }

    public void updateInstance(String projectId, String studentId, String studentName){
        this.projectId = projectId;
        this.studentId = studentId;
        this.studentName = studentName;
    }
    
    public void StoreDetails(){
        String line = projectId +"," + studentId + "," + studentName + "\n";
        ArrayList <String> lines = new ArrayList<String>();
        lines.add(line);
        String filename= ("\\Test\\src\\assets\\application.csv");

        Database.FilewriteBack(filename, lines, true); 
    }




}
