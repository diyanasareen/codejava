import java.awt.*;
import java.awt.event.*;

class gridLayout1 extends Frame
  {
   gridLayout1()
    {
     addWindowListener(new WindowAdapter()
	 {
	  public void windowClosing(WindowEvent e)
	  {System.exit(0);}
	 });

Frame frame=new Frame("Grid Layout-1");
frame.setLayout(new GridLayout(3,5));

 for(int i=1;i<=15;i++)
 {
   Button B = new Button(String.valueOf(i));
   frame.add(B);
 }

frame.setSize(1000,700);
frame.setVisible(true);

}
 public static void main (String args[])
    {
      gridLayout1 frame=new gridLayout1();
    }
}