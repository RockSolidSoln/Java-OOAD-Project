import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserIdentifier;
import com.google.firebase.auth.ImportUserRecord;
import com.google.firebase.auth.UserRecord;
import com.google.firebase.auth.UserRecord.CreateRequest;


public class Login extends JFrame implements ActionListener {

    JLabel l1, l2, l3;   //label for email and password
    JTextField emailField; // email field
    JButton btn1; // login button
    JPasswordField passwrodField; // password field

    Login() {

        setTitle("Login Form in Windows Form");
        setVisible(true);
        setSize(800, 800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Login Form in Windows Form:");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        l2 = new JLabel("Enter Email:");
        l3 = new JLabel("Enter Password:");
        emailField = new JTextField();
        passwrodField = new JPasswordField();
        btn1 = new JButton("Submit");

        l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        emailField.setBounds(300, 70, 200, 30);
        passwrodField.setBounds(300, 110, 200, 30);
        btn1.setBounds(150, 160, 100, 30);

        add(l1);
        add(l2);
        add(emailField);
        add(l3);
        add(passwrodField);        
        add(btn1);
        btn1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        String email = emailField.getText();
        char[] temp = passwrodField.getPassword();
        String password = new String(temp);
        try {
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
            // firebaseAuth.signInWithEmailAndPassword(email, password);

            UserRecord userRecord = firebaseAuth.getUserByEmail(email);
            // See the UserRecord reference doc for the contents of userRecord.
            System.out.println("Successfully fetched user data: " + userRecord);
        
            // Create a custom token for the user
            Map<String, Object> claims = new HashMap<>();
            claims.put("admin", true);
            String customToken = FirebaseAuth.getInstance().createCustomToken(userRecord.getUid(), claims);

           // Verify the custom token and get the user's UID
           String uid = FirebaseAuth.getInstance().verifyIdToken(customToken).getUid();
 
           // Retrieve the user record
           userRecord = FirebaseAuth.getInstance().getUser(uid);
 
           // Check if the user is an administrator
           if (userRecord.getCustomClaims().containsKey("admin") && (boolean) userRecord.getCustomClaims().get("admin")) {
             // Show a success message
             JOptionPane.showMessageDialog(Login.this, "Logged in as administrator!");
            //  emailField.setText("");
            //  passwordField.setText("");
           } else {
             // Show an error message
             JOptionPane.showMessageDialog(Login.this, "Error logging in: You are not an administrator.");
           }
        } catch (FirebaseAuthException ex) {
            System.out.println(ex);

        }

    }

    public static void main(String arr[]) {
        Main.initializeFirebaseAdminSDK();
        new Login();
    }

}