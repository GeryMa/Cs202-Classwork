/*import javax.swing.*;
import java.awt.*;
public class HomeworkColorPanel extends JPanel{
    public HomeworkColorPanel(Color backColor) {
		setBackground(backColor);
	}
    @Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.blue);
		g.drawRect(10, 5, 120, 20);

        Rectangle filledRec = new Rectangle(200, 100, 300, 50); 
        Color fillColor = new Color(100, 255, 0);   //RGB Color  
         graphicsObj.setColor(fillColor);
         graphicsObj.fill(filledRec);
	}
}*/
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
public class HomeworkColorPanel extends JComponent {
   @Override
   public void paintComponent(Graphics g) {
        int x = 0;
        int y = 0;
        for(int xCord = 0; xCord < 8; xCord++){
            for(int yCord = 0; yCord < 8; yCord++){
                Rectangle rec = new Rectangle(x, y, 75,75);
                if(){//check if for loop is on a black or white square
                
                }
                Color fillColor = new Color(0,0,0)
                y+= 75;
            }
            x+= 75;
        }
      // Cast to Graphics2D
      Graphics2D graphicsObj = (Graphics2D)g;   //casting to draw 2D objects
        //draw a filled rectangle
        Rectangle filledRec = new Rectangle(0, 0, 75, 75); 
        Color fillColor = new Color(0, 0, 0);   //RGB Color  
        graphicsObj.setColor(fillColor);
        graphicsObj.fill(filledRec);
    }
}
