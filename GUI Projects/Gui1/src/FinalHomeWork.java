import java.awt.*;
import javax.swing.*;
import java.awt.Color;
public class FinalHomeWork extends JFrame{
    private final int ROWS = 8;
    private final int COLS = 8;
    private final int NUM = ROWS * COLS;

    private JPanel pane = new JPanel(new GridLayout(ROWS, COLS));
    private JPanel[] panel = new JPanel[NUM];
    private Color color1 = Color.WHITE;
    private Color color2 = Color.BLACK;
    private Color tempColor;

    public FinalHomeWork(){
        super("Checkerboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(pane);
        for(int i = 0; i < NUM; i++){
            panel[i] = new JPanel();
            pane.add(panel[i]);
            if(i % COLS == 0){
                tempColor = color1;
                color1 = color2;
                color2 = tempColor;
            }
            if(i % 2 == 0){
                panel[i].setBackground(color1);
            }else{
                panel[i].setBackground(color2);
            }
        }
    }
    public static void main(String[] args){
        FinalHomeWork frame = new FinalHomeWork();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
