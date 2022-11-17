import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
public class CheckerPieces extends JComponent{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        // Assume x, y, and diameter are instance variables.
        int count = 1;
        for(int cY1 = 0; cY1 < 210; cY1 += 70){
            if(count % 2 == 0 ){
                for(int cX2 = 70; cX2 <= 510; cX2 += 140){
                    g.setColor(Color.red);
                    g.fillOval(cX2 + 15, cY1 + 15, 40, 40);
                }
            }else{
                for(int cX1 = 0; cX1 <= 510; cX1 += 140){
                    g.setColor(Color.GREEN);
                    g.fillOval(cX1 + 15, cY1 + 15, 40, 40);
                }
            }
            count++;
        }
        int count2 = 2; 
        for(int cY1 = 370; cY1 < 550; cY1 += 70){
            if(count2 % 2 == 0 ){
                for(int cX2 = 70; cX2 <= 510; cX2 += 140){
                    g.setColor(Color.orange);
                    g.fillOval(cX2 + 15, cY1 - 5, 40, 40);
                }
            }else{
                for(int cX1 = 0; cX1 <= 510; cX1 += 140){
                    g.setColor(Color.cyan);
                    g.fillOval(cX1 + 15, cY1 - 5, 40, 40);
                }
            }
            count2++;
        }
        
     }
}

