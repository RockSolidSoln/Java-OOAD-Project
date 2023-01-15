package view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author salah
 */
public class AdminProjectsView extends JFrame {


    public AdminProjectsView() {
        initComponents();
    }
    // Variables declaration - do not modify
    private JButton addProjectButton;
    private JButton jButton3, jButton4, jButton5, jButton1, jButton2;
    private JTable jTable1;
    private JButton projectDetailsButton;
    private JButton viewRemarkButton;
    // End of variables declaration
    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        JScrollPane jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        JPanel jPanel4 = new JPanel();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton2 = new JButton();
        JLabel jLabel6 = new JLabel();
        jButton5 = new JButton();
        jButton1 = new JButton();
        JLabel jLabel1 = new JLabel();
        viewRemarkButton = new JButton();
        projectDetailsButton = new JButton();
        addProjectButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new Color(0, 168, 209));

        jTable1.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String [] {
                        "Project ID", "Project Name", "Project Specialization", "Lecturer ID", "Status"
                }
        ) {
            final Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            final boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);



        jPanel4.setBackground(new Color(235, 252, 255));

        jButton3.setBackground(new Color(154, 216, 211));
        jButton3.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton3.setText("Create Account");

        jButton4.setBackground(new Color(154, 216, 211));
        jButton4.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton4.setText("View Reports");
        jButton4.setOpaque(true);

        jButton2.setBackground(new Color(154, 216, 211));
        jButton2.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton2.setText("Dashboard");
        jButton2.setOpaque(true);

        jLabel6.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N

        jButton5.setBackground(new Color(154, 216, 211));
        jButton5.setFont(new Font("SansSerif", Font.PLAIN, 14)); // NOI18N
        jButton5.setForeground(new Color(255, 51, 102));
        jButton5.setText("Logout");

        jButton1.setBackground(new Color(96, 132, 223));
        jButton1.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton1.setText("View Project");
        jButton1.setOpaque(true);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jButton2)
                                .addGap(12, 12, 12)
                                .addComponent(jButton1)
                                .addGap(12, 12, 12)

                                .addComponent(jButton3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                                .addComponent(jButton5)
                                .addContainerGap())
        );

        jLabel1.setFont(new Font("SansSerif", Font.PLAIN, 36)); // NOI18N
        jLabel1.setText("View Projects");

        viewRemarkButton.setBackground(new Color(154, 216, 211));
        viewRemarkButton.setText("View Remarks");

        projectDetailsButton.setBackground(new Color(154, 216, 211));
        projectDetailsButton.setText("ProjectDetails");

        addProjectButton.setBackground(new Color(154, 216, 211));
        addProjectButton.setText("Add Project");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(338, 338, 338)
                                                .addComponent(jLabel1)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(viewRemarkButton)
                                                                .addGap(157, 157, 157)
                                                                .addComponent(addProjectButton)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(projectDetailsButton))
                                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 619, GroupLayout.PREFERRED_SIZE))
                                                .addGap(139, 139, 139))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(projectDetailsButton)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(viewRemarkButton)
                                                .addComponent(addProjectButton)))
                                .addContainerGap())
        );

        viewRemarkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int selectedRow = jTable1.getSelectedRow();
                if (selectedRow != -1) {
                    // get the value of the project ID column
                    String projectID = (String) jTable1.getValueAt(selectedRow, 0);
                    // redirect to ProjectDetails JFrame here
//                    RemarkSection remarkSection = new RemarkSection(projectID);
//                    remarkSection.setVisible(true);
                } else {
                    // show a pop-up message
                    JOptionPane.showMessageDialog(null, "Please select a row from the table.");
                }
            }
        });


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

    public JButton getProjectDetailsButton() {
        return projectDetailsButton;
    }

    public JButton getViewRemarkButton() {
        return viewRemarkButton;
    }

    public JButton getAddProjectButton() {
        return addProjectButton;
    }
    
    public JTable getTable() {
        return jTable1;
    }
    

}