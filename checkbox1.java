import java.awt.*;
import java.awt.event.*;

class checkbox1 extends Frame
{
 checkbox1()
  {
    addWindowListener(new WindowAdapter()
	{
	 public void windowClosing(WindowEvent e)
	  {System.exit(0);}
	});

Checkbox c1,c2,c3;

Frame frame=new Frame("Checkbox1");
c1=new Checkbox("Java",false);
c2=new Checkbox("Python",false);
c3=new Checkbox("C++",false);

c1.setBounds  (20,50,160,30);
add(c1);
c2.setBounds (20,90,160,30);
add(c2);
c3.setBounds (20,130,160,30);
add(c3);

setSize(500,500);
setVisible(true);

}
 public static void main (String args[])
   {
  checkbox1 frame=new checkbox1();
   }
}






