package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Project {
    private String projectId;
    private String projectName;
    private String projectSpecialization;
    private String projectDescription;
    private String lecturer;
    private String projectStatus;
   // private String studentAssigned;


    private static Project singletonInstance;

    public Project(String projectId, String projectName, String projectSpecialization, String projectDescription, String lecturer, String projectStatus){
        this.projectId = projectId;
        this.projectName = projectName;
        this. projectSpecialization = projectSpecialization;
        this.projectDescription = projectDescription;
        this.lecturer = lecturer;
        this.projectStatus = projectStatus;
    }

    public static Project getInstance(String projectId, String projectName, String projectSpecialization, String projectDescription, String lecturer, String projectStatus) {
        if (singletonInstance == null) {
            singletonInstance = new Project(projectId, projectName, projectSpecialization, projectDescription, lecturer, projectStatus);
        }
        else 
            singletonInstance.UpdateInstance(projectId, projectName, projectSpecialization, projectDescription, lecturer, projectStatus);
        
        return singletonInstance; 
    }

    public void UpdateInstance(String projectId, String projectName, String projectSpecialization, String projectDescription, String lecturer, String projectStatus){
        this.projectId = projectId;
        this.projectName = projectName;
        this. projectSpecialization = projectSpecialization;
        this.projectDescription = projectDescription;
        this.lecturer = lecturer;
        this.projectStatus = projectStatus;
    }


    //Getters: 
    public String getProjectId() {
        return projectId;
    }
    public String getProjectName() {
        return projectName;
    }
    public String getSpecialization(){
        return projectSpecialization;
    }
    public String getDescription(){
        return projectDescription;
    }
    public String getLecturer(){
        return lecturer;
    }
    public String getProjectStatus(){
        return projectStatus;
    }
    //-------------------------------------------------
    
    public static List<String> getlecturer() {
        String line = "";
        List<String> lecturers = new ArrayList<>();
        String csvSplitBy = ",";
        String basePath = System.getProperty("user.dir");
        try (BufferedReader br = new BufferedReader(new FileReader(basePath + "\\Test\\src\\assets\\lecturer.csv"))) {
            while ((line = br.readLine()) != null) {
                String[] lec = line.split(csvSplitBy);
                lecturers.add(lec[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lecturers;
    }

    public void saveProject(){
        String basePath = System.getProperty("user.dir");
        int counter = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(basePath + "\\Test\\src\\assets\\projects.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                counter++;
            }
        }catch (IOException e) {
                e.printStackTrace();
        }
        counter++;
        projectId = "PR" + String.valueOf(counter);
        String filename= ("\\Test\\src\\assets\\projects.csv");    //stores the path of the file
        ArrayList<String> line = new ArrayList<>();

        line.add("PR"+counter+","+projectName+","+lecturer+","+projectSpecialization+","+projectDescription+","+"active"+"\n");
        Database.FilewriteBack(filename, line);
    }

    public ArrayList<ArrayList<String>> getAllProjects(){
        String path = "\\Test\\src\\assets\\projects.csv";
        ArrayList<ArrayList<String>> projectList = Database.getProjectList(path);
        return projectList;
    }

    //For filtering the data from Project according lecturer.
    public ArrayList<ArrayList<String>> FilterByLecturerId(String lecturerId){
        String path = "\\Test\\src\\assets\\projects.csv";

        //Calling the dataFiltration method to filter the Projects according to the lecturerId (saved in 3rd column in the DB).
        ArrayList<ArrayList<String>> filteredProjectsByLecturer = Database.dataFiltration(path, lecturerId, 3);
        return filteredProjectsByLecturer; 
    }

    //For filtering the data from Active student list according Project.
    public ArrayList<ArrayList<String>> FilterByProjectId(String projectId){
        String path = "\\Test\\src\\assets\\application.csv";

        //Calling the dataFiltration method to filter the Applications according to the projectId (saved in 1st column in the DB).
        ArrayList<ArrayList<String>> filteredProjectsByProjectId = Database.dataFiltration(path, projectId, 1);
        return filteredProjectsByProjectId;
    }

    
}
