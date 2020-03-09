package Encapsulation;

class Account{
    protected double balance;
    public Account(double balance){
        this.balance = balance;
    }
    public void withdrawMoney(double amount){}
    public void depositMoney(double amount){}
    public void showBalance(){}
}

class Savings extends Account{

    public Savings(double balance){
        super(balance);
    }
    private double interestRate = 0.8;
    public void withdrawMoney(double amount){
        this.balance = this.balance - amount*interestRate;
    }
    public void depositMoney(double amount){
        this.balance = this.balance + amount*interestRate;
    }
    public void showBalance(){
        System.out.println(this.balance);
    }

}
public class PolymorphismExample {
    public static void main(String[] args) {
        Account savingsAccount = new Savings(10000);
        savingsAccount.depositMoney(5000);
        savingsAccount.withdrawMoney(1200);
        savingsAccount.showBalance();
    }

}
