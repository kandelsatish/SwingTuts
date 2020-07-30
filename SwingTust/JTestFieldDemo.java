/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//JTextField,setBound,Font,background colour, foreground colour, create a new colour and apply
package SwingTust;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class JTestFieldDemo {
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("text field Demo");
        Container c=frame.getContentPane();
        JTextField tf=new JTextField();
        tf.setBounds(100, 100, 200, 200);
        c.add(tf);
         //creating a new colour
        Color col=new Color(100, 125,90 );
       // tf.setBackground(Color.yellow);
        //tf.setForeground(Color.RED);
        tf.setBackground(col);
        tf.setForeground(Color.RED);
        
        
       
        Font f=new Font("Arial", Font.ITALIC,25);
        tf.setFont(f);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
