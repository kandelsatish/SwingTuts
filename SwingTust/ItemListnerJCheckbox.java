


/*
this listner is used for combobox, checkbox and menu.
*/

package SwingTust;

import java.awt.Container;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class ItemListnerCheckboxDemo extends JFrame implements ItemListener
{
    Container c;
    JCheckBox[] cb=new JCheckBox[5];//this is a array of a checkbox
    JTextArea ta;
    ItemListnerCheckboxDemo()
    {
        c=this.getContentPane();
        for(int i=0;i<5;i++)
        {
            c=this.getContentPane();
            c.setLayout(null);
            cb[i]=new JCheckBox("CheckBox"+(i+1));
            cb[i].setBounds(200,50+(50*i), 100, 40);
            cb[i].addItemListener(this);
            c.add(cb[i]);
        }
           ta=new JTextArea();
           ta.setBounds(50, 300, 400, 100);
           c.add(ta);
        
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
       ta.setText("");//this will set the text area into a blank space.
       for(int i=0;i<cb.length;i++)
       {
           if(cb[i].isSelected())
           {
               ta.setText(ta.getText()+cb[i].getText()+"\n");
           }
       }
    }
    
}
public class ItemListnerJCheckbox {
    public static void main(String[] args)
    {
        ItemListnerCheckboxDemo ilc=new ItemListnerCheckboxDemo();
        ilc.setBounds(100, 100, 500, 600);
        ilc.setVisible(true);
        ilc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
