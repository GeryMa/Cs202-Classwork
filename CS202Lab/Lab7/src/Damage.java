interface Damage {
    public void takeDamage(int damageAmount);
}
/*
 * Create a class called Monster with two int member vars: hp and x
Give Monster a main (empty for now)
Create an interface: Damage with 1 method: takeDamage, no return value & one int param: damageAmount
Create a different interface: Move with 1 method: move, no return value and one String param: input
Make Monster use both Damage and Move. Its takeDamage decreases hp by damageAmount. Its Move increases x by one if input was: r. It decreases x by one if input was: l. Add code so x is never negative! (Min value 0)
In main, create a Monster object with hp 10 and x 0
Use its move with a "l"
Output its x value
Use its move with a "r"
Output its x
Use its takeDamage with 4
Output its hp
 */