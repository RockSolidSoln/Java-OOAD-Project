package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ayaan
 */
public class Project {
    private String projectId;
    private String projectName;
    private String projectSpecialization;
    private String projectDescription;
    private String lecturer;
    private String projectStatus;
    private String enrolledStudent;
   // private String enrolledStudent;
    // private String studentAssigned;

    private static Project singletonInstance;
        /* Constructor for the variables needed in project */
    public Project(String projectId, String projectName, String projectSpecialization, String projectDescription,
            String lecturer, String projectStatus, String enrolledStudent) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectSpecialization = projectSpecialization;
        this.projectDescription = projectDescription;
        this.lecturer = lecturer;
        this.projectStatus = projectStatus;
        this.enrolledStudent = enrolledStudent;
    }
        /*  Getting singleton Instance */
    public static Project getInstance(String projectId, String projectName, String projectSpecialization,
            String projectDescription, String lecturer, String projectStatus, String enrolledStudent) {
        if (singletonInstance == null) {
            singletonInstance = new Project(projectId, projectName, projectSpecialization, projectDescription, lecturer,
                    projectStatus, enrolledStudent);
        } else
            singletonInstance.UpdateInstance(projectId, projectName, projectSpecialization, projectDescription,
                    lecturer, projectStatus, enrolledStudent);

        return singletonInstance;
    }
        /* Updating signleton instance */
    public void UpdateInstance(String projectId, String projectName, String projectSpecialization,
            String projectDescription, String lecturer, String projectStatus, String enrolledStudent) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectSpecialization = projectSpecialization;
        this.projectDescription = projectDescription;
        this.lecturer = lecturer;
        this.projectStatus = projectStatus;
        this.enrolledStudent = enrolledStudent;
    }

    /* Getters:*/ 
    public String getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getSpecialization() {
        return projectSpecialization;
    }

    public String getDescription() {
        return projectDescription;
    }

    public String getLecturer() {
        return lecturer;
    }

    public String getProjectStatus() {
        return projectStatus;
    }
    // -------------------------------------------------
    /* Getting All Lecturer Ids from Lecturer.csv */
    public static List<String> getlecturerId() {
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
    
    public void saveProject() {
        String basePath = System.getProperty("user.dir");
        int counter = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(basePath + "\\Test\\src\\assets\\projects.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        counter++;
        projectId = "PR" + String.valueOf(counter);
        String filename = ("\\Test\\src\\assets\\projects.csv"); /*stores the path of the file */ 
        ArrayList<String> line = new ArrayList<>();

        line.add("PR" + counter + "," + projectName + "," + lecturer + "," + projectSpecialization + ","
                + projectDescription + "," + "active");
        Database.FilewriteBack(filename, line, true);
    }

    public ArrayList<ArrayList<String>> getAllProjects() {
        String path = "\\Test\\src\\assets\\projects.csv";
        ArrayList<ArrayList<String>> projectList = Database.getAllContents(path);
        return projectList;
    }
    
    /* For filtering the data from Project according lecturer.*/ 
    public ArrayList<ArrayList<String>> FilterByLecturerId(String lecturerId) {
        String path = "\\Test\\src\\assets\\projects.csv";

        /*  Calling the dataFiltration method to filter the Projects according to the
        lecturerId (saved in 3rd column in the DB).*/
        ArrayList<ArrayList<String>> filteredProjectsByLecturer = Database.dataFiltration(path, lecturerId, 3);
        return filteredProjectsByLecturer;
    }


    public ArrayList<ArrayList<String>> filterBySpecializationAndStatus(String projectSpecialization) {
        String path = "\\Test\\src\\assets\\projects.csv";

        /* Calling the dataFiltration method to filter the Applications according to the 
         projectId (saved in 1st column in the DB).*/ 
        ArrayList<ArrayList<String>> filteredProjectsByProjectSpec = Database.dataFiltration(path, projectSpecialization, 4);
        ArrayList<ArrayList<String>> filteredProjectsByProjectStatus = Database.dataFiltration(path, "active" , 6);
        
        // //----------------------DEBUGG------------------------------ 
        // System.out.println("I'm HERERERERERE NOW ");
                
        // for (int i = 0; i < filteredProjectsByProjectSpec.size(); i++) {
        //     for (int j = 0; j < filteredProjectsByProjectSpec.get(i).size(); j++) {
        //         System.out.print(filteredProjectsByProjectSpec.get(i).get(j) + " ");
        //     }
        //     System.out.println();
        // }

        // //----------------------------------------------------------


        ArrayList<ArrayList<String>> returnFinalContent = new ArrayList<ArrayList<String>>();
        
        for(int i = 0; i < filteredProjectsByProjectSpec.size(); i++){
            ArrayList<String> specRow = filteredProjectsByProjectSpec.get(i); 

            for(int j = 0; j < filteredProjectsByProjectStatus.size(); j++){
                ArrayList<String> statRow = filteredProjectsByProjectStatus.get(j); 
                if(specRow.get(0).equals(statRow.get(0))){
                    returnFinalContent.add(specRow);
                }
            }
            
        }
        
        
        return returnFinalContent;
    }


    public String ChangeActiveStatus(String projectId) {
        String path = "\\Test\\src\\assets\\projects.csv";
        /* Getting the line which is of the same Id.*/ 
        String[] operationItems = Database.FindDataFromDB(path, projectId);
        String changedStatus;
        if (operationItems[5].equals("active"))
            changedStatus = "inactive";
        else
            changedStatus = "active";

        Database.ChangeContent(path, projectId, operationItems, 6, changedStatus);

        return changedStatus;
    }

    public static void modifyProject(String projectId, String projectName, String specialization, String description){
        String path = "\\Test\\src\\assets\\projects.csv";
        String[] operationItems = Database.FindDataFromDB(path, projectId);
        String changedVal;
        // projectName = 2
        // specialization = 4
        // description = 5
        changedVal = projectName; 
        Database.ChangeContent(path, projectId, operationItems, 2, changedVal);

        changedVal = specialization;
        Database.ChangeContent(path, projectId, operationItems, 4, changedVal);

        changedVal = description;
        Database.ChangeContent(path, projectId, operationItems, 5, changedVal);

    }

    public static void updateAssignStudentinProject(String projectId, String studentId){
        String path = "\\Test\\src\\assets\\projects.csv";
        String[] operationItems = Database.FindDataFromDB(path, projectId);
        
        String changedVal = studentId;
        Database.ChangeContent(path, projectId, operationItems, 7, changedVal);
    }

    public static Boolean isStudentAvailable(String studentId){
        Boolean flag =  false;
        String path = "\\Test\\src\\assets\\projects.csv";
        ArrayList<ArrayList<String>> allContents = Database.dataFiltration(path, studentId, 7);
        if(allContents.isEmpty())
            return true;

        return false;
    }

    public static Project getDetailsInstance(String id){
        String path = ("\\Test\\src\\assets\\projects.csv");
        String projectId = id;
        String[] details = Database.FindDataFromDB(path, projectId);
       // System.out.println(details[0] + " " + details[1] + " " + details[2] + " " + details[3] +  " " + details[4] + " " + details[5] + " " + details[6]);
        Project projectInstance = Project.getInstance(details[0],details[1], details[2], details[3], details[4], details[5], details[6]); 

        return projectInstance;
    }

    public static void AssignStudent(String projectId, String studentId){
        Boolean availability = Project.isStudentAvailable(studentId);
        if(availability){
            ApplicationModel.deleteByProjectIdandStudentId(projectId, studentId);
            updateAssignStudentinProject(projectId, studentId);
        }
    }

    public void unAssignStudent(String projectId, String studentId){
        String path = ("\\Test\\src\\assets\\projects.csv");
        String[] projectRow = Database.FindDataFromDB(path, projectId);
        Database.ChangeContent(path, projectId, projectRow, 7, null);
    }   
}
