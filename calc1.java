import java.awt.*;
import javax.swing.*;

class calc1 extends JFrame
{
 calc1()
  {

JFrame frame;
frame=new JFrame("Calc-1");
frame.setLayout(new GridLayout(3,5));

TextArea t = new TextArea();
frame.add(t);

for(int i=0;i<=9;i++)
{
	JButton b = new JButton(String.valueOf(i));
	frame.add(b);
}
JButton b1 = new JButton("+");
JButton b2 = new JButton("-");
JButton b3 = new JButton("*");
JButton b4 = new JButton("/");

frame.add(b1);
frame.add(b2);
frame.add(b3);
frame.add(b4);

frame.setSize(1000,700);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
 public static void main (String args[])
   {
  calc1 c=new calc1();
   }
}