import java.util.Scanner; //obviously needed for input
import java.util.ArrayList;
import java.util.Collections; //so i can shuffle easily
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner inputStr = new Scanner(System.in);
        System.out.println("Enter a string to be scrambled"); //get input
        String input = inputStr.nextLine();
        char[] test = new char[input.length()];
        for(int i = 0; i < input.length(); i++){ //add the string to the char array
            test[i] = input.charAt(i);
        }
        int count = 0;
        while(true){
            String tester = ScrambleString(test);
            if(!(tester).equals(input)){ //while its not equal to it, scramble it again and print what the scramble is
                System.out.println(tester); //show the scrambled word
                count++; //update count at the bottom
            }else{
                System.out.println(input); //the way the code was before this line. it wouldn't print the original again so it looks like the code just stops
                break;
            }
        } 
        System.out.println("Times scrambled before landing on the correct string: " + count);
        inputStr.close();
    }
    public static String ScrambleString(char[] test){
        ArrayList<String> shuffled = new ArrayList<String>(); //make an arraylist to be able to not have to write my own algorithm
        for(int i = 0; i < test.length; i++){
            String x = "" + test[i];//transfer all the chars to the string arraylist
            shuffled.add(x);
        }
        Collections.shuffle(shuffled); //shuffle said arraylist
        String y= "";
        for(int i = 0; i < shuffled.size(); i++){ //.toString() doesn't work here because it prints it as [x, y, z] which will never = input
            y = y + shuffled.get(i); //so i add it to a new string 1 by 1
        }
        return(y); //return the remade string
    }
}

//highest i tested it was the word projectcar which i didn't let finish because it went on for too long