import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Chapter15ProgramA extends JFrame implements ActionListener{
    private JLabel inchLabel;
    private JLabel centLabel;
    private JTextField inchField;
    private JTextField cenField;

    public Chapter15ProgramA(){
        GridBagConstraints layoutConst = null;
        
        setTitle("Inches to Centimeters conversion");
        setSize(400,400);
        setResizable(false);

        inchLabel = new JLabel("Inches?");
        centLabel = new JLabel("Centimeters: ");

        inchField = new JTextField(15);
        inchField.setEditable(true);
        inchField.setText("0");
        inchField.addActionListener(this);

        cenField = new JTextField(15);
        cenField.setEditable(false);

        //use a gridBagLayout
        setLayout(new GridBagLayout());
        layoutConst = new GridBagConstraints();

        //specify the components gird location

        layoutConst.gridx = 0;
        layoutConst.gridy = 0;

        //10 pixel padding
        layoutConst.insets = new Insets(10,10,10,10);

        //add components using specified constraints

        add(inchLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 1;
        layoutConst.gridy = 0;
        layoutConst.insets = new Insets(10,10,10,10);
        add(inchField, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 0;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(10,10,10,10);
        add(centLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 1;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(10,10,10,10);
        add(cenField, layoutConst);

        JButton calcBtn = new JButton("Calculate");
        calcBtn.addActionListener(this);
        layoutConst.gridx = 0;
        layoutConst.gridy = 2;
        layoutConst.insets = new Insets(10,10,10,10);
        layoutConst.gridwidth = 2;
        add(calcBtn, layoutConst);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String userInput;
        double inchInput;

        //get user's inches input
        userInput = inchField.getText();

        //convert string to double
        inchInput = Double.parseDouble(userInput);

        //display the calculated conversion of inches to centimeters
        cenField.setText(Double.toString(inchInput * 2.54));
    }
    public static void main(String[] args){
        Chapter15ProgramA test = new Chapter15ProgramA();
    }
}
