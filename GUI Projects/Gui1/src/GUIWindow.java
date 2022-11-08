import javax.swing.*;
import java.awt.*;

public class GUIWindow extends JFrame{
	//the inherited JFrame methods are called directly in this class
	public static void main (String[] args) {
		GUIWindow();
	}
	public GUIWindow() { //constructor acts as a method
		setTitle("GUI Program");
		setSize(500, 300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
