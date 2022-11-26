//Gary Magill
//Traffic light program drawing class
import javax.swing.JComponent;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.*;
//drawing things
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;


public class TrafficLightColorPanel extends JComponent{
    private int WIDTH = 200;
    private int HEIGHT = 400;
    
    @Override
    public void paintComponent(Graphics g){
        drawLightBody(g);
        //ahh the simplicity

    }
    public void drawLightBody(Graphics g){
        Graphics2D graphicsObj = (Graphics2D)g;
        Rectangle body = new Rectangle(0,0, WIDTH, HEIGHT);
        Color fillColor = new Color(255,255,0);
        graphicsObj.setColor(fillColor);
        graphicsObj.fill(body);

        g.setColor(Color.red);
        g.fillOval(40, 10,100, 100);

        g.setColor(Color.black);
        g.fillOval(40, 120, 100, 100);

        g.setColor(Color.black);
        g.fillOval(40, 230, 100, 100);
        g.drawString("Red", 60, 70);
    }
    //i made three different methods for each cycle of the light because i couldn't figure out how to make it all in one method
    //cause i can't pass any other parameters to the paintComponent method dunno why
    //this was also my plan from the start because i think it makes it easier to code
    public void drawRedCall(Graphics g){
        //i was having a little funny thing happen where circles were overlapping. so i just made a new rectangle to cover up everything
        //i also don't know how to remove things from the screen.
        //the stacking of the graphics was originially a concern with the program slowing down. but after clicking it **a lot**
        //i didn't notice anything slowing down. so i just went with it
        Graphics2D graphicsObj = (Graphics2D)g;
        Rectangle body = new Rectangle(0,0, WIDTH, HEIGHT);
        Color fillColor = new Color(255,255,0);
        graphicsObj.setColor(fillColor);
        graphicsObj.fill(body);

        g.setColor(Color.red);
        g.fillOval(40 + 7, 10 + 54,100, 100);

        g.setColor(Color.black);
        g.fillOval(40 + 7, 120 + 54, 100, 100);

        g.setColor(Color.black);
        g.fillOval(40 + 7, 230 + 54, 100, 100);
        g.drawString("Red", 80, 100);
        repaint();
    }
    public void drawYellowCall(Graphics g){
        Graphics2D graphicsObj = (Graphics2D)g;
        Rectangle body = new Rectangle(0,0, WIDTH, HEIGHT);
        Color fillColor = new Color(255,255,0);
        graphicsObj.setColor(fillColor);
        graphicsObj.fill(body);

        g.setColor(Color.black);
        g.fillOval(40 + 7, 10 + 54,100, 100);

        g.setColor(Color.orange);
        g.fillOval(40 + 7, 120 + 54, 100, 100);

        g.setColor(Color.black);
        g.fillOval(40 + 7, 230 + 54, 100, 100);
        g.drawString("Yellow", 60, 210);
        repaint();
    }
    public void drawGreenCall(Graphics g){
        Graphics2D graphicsObj = (Graphics2D)g;
        Rectangle body = new Rectangle(0,0, WIDTH, HEIGHT);
        Color fillColor = new Color(255,255,0);
        graphicsObj.setColor(fillColor);
        graphicsObj.fill(body);

        g.setColor(Color.black);
        g.fillOval(40 + 7, 10 + 54,100, 100);

        g.setColor(Color.black);
        g.fillOval(40 + 7, 120 + 54, 100, 100);

        g.setColor(Color.green);
        g.fillOval(40 + 7, 230 + 54, 100, 100);
        g.setColor(Color.black);
        g.drawString("Green", 60, 330);
        repaint();
    }
}
/*
 public void paintComponent(Graphics g, int count1, int count2){
        
        switch (count1){
            case 1: {
                repaint();
                //paintRed(g);
            }
            case 2:{
                repaint();
                //paintYellow();
            }
            case 3:{
                repaint();
                //paintGreen();
            }
        }
    }
    //wanted to originally override the repaint so it would repaint the yellow rectangle and nothing else. didn't work. dunno why. gave up on it at some point
    //i was at this for a few hours the on 11/16 so idk when i gave up on this
    public void repaint(Graphics g){
        Graphics2D graphicsObj = (Graphics2D)g;
        Rectangle body = new Rectangle(50,50, WIDTH, 350);
        Color fillColor = new Color(255,255,0);
        graphicsObj.setColor(fillColor);
        graphicsObj.fill(body);
    }
    //no clue why i stopped this. it is the same code as what i had that works. so geniuenly don't know why it doesn't work
    public void paintRed(Graphics g){
        Graphics2D graphicsOb = (Graphics2D)g; //wtf does this line of code do. cause sometimes i can do it. sometimes it says i can't make a graphics object
        g.setColor(Color.red);
        g.fillOval(110, 20, 40, 40);
        
        
        
    }
    public void paintYellow(){
        
    }
    public void paintGreen(){

    }
 */
