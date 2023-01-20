package controller;

import model.LoginModel;
import view.AdminRemarkView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AdminRemarkController {
    public final AdminRemarkView view;
    private static AdminRemarkController singletonInstance;


    public AdminRemarkController(AdminRemarkView view){
        this.view = view;

        view.getCommentField().addActionListener(new AdminRemarkController.RemarkListener());
        view.getBackButton().addActionListener(new AdminRemarkController.RemarkListener()); //go back to view projects
        view.getPublishCommentButton().addActionListener(new AdminRemarkController.RemarkListener());

        String basePath = System.getProperty("user.dir");
        String csvFile = basePath + "//Test//src//assets//remarks.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                if(row[0].equals(view.getProjectId())) {
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
    public static AdminRemarkController getInstance(AdminRemarkView view) {
        if (singletonInstance == null) {
            singletonInstance = new AdminRemarkController(view);
        }
        return singletonInstance;
    }

    public class RemarkListener implements ActionListener{

        private void publishCommentButtonActionPerformed(ActionEvent e) {
            String text = view.getCommentField().getText();
            String basePath = System.getProperty("user.dir");

            String csvFile = basePath + "//Test//src//assets//remarks.csv";
            FileWriter fw = null;
            try {
                fw = new FileWriter(csvFile, true);
                fw.append(view.getProjectId() + "," +LoginModel.getUserId()+ ","+text+"\n");
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
            // read the file and update the text area
            readFile();
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getPublishCommentButton()) {
                publishCommentButtonActionPerformed(e);
            } else if (e.getSource() == view.getBackButton()) {
                NavBarController.AdminViewProjectActionPerformed();
            }

        }

        public void readFile() {
            String basePath = System.getProperty("user.dir");

            String csvFile = basePath + "//Test//src//assets//remarks.csv";
            BufferedReader br = null;
            String line = "";
            StringBuilder sb = new StringBuilder();

            try {
                br = new BufferedReader(new FileReader(csvFile));
                while ((line = br.readLine()) != null) {
                    String[] row = line.split(",");
                    if (row[0].equals(view.getProjectId())) {
                        String item2 = row[1];
                        String item3 = row[2];
                        sb.append(item2 + " " + item3 + "\n");
                    }
                }
                view.getComment().setText(sb.toString());
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

}
