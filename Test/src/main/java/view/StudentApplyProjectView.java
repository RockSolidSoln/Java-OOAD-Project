package view;


import model.LoginModel;
import model.Student;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Anis
 */
public class StudentApplyProjectView extends JFrame {

    /**
     * Creates new form StudentApplyProjectView
     */
    private static String projectId;
    private static String projectName;
    private static String lecturerId;
    private static String details;
    
    public StudentApplyProjectView(String projectId, String projectName, String lecturerId, String details) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.lecturerId = lecturerId;
        this.details = details;
        initComponents();
    }
    private JLabel lecturerNameLabel2;
    private JLabel projectIdLabel2;
    private JLabel projectNameLabel2;
    // Variables declaration - do not modify
    private JButton backButton;
    private JButton applyButton;

    private JTextField projectDetailsTextField;

    private static StudentApplyProjectView singletonInstance;

    public static StudentApplyProjectView getInstance(String projectId, String projectName, String lecturerId, String details){
        if (singletonInstance == null) {
            singletonInstance = new StudentApplyProjectView(projectId, projectName, lecturerId, details);
        }
        else
                singletonInstance.updateInstance(projectId, projectName, lecturerId, details);
        return singletonInstance;
    }
    
    public void updateInstance(String projectId, String projectName, String lecturerId, String details){
        this.projectId = projectId;
        this.projectName = projectName;
        this.lecturerId = lecturerId;
        this.details = details;

        projectIdLabel2.setText(projectId);
        projectNameLabel2.setText(projectName);
        lecturerNameLabel2.setText(lecturerId);
        projectDetailsTextField.setText(details);

    }

    private void initComponents() {
        System.out.println(details);
        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel projectNameLabel = new JLabel();
        JLabel projectIdLabel = new JLabel();
        JLabel projectDetails = new JLabel();
        projectNameLabel2 = new JLabel();
        JLabel projectSpecializationLabel2 = new JLabel();
        projectDetailsTextField = new JTextField();
        applyButton = new JButton();
        backButton = new JButton();
        lecturerNameLabel2 = new JLabel();
        JLabel lecturerNameLabel = new JLabel();
        JLabel projectSpecialization1 = new JLabel();
        projectIdLabel2 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        
        jPanel1.setBackground(new java.awt.Color(0, 168, 209));

        jLabel1.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 24)); // NOI18N
        jLabel1.setText("Project Details");

        projectNameLabel.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        projectNameLabel.setText("Project Name");

        projectIdLabel.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        projectIdLabel.setText("Project ID");

        projectDetails.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        projectDetails.setText("Project Details");
        projectDetailsTextField.setText(details);
        projectDetailsTextField.setEnabled(false);

        projectNameLabel2.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        projectNameLabel2.setText(projectName);

        projectSpecializationLabel2.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        Student student = Student.getDetailsInstance(LoginModel.getUserId());
        projectSpecializationLabel2.setText(student.getSpecialization());

        applyButton.setText("Apply");

        backButton.setText("Back");

        lecturerNameLabel2.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        lecturerNameLabel2.setText(lecturerId);

        lecturerNameLabel.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        lecturerNameLabel.setText("Lecturer Id");

        projectSpecialization1.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        projectSpecialization1.setText("Project Specialization");

        projectIdLabel2.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        projectIdLabel2.setText(projectId);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(applyButton)
                                .addGap(51, 51, 51))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(projectNameLabel)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(backButton))
                                                        .addComponent(projectIdLabel))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(projectNameLabel2, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                                        .addComponent(projectIdLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(projectSpecialization1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(projectSpecializationLabel2, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(projectDetails)
                                        .addComponent(lecturerNameLabel))
                                .addGap(217, 217, 217)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(projectDetailsTextField, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lecturerNameLabel2, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                                .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(projectNameLabel)
                                        .addComponent(projectNameLabel2))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(projectIdLabel)
                                        .addComponent(projectIdLabel2))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(projectSpecialization1)
                                        .addComponent(projectSpecializationLabel2))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lecturerNameLabel)
                                        .addComponent(lecturerNameLabel2))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(projectDetails)
                                        .addComponent(projectDetailsTextField, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(applyButton)
                                        .addComponent(backButton))
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    // End of variables declaration     
    public JButton getBackButton(){
        return backButton;
    }
    public JButton getApplyButton(){
        return applyButton;
    }

    public String getProjectId(){
        return projectIdLabel2.getText();
    }

    public String getProjectName(){
        return  projectIdLabel2.getText();
    }

    public String getLecturerId(){
        return lecturerNameLabel2.getText();
    }

    public void displayMessage() {
        JOptionPane.showMessageDialog(null, "You have applied for the following Project please wait for lecturer to assign it to you!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
}
