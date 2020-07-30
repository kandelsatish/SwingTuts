/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Simple jButton,set image to button, set location,background.
package SwingTust;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class JbuttonAndImage {
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("Button And Image");
        
        //JButton btn=new JButton("click me!");
        // btn.setText("hello");
        ImageIcon icon=new ImageIcon("D:\\Git\\iconimage.png");
        JButton btn=new JButton(icon);
        btn.setBounds(100, 100, icon.getIconWidth(),icon.getIconHeight());
        
        Container c=frame.getContentPane();
        c.add(btn);
        
        //setBackground colour to the button
        Color col=new Color(100, 20, 125);
        btn.setBackground(col);
        
        //set font and font size
        Font f=new Font("Arial", Font.ITALIC, 30);
        btn.setFont(f);
        
        
        frame.setVisible(true);
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     
}
