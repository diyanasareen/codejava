import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Login1 extends JFrame
{
 Login1 ()
  {
    addWindowListener(new WindowAdapter()
	{
	 public void windowClosing(WindowEvent e)
	  {System.exit(0);}
	});

JLabel l1,l2;

JFrame f=new JFrame("Login");
JPanel P=new JPanel();

l1=new JLabel("Username:",JLabel.CENTER);
JTextField t1=new JTextField(15);

l2=new JLabel("Password:",JLabel.CENTER);
JPasswordField t2=new JPasswordField(15);

l1.setLabelFor(t1);
l2.setLabelFor(t2);

P.add(l1);
P.add(t1);
P.add(l2);
P.add(t2);

P.setLayout(new GridLayout(3,2,5,5));

f.setContentPane(P);
f.setSize(300,150);
f.setVisible(true);

}
 public static void main (String args[])
   {
  Login1  L=new Login1 ();
   }
}
