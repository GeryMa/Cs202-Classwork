public class Vehicle {
    int position;
    public Vehicle(){
        position = 0;
    }
    public void move(){
        position++;
    }
    public static void main(String[] args){
        Vehicle var1 = new Vehicle();
        var1.move();
        var1.move();
        var1.move();
        System.out.println(var1.position);

        Car var2 = new Car();
        var2.move();
        var2.move();
        System.out.println(var2.position);
    }
}
/*
Create two new classes, one called Vehicle that will be the superclass, and a subclass called Car.
Vehicle should have one int member variable called position, and a constructor that sets position to 0. It should also have a method called move that takes no parameters and has no return value, and increments position by 1
Car should overwrite the move method to increment position by 2.
Add main to Vehicle and create a variable called var1 of type Vehicle. Use its move method 3 times, then output the value of its position variable.
Create a variable called var2 of type Car. Use its move method 2 times, then output the value of its position.
 */