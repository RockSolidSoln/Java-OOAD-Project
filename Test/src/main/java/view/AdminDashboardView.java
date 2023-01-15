package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AdminDashboardView extends JFrame {

    private JButton jButton1, jButton2, jButton3, jButton4, jButton5;
    private static AdminDashboardView singletonInstance;
    private JLabel jLabel5, jLabel4, jLabel11, jLabel12, jLabel3;
    public AdminDashboardView() {
        initComponents();
    }

    public static AdminDashboardView getInstance() {
        if (singletonInstance == null) {
                singletonInstance = new AdminDashboardView();
        }
        return singletonInstance;
    }

    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        Label label1 = new Label();
        JPanel jPanel2 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton5 = new JButton();
        jLabel4 = new JLabel();
        jButton3 = new JButton();
        jButton4 = new JButton();
        JPanel jPanel5 = new JPanel();
        jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();
        JLabel jLabel8 = new JLabel();
        JLabel jLabel9 = new JLabel();
        JLabel jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel3 = new JLabel();
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new Color(92, 122, 234));

        label1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        label1.setFont(new Font("SansSerif", Font.PLAIN, 36)); // NOI18N
        label1.setForeground(new Color(230, 230, 230));
        label1.setText("Admin Dashboard");

        jPanel2.setBackground(new Color(230, 230, 230));

        jButton1.setBackground(new Color(230, 230, 230));
        jButton1.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton1.setText("Create Account");

        jButton5.setBackground(new Color(96, 132, 223));
        jButton5.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton5.setText("Dashboard");

        jButton2.setBackground(new Color(230, 230, 230));
        jButton2.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton2.setText("View Reports");

        jLabel4.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        jLabel4.setText("Salah AlHaismawi");

        jButton3.setBackground(new Color(230, 230, 230));
        jButton3.setFont(new Font("SansSerif", Font.PLAIN, 14)); // NOI18N
        jButton3.setForeground(new Color(255, 51, 102));
        jButton3.setText("Logout");

        jButton4.setBackground(new Color(230, 230, 230));
        jButton4.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton4.setText("View Project");
        jButton4.setOpaque(true);


        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)

                                .addComponent(jButton5)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addGap(12, 12, 12)
                                .addComponent(jButton1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)

                                .addContainerGap())
        );

        jPanel5.setBorder(BorderFactory.createEtchedBorder());

        jLabel5.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        jLabel5.setText("NAme");

        String basePath = System.getProperty("user.dir");
        jLabel6.setIcon(new ImageIcon(basePath + "\\Test\\src\\assets\\Man.png"));

        jLabel7.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        jLabel7.setText("Name:");

        jLabel8.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        jLabel8.setText("ID:");

        jLabel9.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        jLabel9.setText("E-MAIL:");

        jLabel10.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        jLabel10.setText("PHONE-NUMBER");

        jLabel11.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        jLabel11.setText("ID");

        jLabel12.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        jLabel12.setText("ID");

        jLabel3.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        jLabel3.setText("E-MAIL");

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 505, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                                .addGap(350, 350, 350))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel11))
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabel10))
                                        .addComponent(jLabel12, GroupLayout.Alignment.TRAILING))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel3))
                                .addGap(31, 31, 31))
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(293, 293, 293)
                                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(17, Short.MAX_VALUE))
                        .addComponent(jPanel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

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

    public JLabel getNameField(){ return jLabel5; }

    public JLabel getIDField(){ return jLabel11; }

    public JLabel getNavNameField(){ return jLabel4; }

    public JLabel getPhoneField(){ return jLabel12; }

    public JLabel getEmailField(){ return jLabel3; }

}