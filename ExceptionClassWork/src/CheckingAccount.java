public class CheckingAccount {
    private double balance;
    private int number;

    public double getBalance(){
        return balance;
    }
    public int getNumber(){
        return number;
    }
    public CheckingAccount(int number){
        this.number = number;
    }
    public void deposit(double x){
        balance += x;
    }
    public double withdraw(double x) throws InsufficientFundsException {
        if(x < balance){
            return balance - x;
        }else{
            return x - balance;
        }
    }
}
