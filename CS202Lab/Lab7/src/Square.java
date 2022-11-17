public class Square extends Shape{
    int side;
    public int outputArea(){
        return side * side;
    }
    public static void main(String[] args){
        Shape test = new Shape();
        test.color = "red";
        System.out.println(test.outputColor());
        Square test1 = new Square();
        test1.color = "blue";
        test1.side = 3;
       System.out.println( test1.outputColor());
       System.out.println(test1.outputArea());
    }
}
/*
Create two new classes, one called Shape that will be the superclass for a new subclass called Square.
Shape should have one String member variable called color, and one method called outputColor that outputs its color.
Square should have one int member variable called side, and one method called outputArea that outputs the area of a square with this side length (aka the side times the side)
Add main to one of the two classes, and create a new Shape variable. Set its color to "red", then use its outputColor method.
In main, create a new Square variable. Set its color to "blue" and its side to 3, then use its outputColor and outputArea methods.
 */
