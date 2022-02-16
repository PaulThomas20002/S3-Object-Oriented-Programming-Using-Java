/*Write a swing program that uses JFrame and JLabel the program uses a JFrame container to hold a instance of JLabel the label 
must displays a short text message "Swing is Powerful" ? */
import javax.swing.*;
class sample{
	sample(){
		JFrame f1 = new JFrame("Sample Applet");
		f1.setSize(150,75);
		f1.setVisible(true);
		JLabel l1 = new JLabel("Swing is Powerful");
		f1.add(l1);
	}
	public static void main(String []SafeVarargs){
		SwingUtilities.invokeLater(new Runnable(){public void run(){new sample();}});
	}
}
