
package SwingTust;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;


public class BorderLayoutDemo {
    public static void main(String[] args)
    {
        JFrame f=new JFrame("BorderLayout Demo");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 500, 600);
        Container c=f.getContentPane();
        BorderLayout b=new BorderLayout(5,5);//this will make horizontal and vertical gap of 5-5 pixels.
        /*
        another method for horizontal and vertical gap:
        b.setHgap(5);
        b.setVgap(5);
        c.setLayout(b);
        */
        c.setLayout(b);
        
        JButton but1=new JButton("page_start");
        JButton but2=new JButton("page_end");
        JButton but3=new JButton("line_start");
        JButton but4=new JButton("Center");
        JButton but5=new JButton("line_end");
        
        c.add(but1,BorderLayout.PAGE_START);c.add(but2,BorderLayout.PAGE_END);
        c.add(but3,BorderLayout.LINE_START);c.add(but4,BorderLayout.CENTER);
        c.add(but5,BorderLayout.LINE_END);
        
        //note::if we and only one button without any constraint then by default it will take a center alignment.
        
        
    }
    
}
