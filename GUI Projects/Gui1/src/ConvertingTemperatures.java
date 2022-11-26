//Gary Magill
//Converting temperatures project
//i didn't want to make an exact copy of our in class program, so i made this one a little different
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class ConvertingTemperatures extends JFrame implements ActionListener {
    //declare all the variables i'll need
    //i don't normally do this but it wasn't too bad
    private JButton calcBtn;
    private JLabel header;
    private JLabel FLabel;
    private JLabel CLabel;
    private JFormattedTextField FTextField;
    private JFormattedTextField CTextField;
    private JButton switchBtn;
    private JButton exitBtn;
    private int fOrC = 1;
    public ConvertingTemperatures(){
        //standard gui things
        GridBagConstraints c = null;
        setLayout(new GridBagLayout());
        c = new GridBagConstraints();
        setTitle("F to C");
        setSize(400,400);
        setResizable(false);

        //instantiate values of all the elements of the gui
        header = new JLabel("Convert F to C or C to F");
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.insets = new Insets(10,10,10,10);
        add(header, c);

        FLabel = new JLabel("Enter Farenheit");
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.insets = new Insets(10,10,10,10);
        add(FLabel, c);

        CLabel = new JLabel("Enter Celcius");
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 1;
        c.insets = new Insets(10,10,10,10);
        add(CLabel, c);
        //had to reference back to previous files to figure this out
        FTextField = new JFormattedTextField(NumberFormat.getNumberInstance());
        FTextField.setEditable(true);
        FTextField.setColumns(9);
        c.gridx = 0;
        c.gridy = 2;
        c.gridheight = 1;
        c.insets = new Insets(10,10,10,10);
        add(FTextField, c);

        CTextField = new JFormattedTextField(NumberFormat.getNumberInstance());
        CTextField.setEditable(false);
        CTextField.setColumns(9);
        c.gridx = 1;
        c.gridy = 2;
        c.gridheight = 1;
        c.insets = new Insets(10,10,10,10);
        add(CTextField, c);
        //this button lets the user switch from entering the F to entering C and vice versa
        switchBtn = new JButton("Switch");
        c.gridx = 0;
        c.gridy = 3;
        c.gridheight = 1;
        c.gridwidth = 1;
        add(switchBtn, c);
        //calculates the temp
        calcBtn = new JButton("Calculate");
        c.gridx = 1;
        c.gridy = 3;
        c.gridheight = 1; 
        c.gridwidth = 1;
        add(calcBtn, c);
        //exits the program
        exitBtn = new JButton("Exit");
        c.gridx = 0;
        c.gridy = 4;
        c.gridheight = 1;
        c.gridwidth = 3;
        add(exitBtn, c);
        //adds action listeners to the buttons
        //the fields don't get listeners because i am lazy
        calcBtn.addActionListener(this);
        switchBtn.addActionListener(this);
        exitBtn.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Switch")){
            //checks which field is active and then switches which field is active to type in. prevents users from entering both
            //f and c
            if(fOrC == 1){
                fOrC = 2;
                FTextField.setEditable(false);
                CTextField.setEditable(true);
                FTextField.setText("0");
                CTextField.setText("0");
            }else if(fOrC == 2){
                fOrC = 1;
                FTextField.setEditable(true);
                CTextField.setEditable(false);
                FTextField.setText("0");
                CTextField.setText("0");
            }
        }
        if(e.getActionCommand().equals("Calculate")){
            if(fOrC == 1){
                double temp;
                double celcius;
                try { //tries to convert string to double will throw exception of a non double character is there
                    temp = ((Number)FTextField.getValue()).doubleValue();
                    celcius = (temp - 32)* .5556;
                    CTextField.setText(Double.toString(celcius));
                } catch (Exception x) { //catches the thrown exception and makes a message dialog 
                    JFrame frame = new JFrame("Main Window");
                    JOptionPane.showMessageDialog(frame, "enter a valid number");
                    //frame.add(test);
                }
                
            }else if(fOrC == 2){ //does the same thing just for the other field
                double temp2;
                double farenheit;
                try{
                    temp2 = ((Number)CTextField.getValue()).doubleValue();
                    farenheit = (temp2 * 1.8) + 32;
                    FTextField.setText(Double.toString(farenheit));
                } catch(Exception c){
                    JFrame frame = new JFrame("Main Window");
                    JOptionPane.showMessageDialog(frame, "Enter a valid number");
                }
            }
        }
        //exits the program
        if(e.getActionCommand().equals("Exit")){
            System.exit(1);
        }
        
    }
    public static void main(String[] args){
        ConvertingTemperatures t = new ConvertingTemperatures();
    }
}
