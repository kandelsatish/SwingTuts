

/*
this is used with jcombobox ,jcheckbox and menu
*/

package SwingTust;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

class ItemListnerComboboxDemo extends JFrame implements ItemListener
{
    Container c;
    JComboBox cb;
    ItemListnerComboboxDemo()
    {
     c=this.getContentPane();
     c.setLayout(null);
     
     Color[] col={Color.BLACK,Color.BLUE,Color.CYAN,Color.RED};
     cb=new JComboBox(col);
     cb.setBounds(50, 50, 200, 50);
     cb.addItemListener(this);
     
     c.add(cb);
     
     
     
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        Color colr=(Color)cb.getSelectedItem();
        c.setBackground(colr);
        
    }
    
}
public class ItemListnerCombobox {
    public static void main(String[] args)
    {
        ItemListnerComboboxDemo ilc=new ItemListnerComboboxDemo();
        ilc.setVisible(true);
        ilc.setBounds(100, 100, 400, 500);
        ilc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
