package SwingTust;


import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class FrameIconImage {
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("ImageIcon");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon=new ImageIcon("iconimage.PNG");
        frame.setIconImage(icon.getImage());
    }
    
}
