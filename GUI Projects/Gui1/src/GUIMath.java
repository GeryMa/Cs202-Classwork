import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Scanner;
public class GUIMath extends JFrame{
    public static int num1;
    public static int num2;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("adding two integers");
        System.out.println("What is your first integer? ");
        num1 = input.nextInt();
        System.out.println("What is your second integer? ");
        num2 = input.nextInt();
        System.out.println("The answer will be displayed in a window");
        GUIMath window = new GUIMath();
        input.close();
    }
    public GUIMath(){
        setTitle("The Sum of " + Integer.toString(num1) + " and " + Integer.toString(num2));
        setSize(300, 200);

        //set up JLabels
        JLabel number1 = new JLabel(Integer.toString(num1) + "+");
        JLabel number2 = new JLabel(Integer.toString(num2) + "=");
        int sum = num1 + num2;
        JLabel answer = new JLabel(Integer.toString(sum));
        Container pane = this.getContentPane();
        pane.setLayout(new GridLayout(1,3));
        pane.add(number1);
        pane.add(number2);
        pane.add(answer);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}
