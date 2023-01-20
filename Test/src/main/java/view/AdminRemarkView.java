package view;

import model.LoginModel;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author salah
 */
public class AdminRemarkView extends JFrame {
    private static String projectID;
    private static String projectName;
    public static AdminRemarkView singletonInstance;
    public AdminRemarkView(String projectID, String projectName) {
        AdminRemarkView.projectID = projectID;
        AdminRemarkView.projectName = projectName;
        initComponents();
    }
    public static AdminRemarkView getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new AdminRemarkView(projectID, projectName);
        }
        return singletonInstance;
    }


    private void initComponents() {
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton3 = new JButton();
        JLabel jLabel4 = new JLabel();
        jButton7 = new JButton();
        jButton8 = new JButton();
        JLabel projectIdLabel = new JLabel();
        JLabel projectNameLabel = new JLabel();
        JScrollPane jScrollPane1 = new JScrollPane();
        commentTextArea = new JTextArea();
        commentTextField = new JTextField();
        publishCommentButton = new JButton();
        backButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new Color(154, 216, 211));

        jPanel2.setBackground(new   Color(235, 252, 255));

        jButton3.setBackground(new   Color(154, 216, 211));
        jButton3.setFont(new   Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton3.setText("Dashboard");
        jButton3.setOpaque(true);
        jButton5.setBackground(new Color(154, 216, 211));
        jButton5.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton5.setText("Create Account");

        jButton6.setBackground(new Color(154, 216, 211));
        jButton6.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton6.setText("View Reports");
        jButton6.setOpaque(true);


        jLabel4.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        jLabel4.setText(LoginModel.getUserId());

        jButton7.setBackground(new Color(154, 216, 211));
        jButton7.setFont(new Font("SansSerif", Font.PLAIN, 14)); // NOI18N
        jButton7.setForeground(new Color(255, 51, 102));
        jButton7.setText("Logout");

        jButton8.setBackground(new Color(96, 132, 223));
        jButton8.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton8.setText("View Project");
        jButton8.setOpaque(true);


        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jButton8)
                                .addGap(12, 12, 12)
                                .addComponent(jButton5)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7)
                                .addContainerGap())
        );

        projectIdLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20)); // NOI18N
        projectIdLabel.setText(projectID);

        projectNameLabel.setFont(new Font("SansSerif", Font.PLAIN, 36)); // NOI18N
        projectNameLabel.setText(projectName);

        commentTextArea.setBackground(new Color(230, 230, 230));
        commentTextArea.setColumns(20);
        commentTextArea.setRows(20);
        jScrollPane1.setViewportView(commentTextArea);
        commentTextArea.setEditable(false);

        commentTextField.setBackground(new Color(230, 230, 230));

        publishCommentButton.setBackground(new Color(230, 230, 230));
        publishCommentButton.setText("Publish Comment");

        backButton.setBackground(new Color(230, 230, 230));
        backButton.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        backButton.setForeground(new Color(0, 0, 0));
        backButton.setText("Back");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 154, 154)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(projectNameLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(projectIdLabel)
                                                .addGap(199, 199, 199))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 573, GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(commentTextField, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(publishCommentButton)))
                                                        .addComponent(backButton))
                                                .addContainerGap(184, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(backButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(projectNameLabel)
                                        .addComponent(projectIdLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(commentTextField, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(publishCommentButton))
                                .addContainerGap(18, Short.MAX_VALUE))
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
    private JButton backButton;
    private JTextArea commentTextArea;
    private JTextField commentTextField;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton3;
    private JButton publishCommentButton;
    // End of variables declaration

    //Dashboard
    public JButton getButton3() {
        return jButton3;
    }

    //Create account
    public JButton getButton5() {
        return jButton5;
    }

    //View report
    public JButton getButton6() {
        return jButton6;
    }

    //Logout
    public JButton getButton7() {
        return jButton7;
    }
    //View Project
    public JButton getButton8() {
        return jButton8;
    }



    public String getProjectId() {
        return projectID;
    }

    public JTextArea getComment() {
        return commentTextArea;
    }

    public JButton getPublishCommentButton(){
        return publishCommentButton;
    }

    public JButton getBackButton(){
        return backButton;
    }

    public JTextField getCommentField(){
        return commentTextField;
    }
}