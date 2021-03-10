import java.awt.*;
import java.awt.event.*;
 
 class choice1 extends Frame
  {
   choice1()
    {
      addWindowListener(new WindowAdapter()
	  {
	   public void windowClosing(WindowEvent e)
	   {System.exit(0);}
	  });
	  
      Frame frame=new Frame("Choice-1");  
      Choice c=new Choice();  
       
	    c.setBounds(150,150, 90,90);  
        c.add("Java");  
        c.add("C++");  
        c.add("Python");  
        c.add("PHP");  
        c.add(".Net"); 
		
        frame.add(c);  
        frame.setSize(400,400);  
        frame.setLayout(null);  
        frame.setVisible(true);  
     }  
public static void main(String args[])  
{  
 choice1 frame=new choice1();
}  
} 