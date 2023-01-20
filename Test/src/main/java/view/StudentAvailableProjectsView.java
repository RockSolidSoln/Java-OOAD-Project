package view;

import model.LoginModel;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author
 */
public class StudentAvailableProjectsView extends JFrame {

    /**
     * Creates new form StudentAvailableProjectsView
     */
    public StudentAvailableProjectsView() {
        initComponents();
    }
    private static StudentAvailableProjectsView singletonInstance;

    public static StudentAvailableProjectsView getInstance(){
        if (singletonInstance == null) {
            singletonInstance = new StudentAvailableProjectsView();
        }
        return singletonInstance;
    }

    // Variables declaration - do not modify
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton1;
    private JButton jButton4;
    private JLabel jLabel1;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JButton viewProjectButton;
    // End of variables declaration
     
    private void initComponents() {

        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jPanel2 = new JPanel();
        jButton3 = new JButton();
        jButton1 = new JButton();
        jLabel4 = new JLabel();
        jButton2 = new JButton();
        jButton4 = new JButton();
        jLabel1 = new JLabel();
        viewProjectButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new Color(0, 168, 209));
        jPanel1.setForeground(new Color(235, 252, 255));

        jTable1.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Project ID", "Project Name", "Lecturer Name", "Details"
                }
        ) {
            final Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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

        jPanel2.setBackground(new Color(235, 252, 255));

        jButton3.setBackground(new Color(100, 198, 217));
        jButton3.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton3.setText("Dashboard");

        jButton4.setBackground(new Color(96, 132, 223));
        jButton4.setForeground(new Color(235, 252, 255));
        jButton4.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton4.setText("View Active Projects");

        jButton1.setBackground(new Color(100, 198, 217));
        jButton1.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton1.setText("View My Project");
        jButton1.setOpaque(true);


        jLabel4.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        jLabel4.setText(LoginModel.getUserId());

        jButton2.setBackground(new Color(100, 198, 217));
        jButton2.setFont(new Font("SansSerif", Font.PLAIN, 14)); // NOI18N
        jButton2.setForeground(new Color(255, 51, 102));
        jButton2.setText("Logout");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)

                                .addComponent(jButton3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addContainerGap())
        );

        jLabel1.setFont(new Font("SansSerif", Font.PLAIN, 24)); // NOI18N
        jLabel1.setText("Available Project Screen");

        viewProjectButton.setBackground(new Color(96, 132, 223));
        viewProjectButton.setText("View Project");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(viewProjectButton)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(131, 131, 131)
                                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 619, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(301, 301, 301)
                                                                .addComponent(jLabel1)))))
                                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 439, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(viewProjectButton)
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

    public JButton getButton2() {
        return jButton2;
    }

    public JButton getButton3() {
        return jButton3;
    }

    public JButton getButton1() {
        return jButton1;
    }

    public JTable getTable(){ return jTable1;}

    public JButton getViewButton(){ return viewProjectButton;}

}