/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingTust;

import javax.swing.JFrame;


public class SizeLocationBounds {
    
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("Demo");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //frame.setLocation(400,400);//weidth and height.
        frame.setBounds(100, 200, 400, 400);//left-margin,top-margin,width,height
        
    }
}
