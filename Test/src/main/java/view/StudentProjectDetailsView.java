package view;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author anis
 */
public class StudentProjectDetailsView extends JFrame {

    /**
     * Creates new form StudentProjectDetailsView
     */
    public StudentProjectDetailsView() {
        initComponents();
    }
    private static StudentProjectDetailsView singletonInstance;

    public static StudentProjectDetailsView getInstance(){
        if (singletonInstance == null) {
            singletonInstance = new StudentProjectDetailsView();
        }
        return singletonInstance;
    }

    /* Variables declaration - do not modify*/ 
    private JButton backButton;
    /*  End of variables declaration*/

    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel7 = new JLabel();
        JLabel projectSpecializationLabel = new JLabel();
        backButton = new JButton();
        JTextField projectDetailsTextField = new JTextField();
        /* Styling for components */
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new Color(0, 168, 209));

        jLabel1.setFont(new Font("SansSerif", Font.PLAIN, 24)); // NOI18N
        jLabel1.setText("My Project");

        jLabel2.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        jLabel2.setText("Project Name");

        jLabel3.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        jLabel3.setText("Project Specialization:");

        jLabel4.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        jLabel4.setText("Project Details");

        jLabel7.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        jLabel7.setText("Project Name");

        projectSpecializationLabel.setFont(new Font("SansSerif", Font.PLAIN, 18)); // NOI18N
        projectSpecializationLabel.setText("Project Specialization");

        backButton.setText("Back");
        backButton.setForeground(Color.WHITE);
        backButton.setBackground(new Color(100, 198, 217));
        /*Layout for the screen */
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2, GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, GroupLayout.Alignment.LEADING))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(projectSpecializationLabel, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(projectDetailsTextField, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(26, 26, 26))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(296, 296, 296)
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(backButton)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(87, 87, 87)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel7))
                                                .addGap(147, 232, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(projectSpecializationLabel))
                                                .addGap(66, 66, 66)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(projectDetailsTextField, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))))
                                .addGap(86, 86, 86)
                                .addComponent(backButton))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    public JButton getBackButton(){
        return backButton;
    }

}