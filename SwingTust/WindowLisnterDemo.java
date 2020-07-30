
package SwingTust;

import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

class WindwoListnerFrame extends JFrame implements WindowListener
{
    Container c;
    WindwoListnerFrame()
    {
        c=this.getContentPane();
        c.setLayout(null);
        this.addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("windowOpened");
    }

    @Override
    public void windowClosing(WindowEvent we) {
      System.out.println("windowClosing");
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("windowClosed");
    }

    @Override
    public void windowIconified(WindowEvent we) {//this is performed when it is minimized
       System.out.println("windowIconified");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {//this is performed when it is expanded
        System.out.println("windowDeIconified");
    }

    @Override
    public void windowActivated(WindowEvent we) {
         System.out.println("windowActivated");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("windowDeActivated");
    }
}

public class WindowLisnterDemo {
    public static void main(String[] args)
    {
        WindwoListnerFrame f=new WindwoListnerFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 500, 600);
    }
    
}
