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
public class LabelImageAndLabelText {
    public static void main(String[] args)
    {
    
    JFrame frame=new JFrame("ImageToLabel Demo");
    ImageIcon  icon=new ImageIcon("D:\\Git\\iconimage.png");
    
    JLabel label1=new JLabel("ImageAndTextAtLabel",icon,JLabel.LEFT);
    label1.setBounds(100, 50, icon.getIconWidth(), icon.getIconHeight());
    
    JLabel label2=new JLabel("ImageAndTextAtLabel",icon,JLabel.RIGHT);
    label2.setBounds(100, 150, icon.getIconWidth(), icon.getIconHeight());
    
    JLabel label3=new JLabel("ImageAndTextAtLabel",icon,JLabel.CENTER);
    label3.setBounds(100, 250, icon.getIconWidth(), icon.getIconHeight());
    
    Container c=frame.getContentPane();
    frame.setLayout(null);
    
    
    c.add(label1);
    c.add(label2);
    c.add(label3);
    
    frame.setVisible(true);
    frame.setSize(500, 800);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
