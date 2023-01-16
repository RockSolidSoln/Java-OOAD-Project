package view;


import model.LoginModel;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author salah
 */
public class ProjectDetailsView extends JFrame {
    private static String projectId;
    private static String projectName;
    private static String lecturerId;    
    private static String specialization;    
    private static String details;

    // Variables declaration - do not modify
    private JButton backButton;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    // End of variables declaration

    public ProjectDetailsView(String projectId,String projectName, String lecturerId, String specialization, String details) {
        ProjectDetailsView.projectId = projectId;
        ProjectDetailsView.projectName = projectName;
        ProjectDetailsView.lecturerId = lecturerId;
        ProjectDetailsView.specialization = specialization;
        ProjectDetailsView.details = details;
        
        initComponents();
    }

    public static ProjectDetailsView singletonInstance;

    public static ProjectDetailsView getInstance(){
        if(singletonInstance == null){
            singletonInstance = new ProjectDetailsView(projectId, projectName,lecturerId, specialization, details);
        }
        return singletonInstance;
    }

    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        JLabel jLabel4 = new JLabel();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        JLabel projectNameLabel = new JLabel();
        JLabel specializationLabel = new JLabel();
        JLabel lecturerIdlabel = new JLabel();
        JLabel detailsLabel = new JLabel();
        JLabel projectNameLabel2 = new JLabel();
        JLabel lecturerIdlabel2 = new JLabel();
        JLabel specializationLabel2 = new JLabel();
        JTextField detailsTextField = new JTextField();
        backButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel4.setText(LoginModel.getUserId());

        jPanel2.setBackground(new Color(0, 168, 209));

        jPanel3.setBackground(new Color(235, 252, 255));

        jButton1.setBackground(new Color(235, 252, 255));
        jButton1.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton1.setText("Create Account");

        jButton2.setBackground(new Color(235, 252, 255));
        jButton2.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton2.setText("View Reports");
        jButton2.setOpaque(true);

        jLabel4.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        jLabel4.setText(LoginModel.getUserId());

        jButton3.setBackground(new Color(235, 252, 255));
        jButton3.setFont(new Font("SansSerif", Font.PLAIN, 14)); // NOI18N
        jButton3.setForeground(new Color(255, 51, 102));
        jButton3.setText("Logout");

        jButton4.setBackground(new Color(92, 122, 234));
        jButton4.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton4.setText("View Project");
        jButton4.setOpaque(true);

        jButton5.setBackground(new Color(235, 252, 255));
        jButton5.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton5.setText("Dashboard");

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jButton5)
                                .addGap(12, 12, 12)
                                .addComponent(jButton4)
                                .addGap(12, 12, 12)
                                .addComponent(jButton1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addContainerGap())
        );

        projectNameLabel.setBackground(new Color(230, 230, 230));
        projectNameLabel.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        projectNameLabel.setForeground(new Color(230, 230, 230));
        projectNameLabel.setText("Project Name");

        specializationLabel.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        specializationLabel.setForeground(new Color(230, 230, 230));
        specializationLabel.setText("Specialization");

        lecturerIdlabel.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        lecturerIdlabel.setForeground(new Color(230, 230, 230));
        lecturerIdlabel.setText("Lecturer ID");

        detailsLabel.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        detailsLabel.setForeground(new Color(230, 230, 230));
        detailsLabel.setText("Details");

        projectNameLabel2.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        projectNameLabel2.setForeground(new Color(230, 230, 230));
        projectNameLabel2.setText(projectName);

        lecturerIdlabel2.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        lecturerIdlabel2.setForeground(new Color(230, 230, 230));
        lecturerIdlabel2.setText(lecturerId);

        specializationLabel2.setBackground(new Color(230, 230, 230));
        specializationLabel2.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        specializationLabel2.setForeground(new Color(230, 230, 230));
        specializationLabel2.setText(specialization);

        detailsTextField.setBackground(new Color(230, 230, 230));
        detailsTextField.setText(details);
        
        backButton.setBackground(new Color(230, 230, 230));
        backButton.setForeground(new Color(0, 0, 0));
        backButton.setText("Back");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(projectNameLabel)
                                                        .addComponent(detailsLabel)
                                                        .addComponent(lecturerIdlabel)
                                                        .addComponent(specializationLabel))
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 388, Short.MAX_VALUE)
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lecturerIdlabel2, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(specializationLabel2, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(projectNameLabel2, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 39, Short.MAX_VALUE))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(detailsTextField, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(108, 108, 108))))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(backButton))))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(projectNameLabel)
                                        .addComponent(projectNameLabel2))
                                .addGap(86, 86, 86)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lecturerIdlabel)
                                        .addComponent(lecturerIdlabel2))
                                .addGap(103, 103, 103)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(specializationLabel)
                                        .addComponent(specializationLabel2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(detailsLabel)
                                        .addComponent(detailsTextField, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(backButton))
        );

        detailsTextField.setEditable(false);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        


    public JButton getBackButton(){ return backButton; }

    //Create Account
    public JButton getButton1() {
        return jButton1;
    }
    //View Report
    public JButton getButton2() {
        return jButton2;
    }

    //Logout
    public JButton getButton3() {
        return jButton3;
    }

    //View Project
    public JButton getButton4() {
        return jButton4;
    }

    //Dashboard
    public JButton getButton5() {
        return jButton5;
    }
}