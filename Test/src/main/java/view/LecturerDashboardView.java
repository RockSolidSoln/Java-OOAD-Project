package view;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author
 */
public class LecturerDashboardView extends JFrame {
    
    private static LecturerDashboardView singletonInstance;
    // Variables declaration - do not modify
    private JButton jButton2 , jButton1, jButton3, jButton4;
    private JLabel jLabel5, jLabel4, jLabel11, jLabel12, jLabel3;
    public LecturerDashboardView() {
        initComponents();
    }
        
    public static LecturerDashboardView getInstance() {
        if (singletonInstance == null) {
                singletonInstance = new LecturerDashboardView();
        }
        return singletonInstance;
    }

    private void initComponents() {
        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JPanel jPanel3 = new JPanel();
        jButton2 = new JButton();
        jButton1 = new JButton();
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

        jPanel1.setBackground(new Color(0, 168, 209));
        jPanel5.setBackground(new Color(235, 252, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 36)); // NOI18N
        jLabel1.setForeground(new Color(230, 230, 230));
        jLabel1.setText("Dashboard");

        jPanel3.setBackground(new java.awt.Color(235, 252, 255));

        jButton2.setBackground(new java.awt.Color(154, 216, 211));
        jButton2.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton2.setText("Create New Project");

        jButton1.setBackground(new java.awt.Color(154, 216, 211));
        jButton1.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton1.setText("View Project");
        jButton1.setOpaque(true);

        jButton4.setBackground(new java.awt.Color(96, 132, 223));
        jButton4.setForeground(new Color(235, 252, 255));
        jButton4.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton4.setText("Dashboard");

        jLabel4.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N

        jButton3.setBackground(new Color(154, 216, 211));
        jButton3.setFont(new Font("SansSerif", Font.PLAIN, 14)); // NOI18N
        jButton3.setForeground(new Color(255, 51, 102));
        jButton3.setText("Logout");

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jButton4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addContainerGap())
        );

        jPanel5.setBorder(BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 18)); // NOI18N

        String basePath = System.getProperty("user.dir");
        jLabel6.setIcon(new ImageIcon(basePath + "\\Test\\src\\assets\\Woman.png"));

        jLabel7.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        jLabel7.setText("Name:");

        jLabel8.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        jLabel8.setText("User Id:");

        jLabel9.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        jLabel9.setText("E-Mail:");

        jLabel10.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        jLabel10.setText("Phone-Number:");

        jLabel11.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 18)); // NOI18N

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
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 503, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(332, 332, 332)
                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
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
                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(294, 294, 294)
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        return jButton2;
    }

    public JButton getButton2() {
        return jButton1;
    }

    public JButton getButton3() {
        return jButton3;
    }

    public JButton getButton4() {
        return jButton4;
    }
    
    public JLabel getNameField(){ return jLabel5; }

    public JLabel getIDField(){ return jLabel11; }

    public JLabel getNavNameField(){ return jLabel4; }

    public JLabel getPhoneField(){ return jLabel12; }

    public JLabel getEmailField(){ return jLabel3; }
    // End of variables declaration
}