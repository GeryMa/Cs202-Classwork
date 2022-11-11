import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
public class HomeworkColorPanel extends JComponent {
   @Override
   public void paintComponent(Graphics g) {
        int r1 = 0;
        int r2 = 255;
        int tempR;
        Graphics2D graphicsObj = (Graphics2D)g;
        //the max on the for loop makes it only run 8 times. if i set it to the window size it printed 10 squares 
        for(int y1 = 0; y1 <= 510; y1 += 70){ // this makes the squares go to the next row goes up by 70 because the squares are 70x70
            for(int x1 = 0; x1 <=510; x1 += 140){ // this sets the x cord for the first color and following colors in the row increments by 140 because i manually add 70 to the other color
                    //this prints the black square
                    Rectangle filledRec = new Rectangle(x1, y1, 70,70); 
                    Color fillColor = new Color(r1, r1, r1);   //RGB Color  
                    graphicsObj.setColor(fillColor);
                    graphicsObj.fill(filledRec);
                    //prints the white square
                    Rectangle filledRec2 = new Rectangle(x1 + 70, y1, 70,70); 
                    Color fillColor2 = new Color(r2, r2, r2);   //RGB Color  
                    graphicsObj.setColor(fillColor2);
                    graphicsObj.fill(filledRec2);
            }
            //switches the colors every row
            tempR = r1;
            r1 = r2;
            r2 = tempR;
        }
    }
}
