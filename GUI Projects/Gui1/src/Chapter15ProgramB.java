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
import java.text.NumberFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class Chapter15ProgramB extends JFrame implements ActionListener{
    private JButton calcButton;
    private JLabel weightLabel;
    private JLabel kgLabel;
    private JLabel stoneLabel;
    private JTextField kgField;
    private JTextField stoneField;
    private JFormattedTextField weightField; //holds weight input

    public Chapter15ProgramB(){
        GridBagConstraints layoutConst = null;
        
        setTitle("Weight conversion");
        setSize(400,400);
        setResizable(false);

        //create labels
        weightLabel = new JLabel("weight in lbs");
        kgLabel = new JLabel("weight in kgs");
        stoneLabel = new JLabel("weight in stones");

        //create button and add actionlistener
        calcButton = new JButton("Calculate");
        calcButton.addActionListener(this);

        //create a kg field
        kgField = new JTextField(15);
        kgField.setEditable(false);
        
        stoneField = new JTextField(15);
        stoneField.setEditable(false);

        // create and set up an input field for numbers not text
        weightField = new JFormattedTextField(NumberFormat.getNumberInstance());
        weightField.setEditable(true);
        weightField.setText("0");
        weightField.setColumns(15);

        setLayout(new GridBagLayout());
        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 0;
        layoutConst.gridy = 0;
        layoutConst.insets = new Insets(10,10,10,10);
        add(weightLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 0;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(10,10,10,10);
        add(weightField, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 1;
        layoutConst.gridy = 0;
        layoutConst.insets = new Insets(10,10,10,10);
        add(kgLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 1;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(10,10,10,10);
        add(kgField, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 2;
        layoutConst.gridy = 0;
        layoutConst.insets = new Insets(10,10,10,10);
        add(stoneLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 2;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(10,10,10,10);
        add(stoneField, layoutConst);

        layoutConst.gridx = 3;
        layoutConst.gridy = 0;
        layoutConst.insets = new Insets(10,10,10,10);
        add(calcButton, layoutConst);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double toLbs;
        double toKG;
        double toStones;
        
        //get value from weight field
        toLbs = ((Number)weightField.getValue()).doubleValue();

        //check to see if weight is posiitive
        if(toLbs >= 0.0){
            toKG = toLbs * .453592;
            toStones = toLbs * .0714286;

            kgField.setText(Double.toString(toKG));
            stoneField.setText(Double.toString(toStones));

        }
        else{
            JOptionPane.showMessageDialog(this, "Enter a positive weight");
        }
    }
    public static void main(String[] args){
        Chapter15ProgramB x = new Chapter15ProgramB();
    }
}
