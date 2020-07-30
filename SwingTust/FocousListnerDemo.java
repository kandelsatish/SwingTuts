
package SwingTust;

import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class FocousListnerFrame extends JFrame implements FocusListener
{
    Container c;
    JTextArea ta;
    JTextField tf1;
    FocousListnerFrame()
    {
        c=this.getContentPane();
        c.setLayout(null);
        
        tf1=new JTextField();
        tf1.setBounds(50, 50, 200, 40);
        tf1.addFocusListener(this);
       
        
        ta=new JTextArea();
        ta.setBounds(50, 150, 300, 200);
        
        c.add(tf1);c.add(ta);
    }

    @Override
    public void focusGained(FocusEvent fe) {
     
     ta.append("textField Focoused\n");
    }

    @Override
    public void focusLost(FocusEvent fe) {
        ta.append("focousLost from teaxt Fiels\n");
    }
}

public class FocousListnerDemo {
    public static void main(String[] args)
    {
        FocousListnerFrame f=new FocousListnerFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 200, 500, 600);
    }
    
}
