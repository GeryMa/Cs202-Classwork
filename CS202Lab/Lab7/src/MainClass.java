public class MainClass {
    public static void main(String[] args){
        BigChild var1 = new BigChild();
        SmallBaby var2 = new SmallBaby();

        var1.firstMethod();
        var2.firstMethod();
    }
}
/*
Create a class called MainClass
Give MainClass a main (empty for now)
Create an abstract class called Parent with no member variables
Give Parent an abstract method called firstMethod with no return value and no parameters.
Create a child class of Parent called BigChild.
Implement firstMethod in BigChild, having it output: I am a monster baby!
Create a different child class of Parent called SmallBaby.
Implement firstMethod in SmallBaby, having it output: My name is Widowmaker
In main, create a new object variable called var1 of type BigChild, and a different object variable called var2 of type SmallBaby
Use var1's firstMethod
Use var2's firstMethod
 */