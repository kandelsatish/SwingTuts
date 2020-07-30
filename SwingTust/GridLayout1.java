
package SwingTust;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class GridLayoutDemo extends JFrame
{
    Container c;
    JButton b1,b2,b3,b4,b5,b6;
    GridLayoutDemo()
    {
        c=this.getContentPane();
        GridLayout g=new GridLayout(2,3,10,10); //first int is row, second column,third is Hgap and last is Vgap.
        c.setLayout(g);
        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        b4=new JButton("Button4");
        b5=new JButton("Button5");
        b6=new JButton("Button6");
        
        c.add(b1);c.add(b2);
        c.add(b3,0);//this is indexing
        c.add(b4);c.add(b5);c.add(b6);
    }
}

public class GridLayout1 {
    public static void main(String[] args)
    {
        GridLayoutDemo gl=new GridLayoutDemo();
        gl.setVisible(true);
        gl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gl.setBounds(100, 100, 500, 400);
    }
}
