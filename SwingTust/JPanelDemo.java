
package SwingTust;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class JPanleFrame extends JFrame
{
    Container c;
    JPanleFrame()
    {
        c=this.getContentPane();
        c.setLayout(null);
        JPanel p=new JPanel();
        p.setBounds(0, 0,400,800);
        p.setBackground(Color.yellow);
        JButton b=new JButton("hello");
        p.setLayout(null);
        b.setBounds(10, 20, 100, 30);
        
        JPanel p1=new JPanel();
        p1.setBackground(Color.red);
        p1.setBounds(0, 0, 100, 100);
        p.add(p1);
        p1.add(b);
        c.add(p);
    }
}

public class JPanelDemo {
    public static void main(String[] args)
    {
    JPanleFrame f=new JPanleFrame();
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setBounds(50, 50, 600, 800);
    }
    
}
