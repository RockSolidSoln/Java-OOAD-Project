package view;

import javax.swing.*;
import java.awt.*;  
import java.awt.event.*; 


public class LoginView extends JFrame {

    private JButton loginButton, exitButton;
    private JTextField userIdField;
    private JPasswordField passwordField;
    private static LoginView singletonInstance;

    public static LoginView getInstance() {
        if (singletonInstance == null) {
                singletonInstance = new LoginView();
        }
        return singletonInstance;
    }
    /**
     * Creates new form NewJFrame
     */
    public LoginView() {
        initComponents();
    }
                  
    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        userIdField = new JTextField();
        passwordField = new JPasswordField();
        // Variables declaration - do not modify
        loginButton = new JButton();
        exitButton = new JButton();
        JLabel imageLabel = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new Color(0, 168, 209));

        jPanel2.setBackground(new Color(235, 252, 255));

        loginButton.setBackground(new Color(0, 168, 209));
        loginButton.setForeground(new Color(255, 255, 255));
        loginButton.setText("Login");

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Segue UI", Font.PLAIN, 20)); // NOI18N
        JLabel userIdLabel = new JLabel("User Id");
        userIdLabel.setFont(new Font("Segue UI", Font.PLAIN, 20)); // NOI18N
        JLabel headingLabel = new JLabel("MMUProject");
        headingLabel.setFont(new Font("Segue UI", Font.PLAIN, 20)); // NOI18N

        String basePath = System.getProperty("user.dir");
        imageLabel.setIcon(new ImageIcon(basePath + "\\Test\\src\\assets\\Man.png"));

        exitButton.setBackground(new Color(0, 168, 209));
        exitButton.setForeground(new Color(255, 255, 255));
        exitButton.setText("Exit");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184)
                        .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(userIdLabel, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordLabel, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
                        .addComponent(userIdField)
                        .addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(userIdLabel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(userIdField, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(passwordLabel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        headingLabel.setBackground(new Color(230, 230, 230));
        headingLabel.setFont(new Font("Serif", Font.PLAIN, 36)); // NOI18N
        headingLabel.setForeground(new Color(230, 230, 230));
        headingLabel.setHorizontalAlignment(SwingConstants.TRAILING);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(headingLabel, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
//                .addComponent(imageLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(headingLabel, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
//                .addComponent(imageLabel, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        



    // End of variables declaration                   
    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public String getUserId() {
        return userIdField.getText();
    }

    public JTextField getUserIdField() {
        return userIdField;
    }

    public JPasswordField getPasswordField(){
        return passwordField;
    }

    public char[] getPassword() {
        return passwordField.getPassword();
    }

    public void displayLoginFailureMessage() {
        JOptionPane.showMessageDialog(null, "Try again!", "Login Failure", JOptionPane.INFORMATION_MESSAGE);
        
    }

}