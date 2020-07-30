
package SwingTust;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayoutDemo {
    public static void main(String[] args)
    {
        JFrame f=new JFrame("Null Demo");
        Container c=f.getContentPane();
        c.setLayout(null);
        JButton b1=new JButton("button2");
        b1.setBounds(30, 30, 80, 40);
        
        JButton b2=new JButton("button3");
        b1.setBounds(50, 80, 80, 40);
        
        JButton b3=new JButton("button3");
        b1.setBounds(60, 130, 80, 40);
        
        c.add(b1);c.add(b2);c.add(b3);
        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // f.setBounds(100, 100, 500, 600);
    }
}
