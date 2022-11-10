import javax.swing.*;
import java.awt.*;
public class GUICheckerboard extends JFrame{
    public GUICheckerboard(){
        setTitle("Checkerboard");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pane1 = new JPanel();
        JPanel pane2 = new JPanel();
        pane1.setBackground(Color.BLACK);
        pane2.setBackground(Color.WHITE);

        JPanel pane3 = new JPanel();
        JPanel pane4 = new JPanel();
        pane3.setBackground(Color.BLACK);
        pane4.setBackground(Color.WHITE);

        JPanel pane5 = new JPanel();
        JPanel pane6 = new JPanel();
        pane5.setBackground(Color.BLACK);
        pane6.setBackground(Color.WHITE);

        JPanel pane7 = new JPanel();
        JPanel pane8 = new JPanel();
        pane7.setBackground(Color.BLACK);
        pane8.setBackground(Color.WHITE);

        

        Container pane = this.getContentPane();//where we will place the labels
        pane.setLayout(new GridLayout(8,8));
        
        pane.add(pane1);
        pane.add(pane2);
        pane.add(pane3);
        pane.add(pane4);
        pane.add(pane5);
        pane.add(pane6);
        pane.add(pane7);
        pane.add(pane8);
        
        setVisible(true);
    }
    public static void main(String[] args){
        GUICheckerboard board = new GUICheckerboard();
    }
}
