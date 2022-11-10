import javax.swing.*;
import java.awt.*;
public class Homework {
    public static void main (String[] args) {
		JFrame theGUI = new JFrame();
		theGUI.setTitle("GUI Program");
		theGUI.setSize(600,600);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HomeworkColorPanel drawings = new HomeworkColorPanel();
		Container pane = theGUI.getContentPane();
		theGUI.add(drawings);
		theGUI.setVisible(true);
	}
}
/*
import javax.swing.*;
import java.awt.*;
public class GUIWindow {
public static void main (String[] args) {
JFrame theGUI = new JFrame();
theGUI.setTitle("GUI Program");
theGUI.setSize(300,300);
theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ColorPanel drawings = new ColorPanel();
Container pane = theGUI.getContentPane();
theGUI.add(drawings);
theGUI.setVisible(true);
}
}
 */
