import java.awt.*;
import java.awt.event.*;

class button1 extends Frame
{
 button1()
  {
    addWindowListener(new WindowAdapter()
	{
	 public void windowClosing(WindowEvent e)
	  {System.exit(0);}
	});

Button b;

Frame frame=new Frame("Button-1");
b=new Button("Click on me");

b.setBounds  (10,40,50,30);
add(b);


setSize(500,500);
setVisible(true);

}
 public static void main (String args[])
   {
  button1 frame=new button1();
   }
}