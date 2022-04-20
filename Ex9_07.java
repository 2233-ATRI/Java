import java.util.Date;
import java.util.Scanner;
public class Ex9_07 {
    public static void main(String[] args){
        // TODO Auto-generated method stub
        Account s = new Account(1122,2000);
        s.setAnnualInterestRate(4.5/100);
        s.withDraw(2500);
        s.deposit(3000);
        System.out.println("Balance: "+s.getBalance());
        System.out.println("Monthly Interest: "+s.getMonthlyInterest());
        System.out.println("Register Date: "+s.getDateCreated().toString());
    }
}
class Account{
    private int id=0;
    private double balance=0;
    private static double annualInterestRate=0;
    private static java.util.Date dateCreated;
    public Account(){
        dateCreated = new java.util.Date();
    }
    public Account(int newid,double newbalance){
        id = newid;
        balance = newbalance;
        dateCreated = new java.util.Date();
    }
    public int getId() {
        return this.id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double j){
        balance=j;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double j){
        annualInterestRate = j;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterest(){
        return annualInterestRate/12*balance;
    }
    public double getWonthlyInterest(){
        return annualInterestRate/12;
    }
    public void withDraw(double m){
        balance-=m;
    }
    public void deposit(double m){
        balance += m;
    }
}
