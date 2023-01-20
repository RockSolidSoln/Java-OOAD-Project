package view;

import model.LoginModel;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author
 */
public class LecturerProjectDetailsView extends JFrame {

    // Variables declaration - do not modify
    private  String projectId;
    private  String projectName;
    private  String specialization;
    private  String status;
    private JButton activateDeactivateButton;
    private JButton backButton;
    private JButton modifyContentButton;
    private JButton unassignButton;
    private JButton viewApplyingListButton;
    private JLabel projectIdLabel2;
    private JLabel projectNameLabel2;
    private JTextField detailsTextField;
    private JLabel specializationLabel2;
    JLabel statusLabel = new JLabel();
    private String details;


    public LecturerProjectDetailsView(String projectID, String projectName, String specialization, String status, String details) {
        this.projectId = projectID;
        this.projectName = projectName;
        this.specialization = specialization;
        this.status = status;
        this.details = details;

        initComponents();
    }

    public static LecturerProjectDetailsView singletonInstance;

    public static LecturerProjectDetailsView getInstance(String projectID, String projectName, String specialization, String status, String details) {
        if (singletonInstance == null) {
            singletonInstance = new LecturerProjectDetailsView(projectID, projectName, specialization, status, details);
        }
        else
                singletonInstance.updateInstance(projectID, projectName, specialization, status, details);
        return singletonInstance;
    }

    public void updateInstance(String projectID, String projectName, String specialization, String status, String details){
        this.projectId = projectID;
        this.projectName = projectName;
        this.specialization = specialization;
        this.status = status;
        this.details = details;

        projectNameLabel2.setText(projectName);
        specializationLabel2.setText(specialization);
        projectIdLabel2.setText(projectID);
        statusLabel.setText(status);
        detailsTextField.setText(details);
        //initComponents();
    }


    
    // End of variables declaration
    private void initComponents() {

        JPanel jPanel2 = new JPanel();
        JLabel projectNameLabel = new JLabel();
        JLabel specializationLabel = new JLabel();
        JLabel studentNameLabel = new JLabel();
        projectNameLabel2 = new JLabel();
        specializationLabel2 = new JLabel();
        detailsTextField = new JTextField();
        backButton = new JButton();
        JLabel detailsLabel1 = new JLabel();
        unassignButton = new JButton();
        modifyContentButton = new JButton();
        activateDeactivateButton = new JButton();
        viewApplyingListButton = new JButton();
        JLabel jLabel1 = new JLabel();
        JLabel studentNameLabel2 = new JLabel();
        projectIdLabel2 = new JLabel();
        JLabel projectIdLabel = new JLabel();
        JLabel lecturerIdLabel = new JLabel();
        JLabel lecturerIdLabel2 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new Color(0, 168, 209));

        projectNameLabel.setBackground(new Color(230, 230, 230));
        projectNameLabel.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        projectNameLabel.setForeground(new Color(230, 230, 230));
        projectNameLabel.setText("Project Name");

        specializationLabel.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        specializationLabel.setForeground(new Color(230, 230, 230));
        specializationLabel.setText("Specialization");

        projectNameLabel2.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        projectNameLabel2.setForeground(new Color(230, 230, 230));
        projectNameLabel2.setText(projectName);

        specializationLabel2.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        specializationLabel2.setForeground(new Color(230, 230, 230));
        specializationLabel2.setText(specialization);

        detailsTextField.setBackground(new Color(230, 230, 230));


        studentNameLabel.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        studentNameLabel.setForeground(new java.awt.Color(230, 230, 230));
        studentNameLabel.setText("Student Name:");

        backButton.setBackground(new Color(235, 252, 255));
        backButton.setForeground(new Color(0, 0, 0));
        backButton.setText("Back");

        detailsLabel1.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        detailsLabel1.setForeground(new Color(230, 230, 230));
        detailsLabel1.setText("Details");

        unassignButton.setBackground(new Color(235, 252, 255));
        unassignButton.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        unassignButton.setText("Unassign Student");

        modifyContentButton.setBackground(new Color(235, 252, 255));
        modifyContentButton.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        modifyContentButton.setText("Modify content");

        activateDeactivateButton.setBackground(new Color(235, 252, 255));
        activateDeactivateButton.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        activateDeactivateButton.setText("Activate/Deactivate Project");

        viewApplyingListButton.setBackground(new Color(235, 252, 255));
        viewApplyingListButton.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        viewApplyingListButton.setText("View Applying List");

        jLabel1.setFont(new Font("Segoe UI", Font.PLAIN, 24)); // NOI18N
        jLabel1.setText("Project Screen");

        studentNameLabel2.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        studentNameLabel2.setForeground(new Color(230, 230, 230));
        studentNameLabel2.setText("");

        projectIdLabel2.setBackground(new Color(230, 230, 230));
        projectIdLabel2.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        projectIdLabel2.setForeground(new Color(230, 230, 230));
        projectIdLabel2.setText(projectId);

        projectIdLabel.setBackground(new Color(230, 230, 230));
        projectIdLabel.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        projectIdLabel.setForeground(new Color(230, 230, 230));
        projectIdLabel.setText("Project ID");

        lecturerIdLabel.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        lecturerIdLabel.setForeground(new Color(230, 230, 230));
        lecturerIdLabel.setText("Lecturer ID");

        lecturerIdLabel2.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        lecturerIdLabel2.setForeground(new Color(230, 230, 230));
        lecturerIdLabel2.setText(LoginModel.getUserId());

        statusLabel.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        statusLabel.setForeground(new Color(230, 230, 230));
        statusLabel.setText(status);

        jLabel1.setFont(new Font("Segoe UI", Font.PLAIN, 24)); // NOI18N
        jLabel1.setText("Project Screen");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(projectNameLabel)
                                                                        .addComponent(studentNameLabel)
                                                                        .addComponent(lecturerIdLabel))
                                                                .addGap(79, 79, 79)
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(lecturerIdLabel2, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(projectIdLabel)
                                                                                        .addComponent(specializationLabel))
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(projectIdLabel2, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(specializationLabel2, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)))
                                                                        .addComponent(studentNameLabel2, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(projectNameLabel2, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(71, 71, 71)
                                                                .addComponent(activateDeactivateButton)
                                                                .addGap(63, 63, 63)
                                                                .addComponent(modifyContentButton, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(86, 86, 86)
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(unassignButton, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(66, 66, 66)
                                                                                .addComponent(viewApplyingListButton, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 74, Short.MAX_VALUE))
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(detailsLabel1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(detailsTextField, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(33, 33, 33))))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(backButton)
                                                .addGap(347, 347, 347)
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(statusLabel, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(backButton))
                                .addGap(2, 2, 2)
                                .addComponent(statusLabel)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(projectNameLabel)
                                        .addComponent(projectNameLabel2)
                                        .addComponent(projectIdLabel2)
                                        .addComponent(projectIdLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(specializationLabel)
                                        .addComponent(specializationLabel2)
                                        .addComponent(studentNameLabel2)
                                        .addComponent(studentNameLabel))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lecturerIdLabel)
                                        .addComponent(lecturerIdLabel2)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(detailsLabel1)
                                                        .addComponent(detailsTextField, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
                                                .addGap(14, 14, 14)))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(viewApplyingListButton)
                                                .addComponent(modifyContentButton)
                                        .addComponent(unassignButton)
                                        .addComponent(activateDeactivateButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
        );

        detailsTextField.setEditable(false);
        detailsTextField.setText(details);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        



    public JButton getActivateDeactivateButton(){
        return activateDeactivateButton;
    }

    public JButton getBackButton(){
        return backButton;
    }

    public JButton getUnassignButton(){
        return unassignButton;
    }

    public JButton getModifyButton(){
        return modifyContentButton;
    }

    public JButton getApplyingListButton(){
        return viewApplyingListButton;
    }

    public String getProjectId(){
        return projectIdLabel2.getText();
    }
    public String getProjectName(){
        return projectNameLabel2.getText();
    }
    public String getProjectDetails(){
        return detailsTextField.getText();
    }
    public String getProjectSpecialization(){
        return specializationLabel2.getText();
    }

    public void displaySuccessMessage(String newStatus) {
        JOptionPane.showMessageDialog(null, "Success! The Project Status Changed to " + newStatus.toUpperCase(), "Success", JOptionPane.INFORMATION_MESSAGE);
    }
}