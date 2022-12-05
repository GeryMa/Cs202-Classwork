public class Square2 extends Shape2{
    int size;
    public Square2(int x){
        size = x;
    }
    public void outputArea(){
        System.out.println(size * size);
    }
}
/*
Create a class called MainClass
Give MainClass a main method (that is empty for now)
Create an abstract class called Shape with one int member variable: size
Give Shape an abstract method called outputArea that has no return value and no parameters.
Create a child class of Shape called Square.
Give Square a constructor that sets its member variable.
Implement the outputArea method in Square, to calculate and output the area of a square with side lengths of size.
In main, create a new Square variable that has a size of 72.
Use the variable's outputArea method.
 */