import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ProgramE extends JFrame implements ActionListener{
    private JTextField number;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton exitBtn;
    private String digits; //running string of the digits typed by the buttons

    //additional buttons for addition and substraction
    private JButton addButton;
    private JButton subButton;

    public ProgramE(){
        setTitle("Typing numbers");
        setSize(500,200);

        digits = ""; // start with no digits in the JTextField
        //set up buttons
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        exitBtn = new JButton("exit");
        addButton = new JButton("+");
        subButton = new JButton("-");

        number = new JTextField(digits);

        Container pane = this.getContentPane();
        pane.setLayout(new GridLayout(3,2));
        pane.add(button1);
        pane.add(button2);
        pane.add(button3);
        pane.add(addButton);
        pane.add(subButton);
        pane.add(number);
        pane.add(exitBtn);

        //add action listeners for the three buttons
        button1.addActionListener(this); // when button is clicked the action performed method is invoked
        button2.addActionListener(this);
        button3.addActionListener(this);
        exitBtn.addActionListener(this);
        addButton.addActionListener(this);
        subButton.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getActionCommand().equals("1")){ //pressed 1 button
            digits += "1";
        }
        if(e.getActionCommand().equals("2")){ //pressed 1 button
            digits += "2";
        }
        if(e.getActionCommand().equals("3")){ //pressed 1 button
            digits += "3";
        }
        if(e.getActionCommand().equals("+")){
            int temp = Integer.parseInt(digits);
            temp++;
            digits = Integer.toString(temp);
        }
        if(e.getActionCommand().equals("-")){
            int temp = Integer.parseInt(digits);
            temp--;
            digits = Integer.toString(temp);
        }
        if(e.getActionCommand().equals("exit")){ //pressed 1 button
            System.exit(0);
        }
        number.setText(digits);
    }
    public static void main(String[] args){
        ProgramE e = new ProgramE();
    }

    
    
}
