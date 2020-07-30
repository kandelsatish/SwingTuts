/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingTust;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtons {
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("jradioButtonDemo");
        Container c=frame.getContentPane();
        JRadioButton radio1=new JRadioButton("male");
        JRadioButton radio2=new JRadioButton("female");
       // radio1.setBounds(100, 20, 100, 50);
        //radio2.setBounds(200, 20, 100, 50);
        ButtonGroup gender=new ButtonGroup();
        gender.add(radio1);
        gender.add(radio2);
        c.add(radio1);
        c.add(radio2);
        
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 600);
        c.setLayout(new FlowLayout());
    }

    JRadioButtons(String male) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

