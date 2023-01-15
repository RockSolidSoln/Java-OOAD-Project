package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateProjectModel {
    public String project_name;
    public String specialization;
    public String description;
    public String lecturer;

    private static CreateProjectModel singletonInstance;
    public static CreateProjectModel getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new CreateProjectModel();
        }
        return singletonInstance;
    }

    public void setProjectName(String project_name) {
        this.project_name = project_name;
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
        String filename= ("\\Test\\src\\assets\\projects.csv");    //stores the path of the file
        ArrayList<String> line = new ArrayList<>();

        line.add("PR"+counter+","+project_name+","+lecturer+","+specialization+","+description+","+"active"+"\n");
        Database.FilewriteBack(filename, line);
    }
}
