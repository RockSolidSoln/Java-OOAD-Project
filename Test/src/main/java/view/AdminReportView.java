package view;

import model.LoginModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 *
 * @author salah
 */
public class AdminReportView extends JFrame {
    /**
     *
     *
     */
    private static AdminReportView singletonInstance;
    private JButton jButton2,jButton8,jButton7,jButton6,jButton5,viewRemarkButton,viewByButton, jButton1;
    private JLabel jLabel4;
    private JPanel jPanel1,jPanel2;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
   
    
    public AdminReportView() {
        initComponents();
    }
    public static AdminReportView getInstance(){
        if (singletonInstance == null) {
            singletonInstance = new AdminReportView();
        }
        return singletonInstance;
    }
    private void initComponents() {
        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        viewByButton = new JButton();
        jButton2 = new JButton();
        jPanel2 = new JPanel();
        jButton5 = new JButton();
        jButton1 = new JButton();
        jButton6 = new JButton();
        jLabel4 = new JLabel();
        jButton7 = new JButton();
        jButton8 = new JButton();
        viewRemarkButton = new JButton();
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);

    jPanel1.setBackground(new Color(0, 168, 209));

    jTable1.setModel(new DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Project ID", "Project Name", "Lecturer Name", "Specialization", "Assigned", "Status", "Comment"
        }
    ) {
        Class[] types = new Class [] {
            java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
        };
        final boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false, false
        };

        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jScrollPane1.setViewportView(jTable1);

    viewByButton.setText("View By");
    viewByButton.setBackground(new Color(154, 216, 211));

    jButton2.setText("Undo");
    jButton2.setBackground(new Color(154, 216, 211));
    jButton2.setActionCommand("");

    jButton1.setText("Dashboard");
    jButton1.setBackground(new Color(154, 216, 211));

    jPanel2.setBackground(new Color(230, 230, 230));

    jButton5.setBackground(new Color(154, 216, 211));
    jButton5.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
    jButton5.setText("Create Account");

    jButton6.setBackground(new Color(96, 132, 223));
    jButton6.setForeground(new Color(235, 252, 255));
    jButton6.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
    jButton6.setText("View Reports");
    jButton6.setOpaque(true);

    jButton1.setBackground(new Color(154, 216, 211));
    jButton1.setFont(new Font("SansSerif", Font.PLAIN, 12)); // NOI18N
    jButton1.setText("Dashboard");
    jButton1.setOpaque(true);

    jLabel4.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
    jLabel4.setText(LoginModel.getUserId());

    jButton7.setBackground(new Color(154, 216, 211));
    jButton7.setFont(new Font("SansSerif", Font.PLAIN, 14)); // NOI18N
    jButton7.setForeground(new Color(255, 51, 102));
    jButton7.setText("Logout");

    jButton8.setBackground(new Color(154, 216, 211));
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
                .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jButton1)
            .addGap(12, 12, 12)
            .addComponent(jButton8)
            .addGap(12, 12, 12)
            .addComponent(jButton5)
            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jButton6)
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
            .addComponent(jButton7)
            .addContainerGap())
    );

    viewRemarkButton.setText("View Remark");
    viewRemarkButton.setVisible(false);
    viewRemarkButton.setBackground(new Color(154, 216, 211));


    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jButton2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewRemarkButton)
                    .addGap(243, 243, 243)
                    .addComponent(viewByButton))
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 711, GroupLayout.PREFERRED_SIZE))
            .addGap(97, 97, 97))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(viewByButton)
                .addComponent(jButton2)
                .addComponent(viewRemarkButton))
            .addGap(35, 35, 35))
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
        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
}                      



public JButton getviewByButton() {return viewByButton;}

public JButton getUndoButton() {return jButton2;}

public JButton getViewRemarkButton() {return viewRemarkButton;}

public JButton getCreateButton() {return jButton5;}

public JButton getLogButton() {return jButton7;}

public JButton getViewProjectButton() {return jButton8;}

public JButton getDashboardButton() { return jButton1;}

public JTable getTable(){return jTable1;}

}


                                          
