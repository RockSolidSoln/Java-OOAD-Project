package controller;

import model.AdminRemarkModel;
import view.AdminRemarkView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 *
 * @author
 */
public class AdminRemarkController {
    public final AdminRemarkView view;
    public static AdminRemarkModel model;
    private static AdminRemarkController singletonInstance;


    public AdminRemarkController(AdminRemarkView view, AdminRemarkModel model){
        this.model = model;
        this.view = view;

        view.getCommentField().addActionListener(new AdminRemarkController.RemarkListener());/*Comment field */
        view.getBackButton().addActionListener(new AdminRemarkController.RemarkListener()); /*go back to view projects */
        view.getPublishCommentButton().addActionListener(new AdminRemarkController.RemarkListener()); /*Publish comment  */

        String projectId = view.getProjectId();
        model.readRemark(projectId);

        System.out.println(projectId);
        ArrayList<String> adminId = model.getAdminIds();
        ArrayList<String> adminRemark = model.getAdminRemarks();

        for (int i = 0; i < adminId.size(); i++) {
            view.getComment().append(adminId.get(i) + ": " + adminRemark.get(i) + "\n");
        }

    }
    public static AdminRemarkController getInstance(AdminRemarkView view, AdminRemarkModel model) {
        if (singletonInstance == null) {
            singletonInstance = new AdminRemarkController(view, model);
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
                model.getAdminIds().clear();
                model.getAdminRemarks().clear();
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
