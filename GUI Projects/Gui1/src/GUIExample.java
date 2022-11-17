import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIExample extends JFrame  {

	public GUIExample()  {	//constructor which acts like a "method"
		
		setTitle("JLabels on a Pane");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//the words we will arrange on a "pane"
		JLabel a = new JLabel("first");
		JLabel b = new JLabel("second");
		JLabel c = new JLabel("third");
		JLabel d = new JLabel("fourth");
		JLabel e = new JLabel("fifth");
		
		Container pane = this.getContentPane();   //where we will place the labels
		pane.setLayout(new GridLayout(4,4));   //sets up FlowLayout
		
		//add the JLabels
		pane.add(a);
		pane.add(b);
		pane.add(c);
		pane.add(d);
		pane.add(e);
		
		setVisible(true);

	}

	public static void main(String[] args)  {

		// Construct the JFrame object
		GUIExample window = new GUIExample();
	
	}
}
