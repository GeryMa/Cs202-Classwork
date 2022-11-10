import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Toy> inventory = new ArrayList<Toy>();
        Toy t1 = new Toy("Lego", 20);
        System.out.println(t1.ToString());
        Toy t2 = new Toy("Lego", 10);
        Toy t3 = new Toy("Video Game", 45);
        Toy t4 = new Toy("Sock", 5);
        Toy t5 = new Toy("Lego", 10);
        if(t1.getName().equals( t2.getName()))
        System.out.println("t1 is the same as t2");
        else
        System.out.println("t1 is NOT the same as t2");
        if(t2.getName().equals( t3.getName()))
        System.out.println("t2 is the same as t3");
        else
        System.out.println("t2 is NOT the same as t3");
        if(t2.getName().equals( t5.getName()))
        System.out.println("t2 is the same as t5");
        else
        System.out.println("t2 is NOT the same as t5");
        
        inventory.add(t1);
        inventory.add(t2);
        inventory.add(t3);
        inventory.add(t4);
        inventory.add(t5);

        Collections.shuffle(inventory);
         for(Toy i : inventory){
            System.out.print(i.ToString() + " ");
        }
        System.out.println();
        Collections.shuffle(inventory);
         for(Toy i : inventory){
            System.out.print(i.ToString() + " ");
        }
        Collections.sort(inventory);
        System.out.println();
        for(Toy i : inventory){
            System.out.print(i.ToString() + " ");
        }
        System.out.println();
        Collections.reverse(inventory);
        for(Toy i : inventory){
            System.out.print(i.ToString() + " ");
        }
    }
    
}
/*
Create a new class called Toy. It should contain two data fields: a String called name and an int
called price. This class should also have a constructor that sets name and price.
2. Create a new class that contains main. In main, add the following code:
Toy t1 = new Toy("Lego", 20);
System.out.println(t1);
3. Run your program and see what it outputs.
4. Add code to Toy that will make it so outputting an object of type Toy will output:
_________ : $_______
Where the first _______ is the toy’s name, and the second ______ is its price.
(HINT: you’ll need to add a toString method!)
5. Run your program. It should now output:
Lego: $20
6. In main, add the following code beneath the current two lines:
Toy t2 = new Toy("Lego", 10);
Toy t3 = new Toy("Video Game", 45);
Toy t4 = new Toy("Sock", 5);
Toy t5 = new Toy("Lego", 10);
if(t1 == t2)
 System.out.println("t1 is the same as t2");
else
 System.out.println("t1 is NOT the same as t2");
if(t2 == t3)
 System.out.println("t2 is the same as t3");
else
 System.out.println("t2 is NOT the same as t3");
if(t2 == t5)
 System.out.println("t2 is the same as t5");
else
 System.out.println("t2 is NOT the same as t5");
7. Right now, we want to test if two toys are the same by testing if their name variables are the
same.
Run the program. Notice that none of the variables are found to be the same.
8. Add code to Toy to allow the checking of two Toy variables for equality. Two toys should be
the same if their names are the same.
(HINT: You’ll need to add an equals method!)
9. Modify the code in main so it properly checks the variables for equality.
When you run the program now, you should get that t1 is the same as t2, t2 is NOT the same as
t3, and t2 is the same as t5.
10. Add code in main to add all the Toy variables to an ArrayList called inventory.
11. Shuffle inventory and output what the items are.
12. Shuffle inventory again and output what the items are.
13. Run the program and make sure the ordering of the items changes after every shuffle!
14. We want to be able to sort our inventory according to the prices of the toys. Add code to Toy to
allow an ArrayList of Toy variables to be sorted
(HINT: You’ll need to add a compareTo method!)
15. Add code to main to actually sort inventory, then output what the items are. Make sure they’re
sorted by price!
16. Add code to main to sort inventory again, but this time in reverse order. Output what the items
are. Make sure they’re in reverse order now!
 */