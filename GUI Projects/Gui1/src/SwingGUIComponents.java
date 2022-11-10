import javax.swing.*;
import java.awt.*;
public class SwingGUIComponents {
    public static void main(String[] args){
        

    }
}
/*prompting the user in a text box
 * int randComp = (int)((Math.random() * 5) + 1);
        
        String guess = "0";
        while(Integer.parseInt(guess) < 1 || Integer.parseInt(guess) > 5){
            guess = JOptionPane.showInputDialog("Guess an integer between 1 and 5");   
        }
        int guessUser = Integer.parseInt(guess);
        if(randComp == guessUser){
            JOptionPane.showMessageDialog(null, "You got it");
        }else{
            JOptionPane.showMessageDialog(null, "unfortuanaly, no " + Integer.toString(randComp));
        }
 */
/* uses JTextField
 int foot;
        JFrame topFrame = null;
        JTextField outputField = null; //display our output

        foot = 12; // 12 inches ina foot

        //create a text field
        outputField = new JTextField();
        //display program output using the textfield
        outputField.setText("5 feet is " + (foot * 5) + " Inches");

        //prevent the user from editting the output text
        //toggel this from false to ture
        outputField.setEditable(true);

        //create the window
        topFrame = new JFrame("feet to inches");
        //add text field to the window
        topFrame.add(outputField);
        //resize to fit components
        topFrame.pack();
        //set program to terminate when the window is closed
        topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        topFrame.setVisible(true);
 */