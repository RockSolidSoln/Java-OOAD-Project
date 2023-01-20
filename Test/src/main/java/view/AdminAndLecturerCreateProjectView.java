package view;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Ayaan
 */
public class AdminAndLecturerCreateProjectView extends JFrame {

  private static AdminAndLecturerCreateProjectView singletonInstance;
  private JButton jButton1;
  private JButton jButton2;
  private JComboBox<String> jComboBox1, specializationComboBox;
  JTextField jTextField1, jTextField2;
  public AdminAndLecturerCreateProjectView() {
    initComponents();
  }

  public static AdminAndLecturerCreateProjectView getInstance() {
    if (singletonInstance == null) {
      singletonInstance = new AdminAndLecturerCreateProjectView();
    }
    return singletonInstance;
  }
                         
  private void initComponents() {

    JMenuItem jMenuItem1 = new JMenuItem();
    JPanel jPanel1 = new JPanel();
    jComboBox1 = new JComboBox<>();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JLabel jLabel4 = new JLabel();
    jButton1 = new JButton();
    jButton2 = new JButton();
    jTextField1 = new JTextField();
    JPanel jPanel2 = new JPanel();
    jTextField2 = new JTextField();
    JLabel jLabel6 = new JLabel();
    specializationComboBox = new JComboBox<>();
    jMenuItem1.setText("jMenuItem1");

    setResizable(false);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


    jPanel1.setBackground(new Color(154, 216, 211));

    jLabel1.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
    jLabel1.setText("Lecturer ID");

    jLabel2.setFont(new Font("SansSerif", Font.PLAIN, 36)); // NOI18N
    jLabel2.setText("Add Project");

    jLabel3.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
    jLabel3.setText("Project Name");

    jLabel4.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
    jLabel4.setText("Details");

    jButton1.setText("Create Project");
    jButton1.setForeground(new Color(255, 255, 255));
    jButton1.setBackground(new Color(0, 168, 209));
    jButton2.setText("Go Back");
    jButton2.setForeground(new Color(255, 255, 255));
    jButton2.setBackground(new Color(0, 168, 209));

    jLabel6.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
    jLabel6.setText("Specialization");


    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
//                            .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                            .addGap(86, 86, 86)
                                            .addComponent(jButton1)
                                            .addGap(30, 30, 30))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(27, 27, 27)
                                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jLabel3)
                                                                    .addComponent(jLabel6))
                                                            .addGap(50, 50, 50)
                                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                    .addComponent(specializationComboBox, GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jTextField1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                                                            .addGap(135, 135, 135)
                                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jLabel4)
                                                                    .addComponent(jLabel1))
                                                            .addGap(42, 42, 42)
                                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                    .addComponent(jTextField2)
                                                                    .addComponent(jComboBox1, 0, 209, Short.MAX_VALUE)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(336, 336, 336)
                                                            .addComponent(jLabel2)))
                                            .addContainerGap(95, Short.MAX_VALUE))))
    );
    jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)
                            .addGap(77, 77, 77)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                            .addGap(1, 1, 1)))
                            .addGap(80, 80, 80)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(specializationComboBox, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap())
//                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

  public JButton getButton1() {
    return jButton1;
  }

  public JButton getButton2() {
    return jButton2;
  }

  public JComboBox<String> getJComboBox() {
    return jComboBox1;
  }

  public String getLecturerId() {
    return (String) jComboBox1.getSelectedItem();
  }

  public JComboBox<String> getSpecializationBox(){
    return specializationComboBox;
  }

  public String getSpecialization(){
    return (String) specializationComboBox.getSelectedItem();
  }

  public String getProject(){
    return jTextField1.getText();
  }

  public String getDescription(){
    return jTextField2.getText();
  }
  
}