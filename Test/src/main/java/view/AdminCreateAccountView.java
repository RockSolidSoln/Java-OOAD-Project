package view;

import model.LoginModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author
 */
public class AdminCreateAccountView extends JFrame {
    
    private static AdminCreateAccountView singletonInstance;

    public AdminCreateAccountView() {
        initComponents();
    }
    
    public static AdminCreateAccountView getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new AdminCreateAccountView();
        }
        return singletonInstance;
    }

    private JButton jButton1;
    private JButton jButton5;
    private JButton jButton2;
    private JButton jButton6;
    private JButton jButton3, jButton7, jButton4;
    private JLabel jLabel9;
    private JLabel jLabel10;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField5;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JPasswordField jPasswordField1;
    private JPasswordField jPasswordField2;
    private JComboBox<String> jComboBox1;


    private void initComponents() {

        JLabel jLabel3 = new JLabel();
        PopupMenu popupMenu1 = new PopupMenu();
        MenuBar menuBar1 = new MenuBar();
        Menu menu1 = new Menu();
        Menu menu2 = new Menu();
        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();
        // Variables declaration - do not modify
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel9 = new JLabel();
        JPanel jPanel2 = new JPanel();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton3 = new JButton();
        JLabel jLabel8 = new JLabel();
        jButton7 = new JButton();
        jButton4 = new JButton();
        jLabel10 = new JLabel();
        JLabel jLabel11 = new JLabel();
        jPasswordField1 = new JPasswordField();
        jPasswordField2 = new JPasswordField();

        jLabel3.setBackground(new   Color(230, 230, 230));
        jLabel3.setFont(new   Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jLabel3.setForeground(new   Color(230, 230, 230));
        jLabel3.setText("Account type");

        popupMenu1.setLabel("popupMenu1");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        jPanel1.setBackground(new   Color(0, 168, 209));

        jLabel1.setBackground(new   Color(230, 230, 230));
        jLabel1.setFont(new   Font("SansSerif", Font.PLAIN, 36)); // NOI18N
        jLabel1.setForeground(new   Color(230, 230, 230));
        jLabel1.setText("Account Creation");

        jLabel2.setBackground(new   Color(230, 230, 230));
        jLabel2.setFont(new   Font("SansSerif", Font.PLAIN, 24)); // NOI18N
        jLabel2.setForeground(new   Color(230, 230, 230));
        jLabel2.setText("Account type");

        jLabel4.setBackground(new   Color(230, 230, 230));
        jLabel4.setFont(new   Font("SansSerif", Font.PLAIN, 24)); // NOI18N
        jLabel4.setForeground(new   Color(230, 230, 230));
        jLabel4.setText("Full Name");

        jLabel5.setBackground(new   Color(230, 230, 230));
        jLabel5.setFont(new   Font("SansSerif", Font.PLAIN, 24)); // NOI18N
        jLabel5.setForeground(new   Color(230, 230, 230));
        jLabel5.setText("Phone Number");

        jLabel6.setBackground(new   Color(230, 230, 230));
        jLabel6.setFont(new   Font("SansSerif", Font.PLAIN, 24)); // NOI18N
        jLabel6.setForeground(new   Color(230, 230, 230));
        jLabel6.setText("E-MAIL");

        jLabel7.setBackground(new   Color(230, 230, 230));
        jLabel7.setFont(new   Font("SansSerif", Font.PLAIN, 24)); // NOI18N
        jLabel7.setForeground(new   Color(230, 230, 230));
        jLabel7.setText("UserId");

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "ADMIN", "LECTURER", "STUDENT", " " }));
        jComboBox1.setCursor(new   Cursor(  Cursor.DEFAULT_CURSOR));
        jComboBox1.setNextFocusableComponent(jTextField2);
        jComboBox1.addItemListener(this::jComboBox1ItemStateChanged);

        jTextField1.setVisible(false);


        jButton1.setText("Create Account");

        jButton2.setText("Exit");

        jLabel9.setBackground(new   Color(230, 230, 230));
        jLabel9.setFont(new   Font("SansSerif", Font.PLAIN, 24)); // NOI18N
        jLabel9.setForeground(new   Color(230, 230, 230));
        jLabel9.setText("Confirm password");

        jPanel2.setBackground(new   Color(235, 252, 255));
        jButton3.setBackground(new   Color(154, 216, 211));
        jButton3.setFont(new   Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton3.setText("Dashboard");
        jButton3.setOpaque(true);

        jButton5.setBackground(new Color(96, 132, 223));
        jButton5.setFont(new   Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton5.setText("Create Account");

        jButton6.setBackground(new   Color(154, 216, 211));
        jButton6.setFont(new   Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton6.setText("View Reports");
        jButton6.setOpaque(true);

        jLabel8.setFont(new   Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        jLabel8.setText(LoginModel.getUserId());

        jButton7.setBackground(new   Color(154, 216, 211));
        jButton7.setFont(new   Font("SansSerif", Font.PLAIN, 14)); // NOI18N
        jButton7.setForeground(new   Color(255, 51, 102));
        jButton7.setText("Logout");

        jButton4.setBackground(new   Color(154, 216, 211));
        jButton4.setFont(new   Font("SansSerif", Font.PLAIN, 12)); // NOI18N
        jButton4.setText("View Project");
        jButton4.setOpaque(true);

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jButton3)
                                .addGap(12, 12, 12)
                                .addComponent(jButton4)
                                .addGap(12, 12, 12)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7)
                                .addContainerGap())
        );

        jLabel10.setBackground(new   Color(230, 230, 230));
        jLabel10.setFont(new   Font("SansSerif", Font.PLAIN, 24)); // NOI18N
        jLabel10.setForeground(new   Color(230, 230, 230));
        jLabel10.setText("Specialization");

        jLabel10.setVisible(false);

        jLabel11.setBackground(new   Color(230, 230, 230));
        jLabel11.setFont(new   Font("SansSerif", Font.PLAIN, 24)); // NOI18N
        jLabel11.setForeground(new   Color(230, 230, 230));
        jLabel11.setText("Password");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jPasswordField2, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(175, 175, 175)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 351, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(225, 225, 225))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                                .addGap(107, 107, 107)
                                                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jButton1)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(jLabel9)
                                                                                .addComponent(jTextField5)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(jTextField4)
                                                                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBox1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jPasswordField1, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)))
                                                                .addGap(154, 154, 154))))
                                        .addComponent(jLabel4)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                                .addGap(7, 7, 7)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(jLabel4))
                                        .addComponent(jLabel6, GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPasswordField2, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                        .addComponent(jPasswordField1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 70, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))))
                                .addGap(21, 21, 21))
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTextField1.getAccessibleContext().setAccessibleName("");
        // jLabel9.setVisible(false);


        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 1072, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void jComboBox1ItemStateChanged(ItemEvent evt) {

        if(evt.getStateChange() == ItemEvent.SELECTED){
            String selectedItem = (String)evt.getItem();
            if  (selectedItem.equals("STUDENT")){
                jTextField1.setVisible(true);
                jLabel9.setVisible(true);
                jLabel10.setVisible(true);
                revalidate();
                repaint();
            } else {
                jTextField1.setVisible(false);
                jLabel10.setVisible(false);
            }

        revalidate();
        repaint();
        }
    }

    //Dashboard
    public JButton getButton3() {
        return jButton3;
    }
    //Dashboard
    public JButton getButton4() {
        return jButton4;
    }
    //Create account
    public JButton getButton5() {
        return jButton5;
    }

    //View report
    public JButton getButton6() {
        return jButton6;
    }

    //Logout
    public JButton getButton7() {
        return jButton7;
    }
    public JButton getCreateAccountButton(){
        return jButton1; 
    }

    public JButton getExitButton() {
        return jButton2;
    }

    //Getters for the text fields
    public String getUserId(){
        System.out.println(jTextField2.getText());
        return jTextField2.getText();
    }
    public String getName(){
        return jTextField3.getText();
    }
    public String getPhone(){
        return jTextField4.getText();
    }
    public String getSpecialization(){
        return jTextField1.getText();
    }

    public char[] getPassword(){
        return jPasswordField1.getPassword();
    }

    public char[] getPassword2(){
        return jPasswordField2.getPassword();
    }

    public String getUsertype(){
        return (String) jComboBox1.getSelectedItem(); 
    }

    public String getEmail(){
        return jTextField5.getText();
    }

    public void displayFailureMessage() {
        JOptionPane.showMessageDialog(null, "There was something wrong with the input, Check the fields and try again!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}