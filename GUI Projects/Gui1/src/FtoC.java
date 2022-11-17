import javax.swing.*;
import java.awt.*;

public class FtoC extends JFrame{
    public static void main(String[] args){
        FtoC draw = new FtoC();
    }
    public FtoC(){
        JFrame frame = new JFrame("Traffic light");
        frame.setSize(200,400);

        JButton changeB = new JButton("Change");
        JLabel test = new JLabel("test");
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(1,1));
        pane.add(test);
        pane.add(changeB);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}