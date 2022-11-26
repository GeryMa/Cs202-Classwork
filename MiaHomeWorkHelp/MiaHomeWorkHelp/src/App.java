import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String x = "afasdgf";
        double y = Double.parseDouble(x);
    }
}
        /*String[] arr = {"sun", "moon", "saturn", "mercury", "mars", "uranus", "venus", "juptier", "neptune"};
        Scanner inputStr = new Scanner(System.in);
        Scanner inputDub = new Scanner(System.in);
        double weight = 0;
        boolean isTrue = false;
        String planet = "";
        try{
            System.out.println("Enter your weight");
            weight = inputDub.nextDouble();
            for(int i = 0; i < arr.length; i++){
                if(planet.equals(arr[i])){
                    isTrue = true;
                }
            }
            while(isTrue == false){
                System.out.println("Enter the planet you want to find your weight on");
                planet = inputStr.nextLine().toLowerCase();

                for(int i = 0; i < arr.length; i++){
                    if(planet.equals(arr[i])){
                        isTrue = true;
                    }
                }
            }
            getPlanet(planet, weight);
        }
        catch(Exception e){
            System.out.println("You didn't enter a valid weight");
        }
        inputStr.close();
        inputDub.close();
    }
    public static void getPlanet(String planet, double weight){
        switch(planet){
            case("sun"):{
                System.out.println("Your weight on the sun is " + weight * 27.94);
                break;
            }
            case("moon"):{
                System.out.println("Your weight on  " + planet +  "is: " + weight * .17);
                break;
            }
            case("saturn"):{
                System.out.println("Your weight on " + planet +  "is: " + weight * .91);
                break;
                
            }case("mercury"):{
                System.out.println("Your weight on " + planet +  "is: " + weight * .37);
                break;
            }
            case("mars"):{
                System.out.println("Your weight on " + planet +  "is: " + weight * .38);
                break;
            }
            case("uranus"):{
                System.out.println("Your weight on " + planet +  "is: " + weight * .88);
                break;
            }
            case("venus"):{
                System.out.println("Your weight on " + planet +  "is: " + weight * .38);
                break;
            }
            case("jupiter"):{
                System.out.println("Your weight on " + planet +  "is: " + weight * 2.64);
                break;
            }
            case("neptune"):{
                System.out.println("Your weight on " + planet +  "is: " + weight * 1.12);
                break;
            }
        }
    }
}
*/