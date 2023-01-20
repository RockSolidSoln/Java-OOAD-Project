package model;

import java.io.*;
import java.util.ArrayList;

public class AdminRemarkModel {
    private static AdminRemarkModel singletonInstance;
    private static ArrayList<String> adminIds;
    private static ArrayList<String> adminRemarks;

    public AdminRemarkModel() {
        adminIds = new ArrayList<String>();
        adminRemarks = new ArrayList<String>();
    }

    public static AdminRemarkModel getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new AdminRemarkModel();
        }
        return singletonInstance;
    }
    public static ArrayList<String> getAdminIds(){
        return adminIds;
    }

    public static ArrayList<String> getAdminRemarks(){
        return adminRemarks;
    }

    public static void storeRemarks(String adminId, String adminRemark) {
        adminIds.add(adminId);
        adminRemarks.add(adminRemark);
    }


    public static void readRemark(String projectId){
        String basePath = System.getProperty("user.dir");
        String csvFile = basePath + "//Test//src//assets//remarks.csv";
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                if(row[0].equals(projectId)) {
                    String item2 = row[1];
                    String item3 = row[2];
                    storeRemarks(item2, item3);

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

    public static void publishComment(String projectId, String text){
        String basePath = System.getProperty("user.dir");

        String csvFile = basePath + "//Test//src//assets//remarks.csv";
        FileWriter fw = null;
        try {
            fw = new FileWriter(csvFile, true);
            fw.append(projectId).append(",").append(LoginModel.getUserId()).append(",").append(text).append("\n");
            fw.append(System.lineSeparator());
            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {

                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static String updateRemarks(String projectId) {
        String basePath = System.getProperty("user.dir");

        String csvFile = basePath + "//Test//src//assets//remarks.csv";
        BufferedReader br = null;
        String line = "";
        StringBuilder sb = new StringBuilder();

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                if (row[0].equals(projectId)) {
                    String item2 = row[1];
                    String item3 = row[2];
                    sb.append(item2).append(" ").append(item3).append("\n");
                }
            }
            return (sb.toString());
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
        return null;
    }

}
