import javax.swing.*;
import java.awt.*;
public class GUICheckerboard extends JPanel{
    public GUICheckerboard(){
        //setTitle("Checkerboard");
        setSize(400,400);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        g.setColor(Color.blue);
        g.drawRect(0, 0, 20, 20);
        
    }
    /* 
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
		g.setColor(Color.blue);
		g.drawRect(10, 5, 120, 20);
		g.setColor(Color.red);
		Font font = new Font("TimesRoman", Font.BOLD, 14);
		g.setFont(font);
		g.drawString("Hello world!", 20, 20);

    }
    */
    public static void main(String[] args){
        //GUICheckerboard board = new GUICheckerboard();
        JFrame j = new JFrame();
        j.setTitle("Checkerboard");
        j.setSize(400,400);
        j.setVisible(true);
        //paintComponent();

    }
}
