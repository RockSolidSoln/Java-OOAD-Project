import javax.swing.*;

import view.Credentials;

import java.awt.*;
import java.awt.event.*;


public class Registration extends JFrame implements ActionListener
{

   JLabel l1, l2, l3, l4, l5, l6, l7;
   JTextField name, email, role, phone;
   JButton btn1, btn2;
   JPasswordField password, password2;
   Registration()
   {
       setVisible(true);
       setSize(700, 700);
       setLayout(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setTitle("Registration Form in Java");
       l1 = new JLabel("Registration Form in Windows Form:");
       l1.setForeground(Color.blue);
       l1.setFont(new Font("Serif", Font.BOLD, 20));
       l2 = new JLabel("Name:");
       l3 = new JLabel("Email-ID:");
       l4 = new JLabel("Create Passowrd:");
       l5 = new JLabel("Confirm Password:");
       l6 = new JLabel("Role:");
       l7 = new JLabel("Phone No:");
       name = new JTextField();
       email = new JTextField();
       password = new JPasswordField();
       password2 = new JPasswordField();
       role = new JTextField();
       phone = new JTextField();
       btn1 = new JButton("Submit");
       btn2 = new JButton("Clear");
       btn1.addActionListener(this);
       btn2.addActionListener(this);
       l1.setBounds(100, 30, 400, 30);
       l2.setBounds(80, 70, 200, 30);
       l3.setBounds(80, 110, 200, 30);
       l4.setBounds(80, 150, 200, 30);
       l5.setBounds(80, 190, 200, 30);
       l6.setBounds(80, 230, 200, 30);
       l7.setBounds(80, 270, 200, 30);
       name.setBounds(300, 70, 200, 30);
       email.setBounds(300, 110, 200, 30);
       password.setBounds(300, 150, 200, 30);
       password2.setBounds(300, 190, 200, 30);
       role.setBounds(300, 230, 200, 30);
       phone.setBounds(300, 270, 200, 30);
       btn1.setBounds(50, 350, 100, 30);
       btn2.setBounds(170, 350, 100, 30);
       add(l1);
       add(l2);
       add(name);
       add(l3);
       add(email);
       add(l4);
       add(password);
       add(l5);
       add(password2);
       add(l6);
       add(role);
       add(l7);
       add(phone);
       add(btn1);
       add(btn2);
   }
   public void actionPerformed(ActionEvent e)
   {
       if (e.getSource() == btn1)
        {
           String nameField = name.getText();
           String emailField = email.getText();
           char[] temp = password.getPassword();
           char[] temp1 = password2.getPassword();
           String passwordField = new String(temp);
           String confirmPasswordField = new String(temp1);
           String roleField = role.getText();
           String phoneField = phone.getText();
           if (passwordField.equals(confirmPasswordField))
           {
               try
               {
                    Credentials.saveCredsToFile(nameField, emailField, confirmPasswordField, roleField, phoneField);
               }
               catch (Exception ex)
               {
                   System.out.println(ex);
               }
           }
           else
           {
               JOptionPane.showMessageDialog(btn1, "Password Does Not Match");
           }
         }
         else
         {
           name.setText("");
           email.setText("");
           password.setText("");
           password2.setText("");
           role.setText("");
           phone.setText("");
         }
   }
}