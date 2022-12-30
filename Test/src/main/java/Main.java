import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.SwingUtilities;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

public class Main {
  public static void main(String[] args) {

    // // Initialize the Firebase Admin SDK
    initializeFirebaseAdminSDK();

  // Create and show the main window
  SwingUtilities.invokeLater(new Runnable() {
    public void run() {
      Registration mainWindow = new Registration();
      mainWindow.setVisible(true);
    }
  });
    
  }
  public static void initializeFirebaseAdminSDK() {
    // Initialize the Firebase Admin SDK
    try {
      // Read the service account credentials file
      FileInputStream serviceAccount = new FileInputStream("Test/src/main/resources/key.json");

      // Initialize the Firebase Admin SDK with the service account credentials
      FirebaseOptions options = new FirebaseOptions.Builder()
          .setCredentials(GoogleCredentials.fromStream(serviceAccount))
          .build();
      FirebaseApp.initializeApp(options);
      System.out.println("Successful Initialization");
      
    } catch (IOException e) {
      System.out.println("Error initializing the Firebase Admin SDK: " + e.getMessage());
    }
  }
}