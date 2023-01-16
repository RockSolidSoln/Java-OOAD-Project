package view;

import model.LoginModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 *
 * @author salah
 */
public class LecturerProjectsView extends JFrame {
    public static LecturerProjectsView singletonInstance;
    public LecturerProjectsView() {
        initComponents();
    }

    // Variables declaration - do not modify
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton1;
    private JButton viewProjectButton;
    // End of variables declaration  
    public static LecturerProjectsView getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new LecturerProjectsView();
        }
        return singletonInstance;
    }
    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        JScrollPane jScrollPane1 = new JScrollPane();
        JTable jTable1 = new JTable();
        JPanel jPanel4 = new JPanel();
        jButton2 = new JButton();
        jButton1 = new JButton();
        JLabel jLabel6 = new JLabel();
        jButton3 = new JButton();
        jButton4 = new JButton();
        JLabel jLabel1 = new JLabel();
        viewProjectButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new Color(0, 168, 209));

        jTable1.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Project ID", "Project Name", "Project Specialization", "Status"
                }
        ) {
            final Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            final boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        String basePath = System.getProperty("user.dir");
        try(BufferedReader br2 = new BufferedReader(new FileReader(basePath + "\\Test\\src\\assets\\projects.csv"))){
            String line;
            ((DefaultTableModel) jTable1.getModel()).setRowCount(0);
            while ((line = br2.readLine()) != null) {
                String[] values = line.split(",");
                ((DefaultTableModel) jTable1.getModel()).insertRow(0, values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        jPanel4.setBackground(new Color(235, 252, 255));

        jButton1.setBackground(new Color(235, 252, 255));
        jButton1.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton1.setText("Dashboard");


        jButton2.setBackground(new Color(235, 252, 255));
        jButton2.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton2.setText("View Reports");
        jButton2.setOpaque(true);

        jLabel6.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        jLabel6.setText(LoginModel.getUserId());

        jButton3.setBackground(new Color(230, 230, 230));
        jButton3.setFont(new Font("SansSerif", Font.PLAIN, 14)); // NOI18N
        jButton3.setForeground(new Color(255, 51, 102));
        jButton3.setText("Logout");

        jButton4.setBackground(new Color(235, 252, 255));
        jButton4.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton4.setText("View Project");
        jButton4.setOpaque(true);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jButton1)
                                .addGap(12, 12, 12)
                                .addComponent(jButton4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addContainerGap())
        );

        jLabel1.setFont(new Font("SansSerif", Font.PLAIN, 36)); // NOI18N
        jLabel1.setText("View Projects");

        viewProjectButton.setText("View Project");
        viewProjectButton.setBackground(new Color(235, 252, 255));


        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 619, GroupLayout.PREFERRED_SIZE)
                                                .addGap(139, 139, 139))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(338, 338, 338)
                                                                .addComponent(jLabel1))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(213, 213, 213)
                                                                .addComponent(viewProjectButton)))
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 439, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(viewProjectButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    public JButton getButton1() {
        return jButton1;
    }

    public JButton getViewButton(){ return viewProjectButton;}

}