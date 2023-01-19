package view;

import javax.swing.*;
import java.awt.*;

public class LecturerProjectDetailsView extends JFrame {

    private static String projectId;
    private static String projectName;
    private static String specialization;
    private static String status;

    public LecturerProjectDetailsView(String projectID, String projectName, String specialization, String status) {
        LecturerProjectDetailsView.projectId = projectID;
        LecturerProjectDetailsView.projectName = projectName;
        LecturerProjectDetailsView.specialization = specialization;
        LecturerProjectDetailsView.status = status;
        initComponents();
    }

    public static LecturerProjectDetailsView singletonInstance;

    public static LecturerProjectDetailsView getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new LecturerProjectDetailsView(projectId, projectName, specialization, status);
        }
        return singletonInstance;
    }
    // Variables declaration - do not modify
    private JButton activateDeactivateButton;
    private JButton backButton;
    private JButton modifyContentButton;
    private JButton unassignButton;
    private JButton viewApplyingListButton;
    // End of variables declaration
    private void initComponents() {

        JPanel jPanel2 = new JPanel();
        JLabel projectNameLabel = new JLabel();
        JLabel specializationLabel = new JLabel();
        JLabel detailsLabel = new JLabel();
        JLabel projectNameLabel2 = new JLabel();
        JLabel projectIdLabel1 = new JLabel();
        JLabel projectIdLabel2 = new JLabel();
        JLabel projectStatusLabel1 = new JLabel();
        JLabel projectStatusLabel2 = new JLabel();
        JLabel specializationLabel2 = new JLabel();
        JTextField detailsTextField = new JTextField();
        backButton = new JButton();
        JLabel detailsLabel1 = new JLabel();
        unassignButton = new JButton();
        modifyContentButton = new JButton();
        activateDeactivateButton = new JButton();
        viewApplyingListButton = new JButton();
        JLabel jLabel1 = new JLabel();
        JLabel studentLabel2 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new Color(0, 168, 209));

        projectNameLabel.setBackground(new Color(230, 230, 230));
        projectNameLabel.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        projectNameLabel.setForeground(new Color(230, 230, 230));
        projectNameLabel.setText("Project Name");

        projectIdLabel1.setBackground(new Color(230, 230, 230));
        projectIdLabel1.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        projectIdLabel1.setForeground(new Color(230, 230, 230));
        projectIdLabel1.setText("Project Id");

       projectStatusLabel1.setBackground(new Color(230, 230, 230));
       projectStatusLabel1.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
       projectStatusLabel1.setForeground(new Color(230, 230, 230));
       projectStatusLabel1.setText("Status");

        specializationLabel.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        specializationLabel.setForeground(new Color(230, 230, 230));
        specializationLabel.setText("Specialization");

        detailsLabel.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        detailsLabel.setForeground(new Color(230, 230, 230));
        detailsLabel.setText("Student Name:");

        projectNameLabel2.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        projectNameLabel2.setForeground(new Color(230, 230, 230));
        projectNameLabel2.setText(projectName);

        projectIdLabel2.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        projectIdLabel2.setForeground(new Color(230, 230, 230));
        projectIdLabel2.setText(projectId);

        specializationLabel2.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        specializationLabel2.setForeground(new Color(230, 230, 230));
        specializationLabel2.setText(specialization);

        projectStatusLabel2.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        projectStatusLabel2.setForeground(new Color(230, 230, 230));
        projectStatusLabel2.setText(specialization);

        detailsTextField.setBackground(new Color(230, 230, 230));

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
        activateDeactivateButton.setFont(new Font("SansSerif", Font.PLAIN, 10)); // NOI18N
        activateDeactivateButton.setText("Activate/Deactivate Project");

        viewApplyingListButton.setBackground(new Color(235, 252, 255));
        viewApplyingListButton.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        viewApplyingListButton.setText("View Applying List");


        jLabel1.setFont(new Font("Segoe UI", Font.PLAIN, 24)); // NOI18N
        jLabel1.setText("Project Screen");

        studentLabel2.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        studentLabel2.setForeground(new Color(230, 230, 230));
        studentLabel2.setText("student name");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(projectNameLabel)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(specializationLabel)
                                    .addGap(91, 91, 91)
                                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(specializationLabel2, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(detailsTextField, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(unassignButton)
                                            .addComponent(detailsLabel))
                                    .addGap(129, 129, 129)
                                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(backButton, GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                            .addComponent(activateDeactivateButton)
                                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                    .addComponent(studentLabel2, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
                                                                                    .addGap(73, 73, 73)
                                                                                    .addComponent(detailsLabel1)
                                                                                    .addGap(0, 20, Short.MAX_VALUE)))
                                                                    .addGap(151, 151, 151))
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                    .addGap(20, 20, 20)
                                                                    .addComponent(modifyContentButton)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                    .addComponent(viewApplyingListButton)
                                                    .addGap(99, 99, 99))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(287, 287, 287)
                                    .addComponent(projectNameLabel2, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(387, 387, 387)
                                    .addComponent(jLabel1)))
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(projectNameLabel)
                                        .addComponent(projectNameLabel2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(specializationLabel)
                                        .addComponent(specializationLabel2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
//                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                                        .addComponent(projectIdLabel1)
//                                        .addComponent(projectIdLabel2)
//                                        .addComponent(projectStatusLabel1)
//                                        .addComponent(projectStatusLabel2))
//                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(detailsLabel)
                                        .addComponent(detailsTextField, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detailsLabel1)
                                        .addComponent(studentLabel2))
                                .addGap(99, 99, 99)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(viewApplyingListButton)
                                        .addComponent(activateDeactivateButton)
                                        .addComponent(modifyContentButton)
                                        .addComponent(unassignButton))
                                .addGap(48, 48, 48)
                                .addComponent(backButton))
        );

        detailsTextField.setEditable(false);
        detailsTextField.setText("details");

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

//    private void viewApplyingListButtonActionPerformed(event.ActionEvent evt) {
//        // TODO add your handling code here:
////        viewApplyingStudent viewapplyingstudent = new viewApplyingStudent();
////        viewapplyingstudent.setVisible(true);
//
//    }


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

}