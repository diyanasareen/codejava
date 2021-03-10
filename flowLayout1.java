import java.awt.*;
import java.awt.event.*;

class flowLayout1 extends Frame
  {
   flowLayout1()
    {
      addWindowListener(new WindowAdapter()
	  {
	   public void windowClosing(WindowEvent e)
	   {System.exit(0);}
	  });
	 
Label l1,l2,l3;

Frame frame=new Frame("Flow Layout-1");

 l1=new Label("This is LABEL-1");
 l2=new Label("This is LABEL-2");
 l3=new Label("This is LABEL-3");

 frame.add(l1);
 frame.add(l2);
 frame.add(l3);

frame.setLayout(new FlowLayout(FlowLayout.CENTER));
frame.setSize(500,500);
frame.setVisible(true);

}
 public static void main (String args[])
    {
      flowLayout1 frame=new flowLayout1();
    }
}