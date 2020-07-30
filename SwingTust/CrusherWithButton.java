/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//crusher with button
package SwingTust;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class CrusherWithButton {
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("crusher Demo");
        JButton btn=new JButton("cliock me!!");
        btn.setBackground(Color.yellow);
        btn.setForeground(Color.red);
        
        Cursor cur=new Cursor(Cursor.HAND_CURSOR);
        btn.setCursor(cur);
        
        Container c=frame.getContentPane();
        c.add(btn);
        btn.setBounds(100, 100, 100, 100);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
