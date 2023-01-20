package controller;

import model.AdminRemarkModel;
import model.LoginModel;
import view.AdminRemarkView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AdminRemarkController {
    public final AdminRemarkView view;
    private static AdminRemarkController singletonInstance;


    public AdminRemarkController(AdminRemarkView view){
        this.view = view;

        view.getCommentField().addActionListener(new AdminRemarkController.RemarkListener());
        view.getBackButton().addActionListener(new AdminRemarkController.RemarkListener()); //go back to view projects
        view.getPublishCommentButton().addActionListener(new AdminRemarkController.RemarkListener());

        String projectId = view.getProjectId();
        AdminRemarkModel remarkModel = AdminRemarkModel.getInstance();
        AdminRemarkModel.readRemark(projectId);
        ArrayList<String> adminId, adminRemark;
        adminId = AdminRemarkModel.getInstance().getAdminId();
        adminRemark =
        view.getComment().append(adminId + ": " + adminRemark + "\n");
    }
    public static AdminRemarkController getInstance(AdminRemarkView view) {
        if (singletonInstance == null) {
            singletonInstance = new AdminRemarkController(view);
        }
        return singletonInstance;
    }

    public class RemarkListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getPublishCommentButton()) {
                publishCommentButtonActionPerformed(e);
            } else if (e.getSource() == view.getBackButton()) {
                view.dispose();
                RoutingController.AdminViewProjectActionPerformed();
            }

        }

        private void publishCommentButtonActionPerformed(ActionEvent e) {
            String text = view.getCommentField().getText();
            String projectId =view.getProjectId();
            AdminRemarkModel.publishComment(projectId, text);
            String updateRemark = AdminRemarkModel.updateRemarks(projectId);
            view.getComment().setText(updateRemark);
        }
    }

}
