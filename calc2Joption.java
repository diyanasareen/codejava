import java.awt.*;
import javax.swing.*;

class calc2Joption extends JFrame
{
 calc2Joption()
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

b1.addActionListener(event ->{
JOptionPane.showMessageDialog(null,"You Clicked +");
});

JButton b2 = new JButton("-");
b2.addActionListener(event ->{
JOptionPane.showMessageDialog(null,"You Clicked -");
});

JButton b3 = new JButton("*");
b3.addActionListener(event ->{
JOptionPane.showMessageDialog(null,"You Clicked *");
});

JButton b4 = new JButton("/");
b4.addActionListener(event ->{
JOptionPane.showMessageDialog(null,"You Clicked /");
});

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
  calc2Joption c=new calc2Joption();
   }
}