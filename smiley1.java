import java.awt.*;
import java.awt.event.*;
public class smiley1 extends Frame{
 
 public void paint(Graphics g) {
  
  g.setColor(Color.yellow);
  g.fillOval(320,200,300,300);
  
 
 
  g.setColor(Color.black);
  g.fillOval(400,280,20,30);     // Left Eye 
  g.fillOval(520,280,20,30);
   g.setColor(Color.white);
  g.fillOval(400,280,15,20);     // Left Eye 
  g.fillOval(520,280,15,20); 
  

  g.setColor(Color.black);
  int x[] = {95,85,106,95};
  int y[] = {85,104,104,85};
  g.drawPolygon(x, y, 4);                 // Nose
  
g.drawArc(411,340,130,90,180,180);  // Smile
        
  addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);}});
}


public static void main(String args[]){
smiley1 f=new smiley1();
f.setSize(1000,700);
f.setVisible(true);

}
}
 
