package view;

import model.LoginModel;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author
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

    private JButton backButton;
    private JTextArea commentTextArea;
    private JTextField commentTextField;
    private JButton publishCommentButton;
    // End of variables declaration


    private void initComponents() {
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JLabel projectIdLabel = new JLabel();
        JLabel projectNameLabel = new JLabel();
        JScrollPane jScrollPane1 = new JScrollPane();
        commentTextArea = new JTextArea();
        commentTextField = new JTextField();
        publishCommentButton = new JButton();
        backButton = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new Color(154, 216, 211));

        jPanel2.setBackground(new   Color(235, 252, 255));

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