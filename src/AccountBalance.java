public class AccountBalance {
    private double monetaryBalance;

    public AccountBalance(){
        this.monetaryBalance = 1000.00;
    }

    public AccountBalance(double initialBalance){
        this.monetaryBalance = initialBalance;
    }

    public double getMonetaryBalance (){
        return monetaryBalance;
    }

    public void updateBalance(double amount){
        this.monetaryBalance += amount;
    }

    public void retireMoney(double amount){
        this.monetaryBalance -= amount;
    }

    public String toString(){
        return "Balance actual: " + monetaryBalance;
    }
}
