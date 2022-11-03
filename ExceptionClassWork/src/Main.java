public class Main {
    public static void main(String[] args) throws Exception {
        try {
            int[]a = new int[7];
            a[8] = 30/2;
            System.out.println("First print statement in try block");
        } catch(ArithmeticException e){//ArithmicException
            System.out.println("Arithmic Exception");
        }catch(ArrayIndexOutOfBoundsException e){//arrayIndexOutOfBounds
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch(Exception e){ //exception
            System.out.println(e);
        }
    }
}