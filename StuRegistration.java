import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class StuRegistration extends JFrame
{
 StuRegistration()
   {
     addWindowListener(new WindowAdapter()
	 {
	   public void windowClosing(WindowEvent e)
	   {System.exit(0);}
	 });

Label l1,l2,l3,l4,l5,l6,l7,l8;

JFrame f=new JFrame("Application");
f.setSize(300,500);

JPanel P=new JPanel();

l1=new Label("First name:");
JTextField t1=new JTextField(15);
P.add(l1);
P.add(t1);

l2=new Label("Last name:");
JTextField t2=new JTextField(15);
P.add(l2);
P.add(t2);

      l3=new Label("branch");
	  Choice c=new Choice();  
       
	    c.setBounds(150,150, 90,90);  
        c.add("Information Technology");  
        c.add("Computer Science");   
        P.add(l3);
        P.add(c); 
		
l4=new Label("Address:");
JTextField t4=new JTextField(40);
P.add(l4);
P.add(t4);

l5=new Label("Phone No.:");
JFormattedTextField Jf=new JFormattedTextField(11);
P.add(l5);
P.add(Jf);

l6=new Label("State:");
JTextField t6=new JTextField(15);
P.add(l6);
P.add(t6);

l7=new Label("City");
JTextField t7=new JTextField(15);
P.add(l7);
P.add(t7);

l8=new Label("Nationality:");
Checkbox c1=new Checkbox("Indian",false);
Checkbox c2=new Checkbox("NRI",false);
Checkbox c3=new Checkbox("Others",false);
P.add(l8);
c1.setBounds  (20,50,160,30);
P.add(c1);
c2.setBounds (20,70,160,30);
P.add(c2);
c3.setBounds (20,90,160,30);
P.add(c3);

Button b=new Button("Submit");
b.setBounds(10,40,50,30);
f.add(b);

P.setLayout(new GridLayout(5,2));

f.setContentPane(P);
f.setVisible(true);
f.pack();



}
 public static void main (String args[])
   {
  StuRegistration s=new StuRegistration();
   }
}
