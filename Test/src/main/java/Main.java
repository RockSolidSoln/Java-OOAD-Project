import model.LoginModel;
import view.LoginView;
import controller.LoginController;


public class Main {
    public static void main(String[] args) {
       LoginModel model = LoginModel.getInstance(null, null);
       LoginView view = new LoginView();
       LoginController controller = new LoginController(view, model);

        view.setVisible(true);
    }
}