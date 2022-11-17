public class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bark!");
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