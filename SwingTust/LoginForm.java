/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingTust;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class DemoLoginForm extends JFrame implements ActionListener
{
    JButton b1=new JButton("submit");
    JLabel username=new JLabel("Username");
    JLabel password=new JLabel("Password");
    JTextField userfield=new JTextField();
    JTextField passwordfield=new JTextField();
    Container c;
    DemoLoginForm()
    {
     c=this.getContentPane();
     c.setLayout(null);
     c.setBackground(Color.yellow);
     c.add(username);
     c.add(userfield);
     c.add(password);
     c.add(passwordfield);
     c.add(b1);
     
     username.setBounds(100, 50, 100, 40);
     password.setBounds(100, 150, 100, 40);
     userfield.setBounds(200, 50, 200, 40);
     passwordfield.setBounds(200, 150, 200, 40);
     b1.setBounds(150, 300, 150, 40);
     
    Font font=new Font("Arial", Font.ITALIC, 18);
    username.setFont(font);
    password.setFont(font);
    userfield.setFont(font);
    passwordfield.setFont(font);
    
    b1.addActionListener(this);
            
     
     
    }
  

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1)
        {
            String user=username.getText();
            String pass=password.getText();
            if(user.equals("satish") && pass.equals("satish321"))
            {
                c.setBackground(Color.green);
            }
            else
            {
                c.setBackground(Color.red);
            }
        }
    }
}
public class LoginForm {
    public static void main(String[] args)
    {
        DemoLoginForm f=new DemoLoginForm();
        f.setVisible(true);
        f.setBounds(100, 50, 600, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
    
}
