

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame{
    Student student1 = new Student ("Mindy ak Balang", 3.8);
    JTextField textInfo = new JTextField ("",20);
    JButton btnInfo = new JButton ("Show student info");
    
     public GUI (){
        super ("Student Info");
        JPanel jp=new JPanel (new FlowLayout ());
        add(jp);

        textInfo.setPreferredSize (new Dimension (200,20));
        btnInfo.addActionListener (new ButtonActionListener ());
        
        jp.add (btnInfo);
        jp.add (textInfo);

        setSize (250,110);
        setVisible (true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class ButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed (ActionEvent e) {
            textInfo. setText (student1.getName () + " " + student1.getCgpa ());
        }
    }

    public static void main (String [] args){
    new GUI();
    }
}
