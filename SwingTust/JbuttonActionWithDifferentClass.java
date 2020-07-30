/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingTust;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JbuttonActionWithDifferentClass {
    static JButton b1,b2,b3;
    static Container c;
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("button action with seperate class Demo");
        b1=new JButton("red");
        b2=new JButton("yello");
        
        b1.setBounds(10, 10, 100, 50);
        b2.setBounds(120, 10, 100, 50);
        
        c=frame.getContentPane();
        c.setLayout(null);
        c.add(b1);c.add(b2);
        
         Redbackground red=new Redbackground();
         b1.addActionListener(red);
        
        
        frame.setVisible(true);
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
class Redbackground implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent ae) {
        JbuttonActionWithDifferentClass.c.setBackground(Color.red);
    }
    
}
class Yelloobackground implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent ae) {
        JbuttonActionWithDifferentClass.c.setBackground(Color.yellow);
    }
    
}
