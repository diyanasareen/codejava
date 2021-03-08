import java.awt.*;
import java.awt.event.*;
public class house extends Frame{

public void paint(Graphics g){
g.setColor(Color.green);
g.fillRect(0,280,800,280);

g.setColor(Color.orange);
g.fillRect(300,100,240,180);

g.setColor(Color.red);
g.fillRect(380,140,20,10);
g.fillRect(450,140,20,10);

g.fillRect(380,170,20,10);
g.fillRect(450,170,20,10);

g.setColor (Color.red);
int c [] = {300,430,540};
int d [] = {100,40,100};
g.fillPolygon (c, d, 3);


addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);}});
}


public static void main(String args[]){
house f=new house();
f.setSize(800,500);
f.setVisible(true);

}
}
