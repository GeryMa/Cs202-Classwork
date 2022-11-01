import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,3,4};
        int x = -1;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter index: ");
            x = input.nextInt();
            System.out.println("THe number at said index is " + arr[x]);
        } catch (Exception e) {
            System.out.println("The error is: " + e);
        }
    }
}
