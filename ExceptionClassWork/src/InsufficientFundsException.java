public class InsufficientFundsException extends Exception{
    /*private double amount;
    public double getAmount(){
        return amount;
    }
    public (double amount){
        this.amount = amount;
    }*/
    private double amount;
    public double getAmount(){
        return amount;
    }
    public InsufficientFundsException(double x){
        amount = x;
    }
}