import java.awt.*;
import java.awt.event.*;

class label1 extends Frame
{
 label1()
  {
    addWindowListener(new WindowAdapter()
	{
	 public void windowClosing(WindowEvent e)
	  {System.exit(0);}
	});

Label l1,l2,l3;

Frame frame=new Frame("Label-1");
l1=new Label("This is LABEL-1");
l2=new Label("This is LABEL-2");
l3=new Label("This is LABEL-3");

l1.setBounds  (10,40,160,30);
add(l1);
l2.setBounds  (10,90,160,30);
add(l2);
l3.setBounds  (10,,160,30);
add(l3);

setSize(500,500);
setVisible(true);

}
 public static void main (String args[])
   {
  label1 frame=new label1();
   }
}