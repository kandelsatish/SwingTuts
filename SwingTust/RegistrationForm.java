
package SwingTust;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class RegistrationForm {
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("Registaration From");
        Container c=frame.getContentPane();
        c.setLayout(null);
        Font f=new Font("Arial", Font.ITALIC, 23);
       JLabel name=new JLabel("Name");
       name.setFont(f);
       name.setBounds(20,50 , 100, 40);
       
       JTextArea forName=new JTextArea();
       forName.setBounds(130, 50, 200, 40);
       forName.setFont(f);
       
       JLabel address=new JLabel("Address");
       address.setFont(f);
       address.setBounds(20,100 , 100, 40);
       
       //frame.revalidate();   this will refresh the frame .
       
       JTextArea forAddress=new JTextArea();
       forAddress.setBounds(130, 100, 200, 40);
       forAddress.setFont(f);
       
       JLabel email=new JLabel("Email");
       email.setFont(f);
       email.setBounds(20,150 , 100, 40);
       
       JTextArea forEmail=new JTextArea();
       forEmail.setBounds(130, 150, 200, 40);
       forEmail.setFont(f);
       
       JLabel gen=new JLabel("Gender");
       gen.setBounds(20, 200, 100, 40);
       gen.setFont(f);
       
       JRadioButton radio1=new JRadioButton("male");
       radio1.setBounds(20, 250, 100, 40);
       radio1.setFont(f);
       JRadioButton radio2=new JRadioButton("female");
       radio2.setBounds(120, 250, 100, 40);
       radio2.setFont(f);
       
        ButtonGroup gender=new ButtonGroup();
        gender.add(radio1);
        gender.add(radio2);
        
        JLabel dob=new JLabel("DOB");
        dob.setBounds(20, 300, 100, 40);
        dob.setFont(f);
        
        String[] day_arry=new String[31];
        for(int i=1;i<=31;i++)
        {
        day_arry[i-1]=Integer.toString(i);
        }
        JComboBox day=new JComboBox(day_arry);
        day.setBounds(130, 300, 50, 40);
        day.setFont(f);
        
       String[] months_arry={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AGU","SEP","OCT","NOV","DEC"};
       
        
        JComboBox months=new JComboBox(months_arry);
        months.setBounds(190, 300, 100, 40);
        months.setFont(f);
      
        String[] year_arry=new String[70];
        for(int i=1951;i<=2020;i++)
        {
        year_arry[i-1951]=Integer.toString(i);
        }
        
       JComboBox year=new JComboBox(year_arry);
        year.setBounds(300, 300, 100, 40);
        year.setFont(f);
        
        JButton sub=new JButton("submit");
        sub.setBounds(50, 380, 100, 40);
        sub.setFont(f);
        
        
        JTextArea details=new JTextArea();
        details.setBounds(20, 450, 500, 200);
        details.setFont(f);
        
         sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               String det=details.getText();
               String dob=(String)day.getSelectedItem()+"-"+(String)months.getSelectedItem()+"-"+(String)year.getSelectedItem();

               details.setText(det+forName.getText()+"\n"+forAddress.getText()+"\n"+forEmail.getText()+"\n"+dob);
            }
        });
        
        c.add(name);c.add(address);c.add(email);c.add(radio1);c.add(radio2);
        c.add(gen);c.add(dob);c.add(forName);c.add(forAddress);c.add(forEmail);
        c.add(day);c.add(months);c.add(year);c.add(sub);c.add(details);
        
        frame.setVisible(true);
        frame.setBounds(100, 100, 600, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
