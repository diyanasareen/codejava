
import java.awt.*;
import java.awt.event.*;

class Menu1 extends Frame
{
  Menu1()
   {
    addWindowListener(new WindowAdapter()
	{
	 public void windowClosing(WindowEvent e)
	  {System.exit(0);}
	});

Frame frame=new Frame("Menu Bar-1");

MenuBar m=new MenuBar();
Menu menu = new Menu("Menu");
Menu f=new Menu("File");
Menu e=new Menu("Edit");

MenuItem m1=new MenuItem("Open");
MenuItem m2=new MenuItem("New");
MenuItem m3=new MenuItem("Save");
MenuItem m4=new MenuItem("Save As");
MenuItem m5=new MenuItem("Exit");

MenuItem m6=new MenuItem("Cut");
MenuItem m7=new MenuItem("Copy");
MenuItem m8=new MenuItem("Paste");

f.add(m1);
f.add(m2);
f.add(m3);
f.add(m4);
f.add(m5);

e.add(m6);
e.add(m7);
e.add(m8);

frame.setMenuBar(m);
m.add(f);
m.add(e);


frame.setSize(500,500);
frame.setVisible(true);
frame.setLayout(null);

}
 public static void main (String args[])
   {
  Menu1 frame=new Menu1();
   }
}