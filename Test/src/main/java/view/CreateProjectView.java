package view;

import javax.swing.*;
import java.awt.*;


public class CreateProjectView extends JFrame {

  private static CreateProjectView singletonInstance;
  private JButton jButton4;
  private JButton jButton1;
  private JButton jButton6;
  private JButton jButton7;
  private JButton jButton2;
  private JButton jButton5;
  private JButton jButton3;
  private JComboBox<String> jComboBox1;
  private JLabel jLabel5;
  JTextField jTextField1, jTextField2, jTextField3;
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
    jComboBox1 = new JComboBox<>();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JLabel jLabel4 = new JLabel();
    jButton1 = new JButton();
    jButton2 = new JButton();
    jTextField1 = new JTextField();
    JPanel jPanel2 = new JPanel();
    jButton5 = new JButton();
    jButton6 = new JButton();
    jButton7 = new JButton();
    jLabel5 = new JLabel();
    jButton4 = new JButton();
    jButton3 = new JButton();
    jTextField2 = new JTextField();
    JLabel jLabel6 = new JLabel();
    jTextField3 = new JTextField();

    jMenuItem1.setText("jMenuItem1");

    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false)
    ;
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
    jButton2.setText("Exit");

    jPanel2.setBackground(new Color(230, 230, 230));

    jButton5.setBackground(new Color(230, 230, 230));
    jButton5.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
    jButton5.setText("Create Account");

    jButton7.setBackground(new Color(230, 230, 230));
    jButton7.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
    jButton7.setText("Dashboard");

    jButton6.setBackground(new Color(230, 230, 230));
    jButton6.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
    jButton6.setText("View Reports");
    jButton6.setOpaque(true);

    jLabel5.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
    jLabel5.setText("Null");

    jButton4.setBackground(new Color(230, 230, 230));
    jButton4.setFont(new Font("SansSerif", Font.PLAIN, 14)); // NOI18N
    jButton4.setForeground(new Color(255, 51, 102));
    jButton4.setText("Logout");

    jButton3.setBackground(new Color(230, 230, 230));
    jButton3.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
    jButton3.setText("View Project");
    jButton3.setOpaque(true);


    GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap())
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17))
    );
    jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addGap(87, 87, 87)
                            .addComponent(jButton7)
                            .addGap(12, 12, 12)
                            .addComponent(jButton3)
                            .addGap(12, 12, 12)
                            .addComponent(jButton5)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton6)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                            .addComponent(jButton4)
                            .addContainerGap())
    );


    jLabel6.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
    jLabel6.setText("Specialization");


    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
                                                                    .addComponent(jTextField3, GroupLayout.Alignment.LEADING)
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
                                    .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap())
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

  public JButton getButton3() {
    return jButton3;
  }

  public JButton getButton4() {
    return jButton4;
  }

  public JButton getButton5() {
    return jButton5;
  }

  public JButton getButton6() {
    return jButton6;
  }

  public JButton getButton7() {
    return jButton7;
  }

  public JLabel getOuterName() {
    return jLabel5;
  }

  public JComboBox<String> getJComboBox() {
    return jComboBox1;
  }

  public String getLecturerId() {
    return (String) jComboBox1.getSelectedItem();
  }

  public String getSpecialization(){
    return jTextField3.getText();
  }

  public String getProject(){
    return jTextField1.getText();
  }

  public String getDescription(){
    return jTextField2.getText();
  }
  
}