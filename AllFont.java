import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AllFont extends Frame{
   

String msg = "F";
String FontList[];

public AllFont()
{
  addWindowListener(
  new WindowAdapter(){
  public void windowClosing(WindowEvent we){
  System.exit(0);}
});

GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
FontList = ge.getAvailableFontFamilyNames();
for(int i = 0; i < FontList.length; i++)
msg += FontList[i] + "  ";
}

public void paint(Graphics g) {
g.drawString(msg,60,200);
}

public static void main(String args[])
   {
    AllFont F1=new AllFont();
    F1.setSize(800,500);
    F1.setVisible(true);
    }
}
