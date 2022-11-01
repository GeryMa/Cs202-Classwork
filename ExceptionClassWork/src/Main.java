import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2};
        int x = 0;
        try {
            System.out.println("Enter a number");
            x = input.nextInt();
            System.out.println("The number at spot " + x +  " is: " + arr[x]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Thrown error: " + e);
        }finally{
            arr[0] = 6;
            System.out.println(arr[0] + " Is the first value");
        }
        input.close();
    }
}