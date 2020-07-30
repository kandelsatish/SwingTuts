/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingTust;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListnerDemo {
    public static void main(String[] args)
    {
        ButtonActions ba=new ButtonActions();
        ba.setLayout(null);
        ba.setVisible(true);
        ba.setSize(400, 500);
        ba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}

class ButtonActions extends JFrame implements ActionListener
{
    JButton btn1,btn2,btn3;
    Container c;
    ButtonActions()
    {
       c=this.getContentPane();
       btn1=new JButton("Red");
       btn2=new JButton("Yellow");
       btn3=new JButton("Green");
       btn1.setBounds(100, 100, 100, 50);
       btn2.setBounds(100, 150, 100, 50);
       btn3.setBounds(100, 200, 100, 50);
       c.add(btn2);
       c.add(btn3);
       c.add(btn1);
       btn1.addActionListener(this);
       btn2.addActionListener(this);
       btn3.addActionListener(this);
       
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==btn1)
       {
           c.setBackground(Color.red);
       }
       else if(ae.getSource()==btn2)
       {
           c.setBackground(Color.yellow);
           
       }
       else
       {
           c.setBackground(Color.GREEN);
       }
    }
}

