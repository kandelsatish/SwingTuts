/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingTust;

import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class ImageToLabel {
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("ImageToLabel Demo");
        
        JLabel label=new JLabel();
        ImageIcon icon=new ImageIcon("D:\\Git\\iconimage.png");
        label.setIcon(icon);
        
        Container c=frame.getContentPane();
        c.add(label);
       label.setSize(icon.getIconWidth(), icon.getIconHeight());
        
        
        
        
        
        frame.setVisible(true);
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
