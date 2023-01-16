import model.LoginModel;
import view.LoginView;
import controller.LoginController;

import controller.AdminDashboardController;
import controller.CreateAccountController;
import controller.LecturerDashboardController;
import view.AdminDashboardView;
import view.CreateAccountView;
import view.LecturerDashboardView;


public class Main {
    public static void main(String[] args) {
       LoginModel model = LoginModel.getInstance(null, null);
       LoginView view = new LoginView();
       LoginController controller = new LoginController(view, model);

        view.setVisible(true);
    }
}