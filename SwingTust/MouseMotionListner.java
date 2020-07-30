
package SwingTust;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class MouseMotionListnerFrame extends JFrame implements MouseMotionListener
{
    Container c;
    JTextArea ta1,ta2;
    MouseMotionListnerFrame()
    {
        c=this.getContentPane();
        c.setLayout(null);
        ta1=new JTextArea();
        ta1.setBounds(50, 50, 300, 50);
        
         ta2=new JTextArea();
        ta2.setBounds(50, 200, 300, 50);
        
        ta1.setBackground(Color.yellow);
        ta1.setEditable(false);
        ta1.addMouseMotionListener(this);
        
        
        c.add(ta1);c.add(ta2);
    }

    @Override
    public void mouseDragged(MouseEvent me) {
     ta2.setText("the mouse Dragged at:"+me.getX()+" "+me.getY());
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        ta2.setText("the mouse moved at:"+me.getX()+" "+me.getY());
    }
    
}
public class MouseMotionListner {
    public static void main(String[] args)
    {
        MouseMotionListnerFrame f=new MouseMotionListnerFrame();
        f.setVisible(true);
        f.setBounds(100, 100, 500, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
