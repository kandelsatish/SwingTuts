/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingTust;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author user
 * By default the containtplane or a frame follows a flowlayout 
 * 
 */
public class JLabelDemo {
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("JLabelDemo");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JLabel l1=new JLabel("username");
        l1.setBounds(100,100,200,200);
        l1.setText("hello mr man.");
        Container c=frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        c.add(l1);
        
        //set font for a lable
        Font f=new Font("Arial",Font.PLAIN,20);
        l1.setFont(f);
       
        

        
       
    }
}
