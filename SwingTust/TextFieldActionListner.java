
package SwingTust;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

class TextField extends JFrame implements ActionListener
{
    Container c;
    JTextField tf;
    TextField()
    {
        c=this.getContentPane();
        c.setLayout(null);
        tf=new JTextField();
        tf.setBounds(20, 50, 100,100 );
        tf.addActionListener(this);
        
        c.add(tf);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String text=tf.getText();
        tf.setText(text.toUpperCase());
    }
   
}
public class TextFieldActionListner {
    public static void main(String[] args)
    {
        TextField t=new TextField();
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setSize(400, 500);
    }
    
}
