import javax.swing.*;
import java.awt.*;
//drawing things

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLight extends JFrame implements ActionListener{
    private final int WIDTH = 200;
    private final int HEIGHT = 400;
    final static boolean shouldWeightX = true;
    private int lastCount = 1;
    //public int timesCalled = 0;
    
    public static void main(String[] args){
        TrafficLight drawBoard = new TrafficLight();

    }
    public TrafficLight(){
        JFrame test1 = new JFrame();
        //general things to start the program with
        setSize(WIDTH,HEIGHT);
        setResizable(false);
        JButton changeB = new JButton("Change");
        //meat of the program
        Container pane = this.getContentPane();
        JButton button;
        //took this code from java's example of using GridBagLayout ripped modified it a little bit because java's example had 3 buttons
        //while this only needed 1. gridLayout wasn't working properly for some reason. so i had to learn this very confusing thing
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        button = new JButton("Change");
        if (shouldWeightX) {
        c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(button, c);

        //this makes a really tall panel that contains the initial traffic light drawing. it also forces the change button to the
        //top of the screen. otherwise it was in the middle **this was a pain in the ass to figure out through java's documentation**
        TrafficLightColorPanel test2 = new TrafficLightColorPanel();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 340;      //make this component tall
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(test2, c);

        button.addActionListener(this);
        //general things to end the constructor with
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    // this whole thing was such a pain in the ass to figure out. i'm still not sure why getGraphics() works. 
    //i imagine because when i instantiate the TrafficLightColorPanel object, getGraphics() no longer returns null 
    //and instead lets it be passed as an argument to the methods. this took me so long to figure out

    @Override 
    public void actionPerformed(ActionEvent e) {
        int timesCalled = lastCount;
        if(e.getActionCommand().equals("Change")){
            TrafficLightColorPanel test = new TrafficLightColorPanel();
            //switch statement because it looks cleaner than if else statements. i also just remembered switch exits so i wanted to use it
            switch(timesCalled){
                case 1: {
                    //the draw green call method paints a gren circle and 2 black circles
                    test.drawGreenCall(getGraphics());
                    break;
                    
                }
                case 2:{
                    //draws the yellow circle and 2 black circles
                    test.drawYellowCall(getGraphics());   
                    break;
                }
                case 3:{
                    //draws the red circle and 2 black circles
                    test.drawRedCall(getGraphics());
                    break;
                }
            }
            //can't update count directly here, because count gets reset to 0 at the top, i could probably find a workout to this
            //but i don't feel like changing this anymore
            lastCount++;
            if(lastCount > 3){
                lastCount = 1;
            }
            
        }
    }
    //i was trying to do this. but i can't pass a Graphics g object in this class. dunno why java is weird
    //also was using repaint wrong here not that it would've mattered
    //hate how Graphics is an abstract class cause making a Graphics object would be so nice
    /*public void paintComponent(Graphics g, int count1, int count2){
        
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
    //dunno wtf i was doing here
    public void repaint(Graphics g){
        Graphics2D graphicsObj = (Graphics2D)g;
        Rectangle body = new Rectangle(50,50, WIDTH, 350);
        Color fillColor = new Color(255,255,0);
        graphicsObj.setColor(fillColor);
        graphicsObj.fill(body);
    }
    public void paintRed(Graphics g){
        Graphics2D graphicsOb = (Graphics2D)g;
        g.setColor(Color.red);
        g.fillOval(110, 20, 40, 40);
        
        
        
    }
    //i think i gave up on this idea when i couldn't get paintRed to work
    public void paintYellow(){
        
    }
    public void paintGreen(){

    }
*/
}
