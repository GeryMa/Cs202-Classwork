public class AgeTest {
    public static void main(String[] args){
        checkAge(15);
    }
    public static void checkAge(int x){
        try{
            if(x < 18){
                throw new Exception();
            }else{
                System.out.println("access granted");
            }
        }catch(Exception e){
            System.out.println("access denied");
        }
    }
}
