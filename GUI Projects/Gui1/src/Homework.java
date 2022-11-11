import javax.swing.*;
import java.awt.*;
public class Homework {
    public static void main (String[] args) {
		//creates the frame and brings in the code from the other class
		JFrame theGUI = new JFrame();
		theGUI.setTitle("GUI Program");
		theGUI.setSize(570,590);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theGUI.setResizable(true); // can't resize because the program is based around the window size
		HomeworkColorPanel drawings = new HomeworkColorPanel();
		Container pane = theGUI.getContentPane();
		theGUI.add(drawings);
		theGUI.setVisible(true);
	}
}