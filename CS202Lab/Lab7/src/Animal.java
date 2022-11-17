import java.util.ArrayList;
import java.util.Collections;
public class Animal {
    String name;
    public void makeSound(){
        System.out.println("Grr");
    }
    public static void main(String[] args){
        Animal test = new Animal();
        test.makeSound();

        Cat test1 = new Cat();
        test1.makeSound();

        Dog test2 = new Dog();
        test2.makeSound();
    }
    
}
/*
Create three new classes, one called Animal that will be the superclass, and two subclasses. The first called Dog, and the second called Cat.
Animal should have one String member variable called name, and one method that takes no parameters and has no return value, called makeSound. The makeSound( ) method should output: Grr
Dog should override the makeSound method to output: Bark!
Cat should override the makeSound method to output: Meow!
Add main to Animal and create a variable of type Animal, then use its makeSound( ) method.
Create a variable of type Cat and use its makeSound( ) method.
Create a variable of type Dog and use its makeSound( ) method.
 */