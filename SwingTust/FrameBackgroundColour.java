/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingTust;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class FrameBackgroundColour {
    public static void main(String [] args)
    {
        JFrame frame=new JFrame("Demo");
        frame.setVisible(true);
        frame.setSize(100, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=frame.getContentPane();
        c.setBackground(Color.BLACK);
        frame.setResizable(false);
        
        
    }
    
}
