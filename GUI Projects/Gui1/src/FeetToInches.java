import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FeetToInches extends JFrame{
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;

    private JLabel footTallL, inchTallL, totalHeightL;
    private JTextField footTallF, inchTallF, totalHeightF;
    private JButton calculateB, exitB;

    //button handelers
    private CalculateButtonHandler cbHandler;
    private ExitButtonHandler ebHandler;

    public FeetToInches(){
        footTallL = new JLabel("Enter the whole-number of feet: ", SwingConstants.RIGHT);
        inchTallL = new JLabel("Enter the excess inches: ", SwingConstants.RIGHT);
        totalHeightL = new JLabel("Total Height", SwingConstants.RIGHT);

        footTallF = new JTextField(10);
        inchTallF = new JTextField(10);
        totalHeightF = new JTextField(10);

        //specify handlers for each button and add action listeners to each button
        calculateB = new JButton("Calculate");
        cbHandler = new CalculateButtonHandler();
        calculateB.addActionListener(cbHandler);
        exitB = new JButton("Exit");
        ebHandler = new ExitButtonHandler();
        exitB.addActionListener(ebHandler);

        setTitle("Height of a person in inches");
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4,2));
        //add stuff to the pane in the order you want them to appear(left to right top to bottom)
        pane.add(footTallL);
        pane.add(footTallF);
        pane.add(inchTallL);
        pane.add(inchTallF);
        pane.add(totalHeightL);
        pane.add(totalHeightF);
        pane.add(calculateB);
        pane.add(exitB);

        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    private class CalculateButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double feet;
            double inches;
            double totalHeight;

            feet = Double.parseDouble(footTallF.getText());
            inches = Double.parseDouble(inchTallF.getText());
            totalHeight = feet * 12 + inches;

            totalHeightF.setText("" + totalHeight);
        }
    }
    private class ExitButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    public static void main(String[] args){
        FeetToInches obj = new FeetToInches();
    }
}
