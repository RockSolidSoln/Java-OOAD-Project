package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CreateProjectView extends JFrame {

    private static CreateProjectView singletonInstance;
  public CreateProjectView() {
    initComponents();
  }
    public static CreateProjectView getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new CreateProjectView();
        }
        return singletonInstance;
    }

    private void initComponents() {

      JMenuItem jMenuItem1 = new JMenuItem();
      JPanel jPanel1 = new JPanel();
      JComboBox<String> jComboBox1 = new JComboBox<>();
      JLabel jLabel1 = new JLabel();
      JLabel jLabel2 = new JLabel();
      JLabel jLabel3 = new JLabel();
      JLabel jLabel4 = new JLabel();
      // Variables declaration - do not modify
      JButton jButton1 = new JButton();
      JButton jButton2 = new JButton();
      JTextField jTextField1 = new JTextField();
      JPanel jPanel2 = new JPanel();
      JButton jButton5 = new JButton();
      JButton jButton6 = new JButton();
      JLabel jLabel5 = new JLabel();
      JButton jButton7 = new JButton();
      JButton jButton8 = new JButton();
      JTextField jTextField2 = new JTextField();

    jMenuItem1.setText("jMenuItem1");

    setDefaultCloseOperation(  WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new Color(92, 122, 234));

    jLabel1.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
    jLabel1.setText("Lecturer ID");

    jLabel2.setFont(new Font("SansSerif", Font.PLAIN, 36)); // NOI18N
    jLabel2.setText("Add Project");

    jLabel3.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
    jLabel3.setText("Project Name");

    jLabel4.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
    jLabel4.setText("Details");

    jButton1.setText("Create Project");
    jButton1.addActionListener(this::jButton1ActionPerformed);

    jButton2.setText("Exit");

    jTextField1.setText("jTextField1");

    jPanel2.setBackground(new Color(230, 230, 230));

    jButton5.setBackground(new Color(230, 230, 230));
    jButton5.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
    jButton5.setText("Create Account");

    jButton6.setBackground(new Color(230, 230, 230));
    jButton6.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
    jButton6.setText("View Reports");
    jButton6.setOpaque(true);
    jButton6.addActionListener(this::jButton6ActionPerformed);

    jLabel5.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
    jLabel5.setText("Salah AlHaismawi");

    jButton7.setBackground(new Color(230, 230, 230));
    jButton7.setFont(new Font("SansSerif", Font.PLAIN, 14)); // NOI18N
    jButton7.setForeground(new Color(255, 51, 102));
    jButton7.setText("Logout");

    jButton8.setBackground(new Color(230, 230, 230));
    jButton8.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
    jButton8.setText("View Project");
    jButton8.setOpaque(true);
    jButton8.addActionListener(this::jButton8ActionPerformed);

    GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
              .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jButton8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jButton6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
        .addGroup(  GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addContainerGap(  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
            .addGap(17, 17, 17))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
        .addGroup(  GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
            .addGap(87, 87, 87)
            .addComponent(jButton8)
            .addGap(12, 12, 12)
            .addComponent(jButton5)
            .addPreferredGap(  LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jButton6)
            .addPreferredGap(  LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
            .addComponent(jButton7)
            .addContainerGap())
    );

    jTextField2.setText("jTextField2");
    jTextField2.addActionListener(this::jTextField2ActionPerformed);

    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                      .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
                      .addGap(208, 208, 208)
                      .addComponent(jLabel1)
                      .addPreferredGap(  LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                      .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField2))
                .addGap(16, 16, 16))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel2)
                .addContainerGap(  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addGroup(  GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addPreferredGap(  LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jButton1)
                .addGap(30, 30, 30))))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel2)
            .addGap(83, 83, 83)
            .addGroup(jPanel1Layout.createParallelGroup(  GroupLayout.Alignment.BASELINE)
              .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel3)
              .addComponent(jLabel1)
              .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(  LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(  GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel4)
              .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
            .addGap(39, 39, 39)
            .addGroup(jPanel1Layout.createParallelGroup(  GroupLayout.Alignment.BASELINE)
              .addComponent(jButton1)
              .addComponent(jButton2))
            .addContainerGap())
        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    String line = "";

    String csvSplitBy = ",";
    try (BufferedReader br = new BufferedReader(new FileReader( "C:\\Users\\salah\\Documents\\NetBeansProjects\\mavenproject1\\lec1.csv"))) {
    while ((line = br.readLine()) != null) {
      String[] lec = line.split(csvSplitBy);
      jComboBox1.addItem(lec[0]);
      System.out.println("working");
    }
    } catch (IOException e) {
    e.printStackTrace();
    }

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>

  private void jButton6ActionPerformed(ActionEvent evt) {
    // TODO add your handling code here:
  }

  private void jButton8ActionPerformed(ActionEvent evt) {
    // TODO add your handling code here:
  }

  private void jButton1ActionPerformed(ActionEvent evt) {
    // TODO add your handling code here:
  }

  private void jTextField2ActionPerformed(ActionEvent evt) {
    // TODO add your handling code here:
  }

}