import model.LoginModel;
import view.LoginView;
import controller.LoginController;

import controller.AdminDashboardController;
import controller.LecturerDashboardController;
import view.AdminDashboardView;
import view.LecturerDashboardView;


public class Main {
    public static void main(String[] args) {
       LoginModel model = LoginModel.getInstance(null, null);
       LoginView view = new LoginView();
       LoginController controller = new LoginController(view, model);

        // AdminDashboardView view = new AdminDashboardView();
        // AdminDashboardController controller = new AdminDashboardController(view);

        //LecturerDashboardView view = new LecturerDashboardView();
        //LecturerDashboardController controller = new LecturerDashboardController(view);
        view.setVisible(true);
    }
}