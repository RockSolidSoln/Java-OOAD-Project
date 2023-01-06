import javax.swing.SwingUtilities;

public class Main {
  public static void main(String[] args) {

  // Create and show the main window
  SwingUtilities.invokeLater(new Runnable() {
    public void run() {
      // Registration Login =  new Registration();
      LoginMenu Login = new LoginMenu();
      Login.setVisible(true);
    }
  });
    
  }
}