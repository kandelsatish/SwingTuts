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




public class ButtonAnnynomous {
        public static void main(String[] args)
        {
            ActionListnerWithAnnynomousObject cla=new ActionListnerWithAnnynomousObject();
            cla.setVisible(true);
            cla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            cla.setLayout(null);
            cla.setSize(500, 600);
            
        }
}
class ActionListnerWithAnnynomousObject extends JFrame 
{
    Container c;
    JButton btn1,btn2,btn3;
    ActionListnerWithAnnynomousObject()
    {
       btn1=new JButton("red");
       btn2=new JButton("yellow");
       btn3=new JButton("black");
       
       btn1.setBounds(50, 50, 100, 50);
       btn2.setBounds(50, 100, 100, 50);
       btn3.setBounds(50, 150, 100, 50);
       
       btn1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               c.setBackground(Color.red);
           }
       });
       
       btn2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               c.setBackground(Color.yellow);
           }
       });
          
       
        
       
       c=this.getContentPane();
       c.add(btn1);c.add(btn2);c.add(btn3);
       
    }

  
    
}
