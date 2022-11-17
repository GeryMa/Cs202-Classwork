import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class PaintingProgram extends JFrame implements MouseMotionListener, ActionListener {
    private int x = -10; //initial x loc of the mouse
    private int y = -10; //intial y loc of the mouse

    private int randColor = 0; // initial random value used for the color
    private int sizeOfPen = 1; // initial size of the drawing pen

    public PaintingProgram(){
        setSize(400,400);
        setTitle("Paint");

        //set up the layout for our drawing program
        JButton colorButton = new JButton("Change Color!");
        JButton changeSize = new JButton("Increase size!");

        Container c = this.getContentPane();
        c.setLayout(new GridLayout(11,1));
        c.add(colorButton);
        c.add(changeSize);

        //configure buttons
        colorButton.addActionListener(this);
        changeSize.addActionListener(this);

        //configure mouse
        c.addMouseMotionListener(this);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //generate a random intenger to be used for the color in the paint() method
        if(e.getActionCommand().equals("Change Color!")){
            randColor = (int)Math.random() * 5;
        }
        if(e.getActionCommand().equals("Increase size!"));{
            sizeOfPen++;
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        x = e.getX(); // gets mouse's x loc
        y = e.getY(); // gets mouse's y loc

        repaint();  //calls the paint method
    }
    public void paint(Graphics g){
        switch(randColor){
            case 1: {
                g.setColor(Color.BLUE);
                break;
            }
            case 2: {
                g.setColor(Color.GREEN);
                break;
            }
            case 3: {
                g.setColor(Color.YELLOW);
                break;
            }
            case 4: {
                g.setColor(Color.orange);
                break;
            }
            default: g.setColor(Color.BLACK);
        }
        g.fillOval(x- 10, y +10, sizeOfPen, sizeOfPen);
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        // nothing, when the mouse moves who cares
    }
    public static void main(String[] args){
        PaintingProgram p = new PaintingProgram();
    }
}
