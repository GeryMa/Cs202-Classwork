import javax.swing.*;
import java.awt.*;

public class GUITest{
	
	public static void main (String[] args) {
		JFrame theGUI = new JFrame();
		theGUI.setTitle("Four Colors");
		theGUI.setSize(300,300);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = theGUI.getContentPane();
		pane.setLayout(new GridLayout(2,2));

		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.ORANGE);

		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.BLACK);

		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.GREEN);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.WHITE);

		theGUI.add(panel1);
		theGUI.add(panel2);
		//theGUI.add(panel3);
		theGUI.add(panel4);

		theGUI.setVisible(true);
	}
}
