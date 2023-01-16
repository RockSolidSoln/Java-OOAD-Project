package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Project {
    private String projectId;
    private String projectName;
    private String specialization;
    private String description;
    private String lecturer;
    private String projectStatus;
   // private String studentAssigned;


    private static Project singletonInstance;
    public static Project getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Project();
        }
        return singletonInstance;
    }

    //Setters:
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }
    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }
    //-----------------------------------------------
    //Getters: 
    public String getProjectId() {
        return projectId;
    }
    public String getProjectName() {
        return projectName;
    }
    public String getSpecialization(){
        return specialization;
    }
    public String getDescription(){
        return description;
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

        line.add("PR"+counter+","+projectName+","+lecturer+","+specialization+","+description+","+"active"+"\n");
        Database.FilewriteBack(filename, line);
    }
}
