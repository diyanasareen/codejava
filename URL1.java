import java.net.*;
public class URL1
{
  public static void main(String args[]){
	  try{
		  URL u = new URL("https://svvv.edu.in/institute/");
		  
		  System.out.println("Protocol Name: "+u.getProtocol());
		  System.out.println("File Name"+u.getFile());

	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}