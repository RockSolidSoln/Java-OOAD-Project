package controller;

import model.Project;
import view.AdminReportView;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author salah
 */
public class AdminReportController {
    public static AdminReportController singletonInstance;
    private final AdminReportView view;


    public AdminReportController(AdminReportView view){
        this.view = view;
        view.getDashboardButton().addActionListener(new AdminReportController.NavigatorsListener()); //dashboard
        view.getCreateButton().addActionListener(new AdminReportController.NavigatorsListener()); //create account
        view.getLogButton().addActionListener(new AdminReportController.NavigatorsListener());//logout
        view.getViewProjectButton().addActionListener(new AdminReportController.NavigatorsListener());//view project
        view.getViewRemarkButton().addActionListener(new AdminReportController.NavigatorsListener());//view remark
        view.getUndoButton().addActionListener(new AdminReportController.NavigatorsListener());//undo
        view.getviewByButton().addActionListener(new AdminReportController.NavigatorsListener());//

        ProjectTableLoader();
    }
    public static AdminReportController getInstance(AdminReportView view) {
        if (singletonInstance == null) {
            singletonInstance = new AdminReportController(view);
        }
        return singletonInstance;
    }


    public void ProjectTableLoader(){
        Project projectModel = Project.getInstance("null", "null", "null","null", "null", "null", "null");
        ArrayList<ArrayList<String>> allProjects = projectModel.getAllProjects();

        ((DefaultTableModel) view.getTable().getModel()).setRowCount(0);

        for (ArrayList<String> allProject : allProjects) {
            String[] values = new String[7];
            values[0] = allProject.get(0);
            values[1] = allProject.get(1);
            values[2] = allProject.get(2);
            values[3] = allProject.get(3);
            values[4] = allProject.get(4);
            values[5] = allProject.get(5);
            values[6] = "Something";

            ((DefaultTableModel) view.getTable().getModel()).insertRow(0, values);
        }
    }


    class NavigatorsListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.getCreateButton()) { //Admin - Create account
                view.dispose();
                RoutingController.AdminCreateAccountActionPerformed();
            } else if (e.getSource() == view.getLogButton()) { // Admin - Logout
                view.dispose();
                RoutingController.LogoutActionPerformed();
            } else if (e.getSource() == view.getViewProjectButton()) { // Admin - View Project Pressed
                view.dispose();
                RoutingController.AdminViewProjectActionPerformed();
            } else if (e.getSource() == view.getDashboardButton()) { // Admin - View Project Pressed
                view.dispose();
                RoutingController.AdminDashboardActionPerformed();
            } else if (e.getSource() == view.getViewRemarkButton()) { // Admin - Logout Pressed

            } else if (e.getSource() == view.getUndoButton()) { // Admin - Logout Pressed


            } else if (e.getSource() == view.getviewByButton()) { // Admin - Logout Pressed

            }

        }
    }

}

private void viewByButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
    // TODO add your handling code here:
    if (jTable1.getSelectedRow() != -1 && jTable1.getSelectedColumn() != -1) {
    int selectedRow = jTable1.getSelectedRow();
    int selectedCol = jTable1.getSelectedColumn();
    if (selectedRow >= 0 && selectedCol >= 0) {
    Object selectedValue = jTable1.getValueAt(selectedRow, selectedCol);
    List<String[]> selectedRows = new ArrayList<>();
     try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\salah\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\newpackage\\project.csv"))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            if (values[selectedCol].equals(selectedValue)) {
                selectedRows.add(values);
            } 
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
       DefaultTableModel model = new DefaultTableModel(new String[]{"Project ID", "Project Name", "Lecturer Name", "Specialization", "Assigned", "Status", "Comment"}, 0);
    for (String[] row : selectedRows) {
        model.addRow(row);
    }
    jTable1.setModel(model);
    }
    }
}                                            
private DefaultTableModel originalModel; 

private void createOriginalModel() { // u need this for saving originalModel
originalModel = (DefaultTableModel) jTable1.getModel();
}
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    // TODO add your handling code here:
    jTable1.setModel(originalModel);
}                                        

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    // TODO add your handling code here:
}                                        

private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    // TODO add your handling code here:
}                                        

private void viewRemarkButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
    // TODO add your handling code here:
//         int selectedRow = jTable1.getSelectedRow();
//        if (selectedRow != -1) {
//            // get the value of the project ID column
//            String projectID = (String) jTable1.getValueAt(selectedRow, 0);
//            // redirect to ProjectDetails JFrame here
//            RemarkSection remarkSection = new RemarkSection(projectID);
//remarkSection.setVisible(true);
//        } else {
//            // show a pop-up message
//            JOptionPane.showMessageDialog(null, "Please select a row from the table.");
//        }
//    }
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow != -1) {
        // get the value of the project ID column
        String projectID = (String) jTable1.getValueAt(selectedRow, 0);
        // redirect to ProjectDetails JFrame here
        RemarkSection remarkSection = new RemarkSection(projectID);
remarkSection.setVisible(true);
    }else {
        // show a pop-up message
        JOptionPane.showMessageDialog(null, "Please select a row from the table.");
    }
}    
