public class Hero implements Attack{
    int attackStrength;
    public Hero(int x){
        attackStrength = x;
    }
    public static void main(String[] args){
        Hero test = new Hero(3);
        System.out.println(test.attack());
        System.out.println(test.criticalAttack());
    }
    @Override
    public int attack() {
        return attackStrength * 10;
    }
    public int criticalAttack(){
        return attackStrength * 20;
    }
}
/*
 * Create a class called Hero with one int member var called attackStrength
Give Hero a main (empty for now)
Create an interface called Attack with two methods: One called attack with an int return value and no parameters, and the other called criticalAttack with an int return value and no parameters
Make Hero use the Attack interface. The attack method should return 10 times the attackStrength, and the criticalAttack method should return 20 times the attackStrength.
In main, create a Hero object with attackStrength 3.
Output what the attack method returns
Output what the criticalAttack method returns
 */