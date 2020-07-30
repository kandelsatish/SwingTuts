
/*
by default the row in the flow layout is align to the center and we can align
to the left and righ according to our need.
*/
package SwingTust;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class FlowLayoutDemo {
     static Container c;
     static JButton b1=new JButton("Button1 this is very cool");
     static JButton b2=new JButton("Button2");
     static JButton b3=new JButton("Button3");
     static JButton b4=new JButton("Button4");
     static JButton b5=new JButton("Button5");
             
    public static void main(String[] args)
    {
        JFrame f=new JFrame("FLow Layout");
        c=f.getContentPane();
        //FlowLayout fl=new FlowLayout(FlowLayout.LEFT); //this is used to aligh row to the left 
        FlowLayout fl=new FlowLayout(FlowLayout.RIGHT,10,10);//to the right
        c.setLayout(fl);
        /*
        alternative method to set horizontal and verticval gap between the gaps
        fl.setHgap(10);//this is a horizontal gap
        fl.setVgap(10);//this is for a verttical gaps.
        */
        
        c.add(b1);c.add(b2);
        c.add(b3,0);//this is used for indexing...this will appear at the first of button group.
        c.add(b4);c.add(b5);
        
        f.setVisible(true);
        f.setBounds(100, 100, 500, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    
}
