public class Point {
    public int x;
    static int numPoints = 0;
    public Point(int x){
        this.x = x;
        numPoints = 0;
    }
}
/*
Create a new class that contains main.
Create a new class called Point that contains one int member variable, x, and one static int member variable (initially set to 0),numPoints
Create a constructor to initialize the value of x
In main, create a new Point object called p1 with 24 for x
Create another Point object called p2 with 58 for x
Output p1's field, x
Output p2's field, x
Change p1's field, x to be 121
Output p1's field, x
Output p2's field, x
Output p1's field, numPoints
Output p2's field, numPoints
Change p1's field, numPoints to be 15
Output p1's field, numPoints
Output p2's field, numPoints
 */