import model.LoginModel;
import view.LoginView;
import controller.LoginController;

import controller.AdminDashboardController;
import view.AdminDashboardView;


public class Main {
    public static void main(String[] args) {
//        LoginModel model = new LoginModel();
//        LoginView view = new LoginView();
//        LoginController controller = new LoginController(view, model);

        AdminDashboardView view = new AdminDashboardView();
        AdminDashboardController controller = new AdminDashboardController(view);

        view.setVisible(true);
    }
}