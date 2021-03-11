import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class panel2 extends JFrame
{
 panel2()
  {
    addWindowListener(new WindowAdapter()
	{
	 public void windowClosing(WindowEvent e)
	  {System.exit(0);}
	});

Label l1,l2;

JFrame f=new JFrame("Application");
JPanel P=new JPanel();

l1=new Label("First name:");
JTextField t1=new JTextField(15);

l2=new Label("Last name:");
JTextField t2=new JTextField(15);

P.add(l1);
P.add(l2);
P.add(t1);
P.add(t2);

P.setLayout(new GridLayout(3,2,5,5));

f.setContentPane(P);
f.setSize(300,150);
f.setVisible(true);

}
 public static void main (String args[])
   {
  panel2 frame=new panel2();
   }
}