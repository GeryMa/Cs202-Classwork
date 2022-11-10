import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel{
	
	public ColorPanel(Color backColor) {
		setBackground(backColor);
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawLine(10,25,40,45);

		g.drawRect(10,25,40,30);

		int[]x = new int[3];
		int[]y = new int[3];
		int n;  // count of points
			
		x[0]=100; x[1]=150; x[2]=50;
		y[0]=100; y[1]=150; y[2]=150;
		n = 3;

		//create new Polygon object
		Polygon myTri = new Polygon(x, y, n);
			
		g.drawPolygon(myTri);

		g.setColor(Color.blue);
		g.drawRect(10, 5, 120, 20);
		g.setColor(Color.red);
		Font font = new Font("TimesRoman", Font.BOLD, 14);
		g.setFont(font);
		g.drawString("Hello world!", 20, 20);


	}
}
