public class Horse implements Walks, Sleeps{
    public static void main(String[] args){
        Horse y = new Horse();
        y.move(5);
        y.sleep();
    }
    public void move(int x){
        for(int i = 0; i < x; i++){
            System.out.println("clop");
        }
    }
    public void sleep(){
        System.out.println("zzz");
    }
}
/*
 * Create a class called Horse
Give Horse a main (empty for now)
Create an interface called Walks with one method: move with no return value & one int parameter called numSteps
Create a different interface called Sleeps with one method: sleep with no return value and no parameters
Make Horse use both Walks and Sleeps. Its walk method should output:
clop
clop
clop
clop
(where the # of clop is the same as the numSteps). Its sleep should output: zzz
In main, create a Horse object
Use its move with a value of 5
Use its sleep
 */
