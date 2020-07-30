
package SwingTust;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class MoudeEvents extends JFrame implements MouseListener
{
    Container c;
    JTextArea ta1,ta2;
    MoudeEvents()
    {
        c=this.getContentPane();
        c.setLayout(null);
        
        ta1=new JTextArea();
        ta1.setBounds(50, 50, 300, 50);
        ta1.addMouseListener(this);
        
        ta2=new JTextArea();
        ta2.setBounds(50, 150, 300, 500);
        
        c.add(ta1);c.add(ta2);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        ta2.append("mouseClicked\n");
    }

    @Override
    public void mousePressed(MouseEvent me) {
             ta2.append("mouseClicked\n");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
            ta2.append("mouseReleased\n");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
             ta2.append("mouseEntered\n");
    }

    @Override
    public void mouseExited(MouseEvent me) {
             ta2.append("mouseExited\n");
    }
}
public class MouseEventsDemo {
    public static void main(String[] args)
    {
        MoudeEvents f=new MoudeEvents();
        f.setBounds(100, 100, 400, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
