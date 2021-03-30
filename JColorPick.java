import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JColorPick extends JFrame implements ActionListener{

JButton b;
Container c;
JColorPick()
   {
   c=getContentPane();
   c.setLayout(new FlowLayout()); 
	  
      b =new JButton("Choose color");  
	  c.add(b);
	  
	  b.addActionListener(this);
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	 
	public void actionPerformed(ActionEvent e)  
	{
	    Color selectedcolor = null;
        Color color = JColorChooser.showDialog(this,"Select the Color",selectedcolor)	;	
		if(color!=null)
		{
			selectedcolor=color;
		}
		c.setBackground(color);
	}	
	 
public static void main(String args[])  
{  
 JColorPick cp=new JColorPick();
 
 cp.setTitle("Color");
 cp.setSize(400,400);
 cp.setVisible(true);
}  
} 
