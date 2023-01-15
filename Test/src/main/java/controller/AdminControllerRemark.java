package controller;

import view.AdminViewRemark;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AdminControllerRemark {
    private static AdminControllerRemark singletonInstance;
    private final AdminViewRemark view;
    //private final Admin adminModel;

    public static AdminControllerRemark getInstance(AdminViewRemark view) {
        if (singletonInstance == null) {
            singletonInstance = new AdminControllerRemark(view);
        }
        return singletonInstance;
    }
    public AdminControllerRemark(AdminViewRemark view){
        this.view = view;

        String basePath = System.getProperty("user.dir");

        String csvFile = basePath + "//Test//src//assets//remarks.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                if(row[0].equals(this.view.getProjectId())) {
                    String item2 = row[1];
                    String item3 = row[2];
                    view.getComment().append(item2 + ": " + item3 + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }



}
