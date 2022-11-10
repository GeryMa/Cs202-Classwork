import javax.swing.*;
import java.awt.*;
public class GUILabels extends JFrame{
    public GUILabels(){
        setTitle("JLabels");
        setSize(300,300);
        
        //the words we will arrange on the pane
        JLabel a = new JLabel("Hello");
        JLabel b = new JLabel("World");
        JLabel c = new JLabel("Whats");
        JLabel d = new JLabel("Up");
        
        JPanel panel1 = new JPanel();
		panel1.setBackground(Color.ORANGE);
        a.setAlignmentX(20);
        Container pane = this.getContentPane();//where we will place the labels
        pane.setLayout(new FlowLayout());
        pane.add(a);
        pane.add(b);
        pane.add(c);
        pane.add(d);
        pane.add(panel1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        //GUILabels GUIWindow = new GUILabels();
    }
}
