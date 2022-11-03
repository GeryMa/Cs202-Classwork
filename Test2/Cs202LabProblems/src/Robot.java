public class Robot {
    private String name;
    private int pos;
    static int battery = 100;
    public Robot(String name, int pos){
        this.name = name;
        this.pos = pos;
    }
    public void setPos(int x){
        pos = x;
    }
    public int getPOS(){
        battery--;
        return pos;
    }
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    static void setBattery(int x){
        battery = x;
    }
    static int getBattery(){
        return battery;
    }
}
/*
Create a new class with main.
Create a new class, Robot, with 2 private fields, a String called name and an int called pos. It also has 1 private static int field, battery, initially set to 100.
Give Robot a constructor that sets its name and pos.
Give Robot accessor and mutator methods for each field. (Remember, methods dealing with static variables will need to be static too!)
Modify the mutator method for pos. Add in code so battery is decremented each time pos is changed.
In main, create two new Robot variables, r1 and r2. Give them name and pos: Bulbasaur, 53 and Lady Gaga, 10
Output Robot's battery.
Change r1's pos to 52
Output Robot's battery.
Change r2's pos to 61
Output Robot's battery.
 */