//Gary Magill
//week 10 project
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean test = true;
        while(test){
            System.out.println("enter name & age");
            String intake = input.nextLine();
            String arr[] = intake.split(" ", 2); //i didn't want to use two scanners so i took in the input as one string then split it twice
            try {
                int x = Integer.parseInt(arr[1]); //this will tell me if the age entered is an int or if it is a string
                if(x < 0){ // chceks to see if the age is less than zero, if it does. throws the exception
                    throw new Exception();
                }
                System.out.println(arr[0] + " will be " + (x + 1) +  " one year from now");
                test = false;
            } catch (Exception e) { //catches the exception either when the parseint fails or if the age is less than zero
                System.out.println("You didn't enter a valid age \ntry again");
            } // have two catches for non positive int and a string for age as well as make a -1 break
        }
    }
}
