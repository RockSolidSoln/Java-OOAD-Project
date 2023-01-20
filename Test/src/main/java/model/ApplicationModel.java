package model;

import java.util.ArrayList;
/**
 *
 * @author Ayaan
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
        String line = projectId +"," + studentId + "," + studentName;
        ArrayList <String> lines = new ArrayList<String>();
        lines.add(line);
        String filename= ("\\Test\\src\\assets\\application.csv");

        Database.FilewriteBack(filename, lines, true); 
    }
    public void AssignStudent(String projectId, String studentId){
        Boolean availability = Project.isStudentAvailable(studentId);
        if(availability){
            //Application.deleteContent(studentId);
        }
    }   

    /*For filtering the data from Active student list according Project. */ 
    public ArrayList<ArrayList<String>> filterByProjectId(String projectId) {
        String path = "\\Test\\src\\assets\\application.csv";

        /* Calling the dataFiltration method to filter the Applications according to the 
         projectId (saved in 1st column in the DB).*/ 
        ArrayList<ArrayList<String>> filteredProjectsByProjectId = Database.dataFiltration(path, projectId, 1);
        return filteredProjectsByProjectId;
    }



}
