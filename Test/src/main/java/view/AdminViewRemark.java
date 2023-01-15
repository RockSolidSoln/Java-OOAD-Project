package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author salah
 */
public class AdminViewRemark extends JFrame {

    /**
     * Creates new form AdminViewRemark
     */
    public AdminViewRemark() {
        initComponents();
    }
     
    private void initComponents() {

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jLabel4 = new JLabel();
        jButton7 = new JButton();
        jButton8 = new JButton();
        projectIdLabel = new JLabel();
        projectNameLabel = new JLabel();
        jScrollPane1 = new JScrollPane();
        commentTextArea = new JTextArea();
        commentTextField = new JTextField();
        publishCommentButton = new JButton();
        backButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(92, 122, 234));

        jPanel2.setBackground(new Color(230, 230, 230));

        jButton5.setBackground(new Color(230, 230, 230));
        jButton5.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton5.setText("Create Account");

        jButton6.setBackground(new Color(230, 230, 230));
        jButton6.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton6.setText("View Reports");
        jButton6.setOpaque(true);


        jLabel4.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        jLabel4.setText("Salah AlHaismawi");

        jButton7.setBackground(new Color(230, 230, 230));
        jButton7.setFont(new Font("SansSerif", Font.PLAIN, 14)); // NOI18N
        jButton7.setForeground(new Color(255, 51, 102));
        jButton7.setText("Logout");

        jButton8.setBackground(new Color(230, 230, 230));
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

        projectIdLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        projectIdLabel.setForeground(new Color(230, 230, 230));
        projectIdLabel.setText(projectID);

        projectNameLabel.setFont(new Font("SansSerif", Font.PLAIN, 36)); // NOI18N
        projectNameLabel.setForeground(new Color(230, 230, 230));
        projectNameLabel.setText("Project Name");

        commentTextArea.setBackground(new Color(230, 230, 230));
        commentTextArea.setColumns(20);
        commentTextArea.setRows(20);
        jScrollPane1.setViewportView(commentTextArea);
        commentTextArea.setEditable(false);
        String csvFile = "C:\\Users\\salah\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\newpackage\\comment.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                if(row[0].equals(this.projectID)) {
                    String item2 = row[1];
                    String item3 = row[2];
                    commentTextArea.append(item2 + ": " + item3 + "\n");
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

        String comment = commentTextField.getText();

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



    public void readFile() {
        String csvFile = "C:\\Users\\salah\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\newpackage\\comment.csv";
        BufferedReader br = null;
        String line = "";
        StringBuilder sb = new StringBuilder();

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                if (row[0].equals(this.projectID)) {
                    String item2 = row[1];
                    String item3 = row[2];
                    sb.append(item2 + " " + item3 + "\n");
                }
            }
            commentTextArea.setText(sb.toString());
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

    private void publishCommentButtonActionPerformed(ActionEvent evt) {


        // TODO add your handling code here:
        String text = commentTextField.getText();
        String csvFile = "C:\\Users\\salah\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\newpackage\\comment.csv";
        FileWriter fw = null;
        try {
            fw = new FileWriter(csvFile, true);
            fw.append(this.projectID + "," +"L001,"+ text);
            fw.append(System.lineSeparator());
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // read the file and update the text area
        readFile();







    }
    private String projectID;

    public AdminViewRemark(String projectID) {
        this.projectID = projectID;
        initComponents();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminViewRemark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewRemark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewRemark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewRemark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewRemark().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private JButton backButton;
    private JTextArea commentTextArea;
    private JTextField commentTextField;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JLabel projectIdLabel;
    private JLabel projectNameLabel;
    private JButton publishCommentButton;
    // End of variables declaration                   
}