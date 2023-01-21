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
    

    /*For filtering the data from Active student list according Project. */ 
    public ArrayList<ArrayList<String>> filterByProjectId(String projectId) {
        String path = "\\Test\\src\\assets\\application.csv";

        /* Calling the dataFiltration method to filter the Applications according to the 
         projectId (saved in 1st column in the DB).*/ 
        ArrayList<ArrayList<String>> filteredProjectsByProjectId = Database.dataFiltration(path, projectId, 1);
        return filteredProjectsByProjectId;
    }

    /*For deleting a specific student's apply for a specific project. */
    public static void deleteByProjectIdandStudentId(String projectId, String studentId) {
        String path = "\\Test\\src\\assets\\application.csv";

        /*Filtering contents according to the ProjectId */
        ArrayList<ArrayList<String>> filteredProjectsByProjectId = Database.dataFiltration(path, projectId, 1);
        /*Filtering contents according to the StudentId */
        ArrayList<ArrayList<String>> filteredProjectsByStudentId = Database.dataFiltration(path, studentId , 2);
        
        
        /*Fetching the common elements, to delete a specific student's applicaiton to a specific project. */
        ArrayList<ArrayList<String>> finalContent = new ArrayList<ArrayList<String>>();
        
        for(int i = 0; i < filteredProjectsByProjectId.size(); i++){
            ArrayList<String> specRow = filteredProjectsByProjectId.get(i); 

            for(int j = 0; j < filteredProjectsByStudentId.size(); j++){
                ArrayList<String> statRow = filteredProjectsByStudentId.get(j); 
                if(specRow.equals(statRow)){
                    finalContent.add(specRow);
                }
            }
            
        }


        //Get AllContents from the database.
        ArrayList<ArrayList<String>> databaseAllContents = Database.getAllContents(path);
        
        //Adding data after Exclusion
        ArrayList<ArrayList<String>> afterExclusion = new ArrayList<ArrayList<String>>();
        for(int i = 0; i < databaseAllContents.size(); i++){
            ArrayList <String> databaseRow = databaseAllContents.get(i);
            for(int j = 0; j < finalContent.size(); j++){
                ArrayList<String> excludeRow = finalContent.get(j);
                if(databaseRow.equals(excludeRow) == false){
                    afterExclusion.add(databaseRow); 
                }
            }
        }

        // Making afterExclusion data as ArrayList <lines> to store in the database. 
        ArrayList<String> writeArr = new ArrayList<String>();
        for(int i = 0; i < afterExclusion.size(); i++){
            ArrayList <String> lineArr = afterExclusion.get(i);
            String line = "";
            for(int j = 0; j < lineArr.size(); j++){
                line += lineArr.get(j);
                line += ',';
            }
            writeArr.add(line);
        }
        
        Database.FilewriteBack(path, writeArr, false);
    }


}
