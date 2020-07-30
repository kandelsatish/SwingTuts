
package SwingTust;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class keyListnerFrame extends JFrame implements KeyListener
{
    Container c;
    JTextArea ta1,ta2;
    keyListnerFrame()
    {
        c=this.getContentPane();
        c.setLayout(null);
        ta1=new JTextArea();
        ta1.setBounds(50, 50, 300, 100);
        ta1.addKeyListener(this);
        
        ta2=new JTextArea();
        ta2.setBounds(50, 200, 300, 100);
        c.add(ta1);c.add(ta2);
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
       ta2.append("KeyTuped: "+ke.getKeyChar()+"\n");
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        ta2.append("keyPressed: "+ke.getKeyChar()+"\n");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
         ta2.append("keyPressed: "+ke.getKeyChar()+"\n");
    }
    
}

public class KeyListnerDemo {
    public static void main(String[] args)
    {
        keyListnerFrame f=new keyListnerFrame();
        f.setBounds(100, 100, 400, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
