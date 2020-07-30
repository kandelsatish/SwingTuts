
package SwingTust;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Combobox {
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("Combobox Demo");
        Container c=frame.getContentPane();
        c.setLayout(null);
        String[] city={"kathmandu","delhi","dhaka","bijing","tokiyo"};
        JComboBox cb=new JComboBox(city);
        cb.setBounds(50, 50, 200, 50);
        JLabel l=new JLabel("Index");
        l.setBounds(50, 100, 100, 50);
        JLabel l1=new JLabel("Item");
        l1.setBounds(170, 100, 100, 50);
        
        //add items to the combobox
        cb.addItem("Washington");
        cb.addItem("Helsinki");
        
        //cb.setSelectedIndex(2);
        //cb.setSelectedItem("dhaka");
        
        JButton b=new JButton("Okay");
        b.setBounds(270, 50, 200, 50);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               int selectedIndex=cb.getSelectedIndex();
               String selectedItem=(String)cb.getSelectedItem();
               l.setText(selectedIndex+"");
               l1.setText(selectedItem);
            }
        });
          
    
        
        c.add(cb);c.add(b);c.add(l);c.add(l1);
        c.revalidate();//this will refresh the frame.
        
        
        frame.setVisible(true);
        frame.setBounds(100, 100, 800, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
