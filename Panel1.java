import java.awt.*;
import java.awt.event.*;
 
 class Panel1 extends Frame
  {
   Panel1()
    {
      addWindowListener(new WindowAdapter()
	  {
	   public void windowClosing(WindowEvent e)
	   {System.exit(0);}
	  });
	  
	  Label l;
	  Panel P;
	  
      Frame frame=new Frame("Panel-1");  
      	
      P=new Panel();  
	  l=new Label("NAME:");
	  P.add(l);
	  P.setBackground(Color.cyan);
       frame.add(P);   
		
	    P.setBounds(30,30, 50,40);  
        
        frame.setSize(400,400);  
        frame.setLayout(null);  
        frame.setVisible(true);  
     }  
public static void main(String args[])  
{  
 Panel1 frame=new Panel1();
}  
} 