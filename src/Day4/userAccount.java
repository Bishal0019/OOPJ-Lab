package Day4;

class Account{
    static int nextAccNo=1000;
    int accNo;
    String name;
    String accType;
    double balance;
    int day,month,year;

    Account(String name, String accType, double balance){
        this.name=name;
        this.accType=accType;
        this.balance=balance;
        this.accNo=++nextAccNo;
    }

    double curBalance(){
        return balance;
    }

    void deposit(double newBalance, int day, int month, int year){
        balance+=newBalance;
        this.day=day;
        this.month=month;
        this.year=year;
        System.out.println("Amount Successfully Deposited, New Balance = "+balance);
    }

    void withdraw(int amount){
        balance-=amount;
    }
}

class standardAccount extends Account{
    standardAccount(String name, double balance){
        super(name,"Standard",balance);
    }

    void withdraw(int amount){
        if(amount<=100000){
            if(balance>=amount) {
                balance -= amount;
                System.out.println("Withdraw Successfull, Current Balance = "+balance);
            }
            else {
                System.out.println("Not Enough Balance");
            }
        } else if (amount<=500000) {
            double penalty = amount*(0.05/100);
            if(balance>=(amount+penalty)){
                balance-=(amount+penalty);
                System.out.println("Withdraw Successfull, Current Balance = "+balance+", Penalty Deducted = "+penalty);
            }
            else {
                System.out.println("Not Enough Balance");
            }
        } else {
            System.out.println("Amount Exceeds User Limit");
        }
    }
}

class premiumAccount extends Account{
    premiumAccount(String name, double balance){
        super(name, "Premium", balance);
    }

    void withdraw(int amount){
        if(amount<=1000000){
            if(balance>=amount){
                balance-=amount;
                System.out.println("Withdraw Successfull, Current Balance = "+balance);
            }
            else {
                System.out.println("Not Enough Balance");
            }
        } else {
            System.out.println("Amount Exceeds User Limit");
        }
    }
}

public class userAccount {
    public static void main(String[] args){
        Account user1,user2;
        user1 = new standardAccount("Bishal",2000000);
        user2 = new premiumAccount("Aryan",5000000);

        user1.deposit(500,7,1,2026);

        user1.withdraw(700000);
        user1.withdraw(400000);
        user2.withdraw(800000);
    }
}
