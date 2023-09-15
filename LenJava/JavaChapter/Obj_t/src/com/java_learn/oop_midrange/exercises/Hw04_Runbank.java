package com.java_learn.oop_midrange.exercises;

public class Hw04_Runbank {
    public static void main(String[] args) {

    }
}
class BankAccount{
    private int balance;//余额

    public BankAccount(int balance) {
        this.balance = balance;
    }
    //存款
    public void deposit(double amount){
        this.balance+=amount;
    }
    //取款
    public void withdraw(double amount){
        this.balance-=amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
class CheckingAccount extends  BankAccount{
    private double Handling_fee=1;

    public double getHandling_fee() {
        return Handling_fee;
    }

    public void setHandling_fee(double handling_fee) {
        Handling_fee = handling_fee;
    }

    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount-1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount-1);
    }
}
class SavingAccount extends BankAccount{
    private int count=3;

    public SavingAccount(int balance) {
        super(balance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void deposit(double amount) {
        if (count>0){
            super.deposit(amount);
        }else {
            super.deposit(amount - 1);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (count>0){
            super.withdraw(amount);
        }else{
            super.withdraw(amount+1);
        }
    }
}