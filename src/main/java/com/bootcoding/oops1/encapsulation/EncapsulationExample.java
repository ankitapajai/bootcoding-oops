package com.bootcoding.oops1.encapsulation;

class BankAccount {
    private double balance;   // private attributes..
       public BankAccount(double initialBalance){
           balance = initialBalance;
       }

       //method..
       public void deposite(double amount){
           if(amount > 0){
               balance = balance+amount;
           }
       }

       //2nd method..
       public double getBalance(){
           return balance;
       }
}

 public class EncapsulationExample{
     public static void main(String[] args) {
         BankAccount account = new BankAccount(1000);
         account.deposite(500);
         System.out.println("Account balance: " +account.getBalance());
     }
}
