import java.awt.*;
import java.awt.event.*;

class BorderLayout1 extends Frame
{
  BorderLayout1()
  {
   addWindowListener(new WindowAdapter()
	{
	 public void windowClosing(WindowEvent e)
	  {System.exit(0);}
	});


Frame f=new Frame("Border Layout-1");
Button B1= new Button("NORTH");
Button B2= new Button("SOUTH");
Button B3= new Button("EAST");
Button B4= new Button("WEST");
Button B5= new Button("CENTER");

f.add(B1, BorderLayout.NORTH);
f.add(B2, BorderLayout.SOUTH);
f.add(B3, BorderLayout.EAST);
f.add(B4, BorderLayout.WEST);
f.add(B5, BorderLayout.CENTER);

f.setSize(500,500);
f.setVisible(true);

}
 public static void main (String args[])
   {
  BorderLayout1 frame=new BorderLayout1();
   }
}