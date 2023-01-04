import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.auth.UserRecord;
import com.google.firebase.auth.UserRecord.CreateRequest;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class RegistrationForm extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JTextField nameField;
    private JButton registerButton;

    public <UserCredential> RegistrationForm() {


        // Initialize the UI components
        emailField = new JTextField();
        passwordField = new JPasswordField();
        nameField = new JTextField();
        registerButton = new JButton("Register");
    
        // Add an action listener to the register button
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                String name = nameField.getText();

                try{
                // Create a new user with email and password
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

                CreateRequest request = new CreateRequest()
                    .setEmail(email)
                    .setEmailVerified(false)
                    .setPassword(password)
                    .setPhoneNumber("+11234567890")
                    .setDisplayName(name)
                    .setPhotoUrl("http://www.example.com/12345678/photo.png")
                    .setDisabled(false);

                UserRecord userRecord = FirebaseAuth.getInstance().createUser(request);

                // UserRecord userRecord = firebaseAuth.createUser(email, password);
                        // .addOnCompleteListener(this, new OnCompleteListener<UserCredential>() {
                        //     @Override
                        //     public void onComplete(@NonNull Task<UserCredential> task) {
                        //         if (task.isSuccessful()) {
                        //             // Get the user
                        //             UserRecord user = task.getResult().getUser();
                                 
                        //             // Show a success message
                        //             JOptionPane.showMessageDialog(RegistrationForm.this,
                        //                     "User registered successfully!");

                        //             // Clear the form
                        //             emailField.setText("");
                        //             passwordField.setText("");
                        //             nameField.setText("");
                        //         } else {
                        //             // Show an error message
                        //             JOptionPane.showMessageDialog(RegistrationForm.this,
                        //                     "Error registering user: " + task.getException().getMessage());
                        //         }
                        //     }
                        // });
                System.out.println("Successfully created new user: " + userRecord.getUid());

                }catch(FirebaseAuthException ex){
                    System.out.println("Error creating new user: " + ex.getMessage());
                }      

                }
            }); 
            

        // Add the UI components to the frame
        add(emailField);
        add(passwordField);
        add(nameField);
        add(registerButton);

        // Set the frame properties
        setTitle("Registration Form");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));
    }
}
