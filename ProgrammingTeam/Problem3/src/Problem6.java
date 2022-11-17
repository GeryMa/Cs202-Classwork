import java.util.*;
public class Problem6 {
    private static String smallest = "";
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int[] options = {2, 3, 6, 7, 8};
            int n = Integer.parseInt(sc.nextLine()); // n = 17
            if(n < 0){
                break;
            }
            else if(n == 0){
                System.out.println("1 {}");
            }else if(n == 1){
                System.out.println("0");
            }else{
                smallest = "";
                int ways = score(n, options, options[0], "");
                System.out.println(ways + "{" + smallest.substring(1) + "}");
            }
        }
    }
    public static int score (int n, int[] options, int last, String play){
        if(n== 0){
            if(!smallest.equals("")){
                if(smallest.length() > play.length()){
                    smallest = play;
                }
            }else{
                smallest = play;
            }
            return 1; // there is 1 way to reach original value of n
        }
        int ways = 0;
        for(int i = 0; i < options.length; i++){
            if(n - options[i] >= 0 && options[i] >= last){
                ways += score(n- options[i], options, options[i], play + ", " + options[i]);
            }
        }
        return ways;
    }
}
