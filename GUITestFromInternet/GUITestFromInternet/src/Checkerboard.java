import java.awt.*;
import javax.swing.*;
import java.awt.Color;

public class Checkerboard extends JFrame
{
   private final int ROWS = 8;
   private final int COLS = 8;
   private final int GAP = 2;
   private final int NUM = ROWS * COLS;
   
   //private int x;
   
   private JPanel pane = new JPanel (new GridLayout(ROWS, COLS));
   private JPanel[] panel = new JPanel[NUM];
   private Color color1 = Color.WHITE;
   private Color color2 = Color.BLACK;
   private Color tempColor;
   
   public Checkerboard()
   {
      super("Checkerboard");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      add(pane);
      for(int x = 0; x < NUM; ++x)
      {
         panel[x] = new JPanel();
         pane.add(panel[x]);
         if(x % COLS == 0)
         {
            tempColor = color1;
            color1 = color2;
            color2 = tempColor;
         }
         
         if(x % 2 == 0)
            panel[x].setBackground(color1);
         else
            panel[x].setBackground(color2);
      }
   }
   
   public static void main(String[] args)
   {
      Checkerboard frame = new Checkerboard();
      frame.setSize(300, 300);
      frame.setVisible(true);
   }
}