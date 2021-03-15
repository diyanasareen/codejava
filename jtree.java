import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode; 

class jtree extends JFrame
{
jtree()
  {

JFrame frame;
frame=new JFrame("J-TREE 1");

DefaultMutableTreeNode t = new DefaultMutableTreeNode("Documents");
DefaultMutableTreeNode t1 = new DefaultMutableTreeNode("Sub-Documents-1");
DefaultMutableTreeNode t2 = new DefaultMutableTreeNode("Sub-Documents-2");

t.add(t1);
t.add(t2);

JTree JT = new JTree(t);


frame.add(JT);
frame.setContentPane(JT);
frame.setSize(1000,700);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
 public static void main (String args[])
   {
  jtree jt=new jtree();
   }
}