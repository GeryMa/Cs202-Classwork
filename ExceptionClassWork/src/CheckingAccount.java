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
    public void withdraw(double x) throws InsufficientFundsException {
        if(x <= balance){
            balance -= x;
        }else{
            double needs = x - balance;
            throw new InsufficientFundsException(needs);  
        }
    }
}
