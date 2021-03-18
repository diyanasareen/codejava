
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyN extends JFrame implements KeyListener, ActionListener {
  JTextArea ta;
  JTextField tf;
  String newline = System.getProperty("line.separator");

 
  void addComponentsToPane() {

    JButton button = new JButton("Clear");
    button.addActionListener(this);
	getContentPane().add(button, BorderLayout.PAGE_END);
	

    tf = new JTextField(20);
    tf.addKeyListener(this);
	getContentPane().add(tf, BorderLayout.PAGE_START);

    ta = new JTextArea();
    
    JScrollPane scrollPane = new JScrollPane(ta);
    scrollPane.setPreferredSize(new Dimension(375, 125));
    getContentPane().add(scrollPane, BorderLayout.CENTER);
   
  }
  
  public void keyTyped(KeyEvent e) {
    d(e, "KEY TYPED: ");
  }
  
  public void keyPressed(KeyEvent e) {
    d(e, "KEY PRESSED: ");
  }

  public void keyReleased(KeyEvent e) {
    d(e, "KEY RELEASED: ");
  }
  
  public void actionPerformed(ActionEvent e) {
    ta.setText("");
    tf.setText("");
  }


  void d(KeyEvent e, String Status) {

    int id = e.getID();
    String str;
    if (id == KeyEvent.KEY_TYPED) {
      char c = e.getKeyChar();
      str = "key character = '" + c + "'";
    } else {
      int keyCode = e.getKeyCode();
      str = "key code = " + keyCode + " (" + KeyEvent.getKeyText(keyCode)
          + ")";
    }
     String s=" ";
	  if (e.getKeyCode() >=65 && e.getKeyCode() <=87) {
            s += "Alphabet Key";
        } else if (e.getKeyCode()>=96 && e.getKeyCode()<=105) {
            s += "Numeric Key";
		} else if (e.getKeyCode()>=112 && e.getKeyCode()<=123) {
            s += "Function Key";
        } else if (e.getKeyCode()>=37 && e.getKeyCode()<=40) {
            s += "Direction Key";
		} else if (e.getKeyCode()== 32) {
            s += "Space Key";
		}

    ta.append(Status + newline + "    " + str + newline +" Key NAME: "+s);
   
  }
   public static void main(String[] args) {
	   
    KeyN frame = new KeyN();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.addComponentsToPane();

    
    frame.pack();
    frame.setVisible(true);
  }
}