package com.example;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
      
      
      
        ClassAuth auth = new ClassAuth("Ali Ahmed", "461245", 255354654L, "true", "false", "false");   
        Classmanagement classmanagement = new Classmanagement(" support at 1-800-123-4567 or email support@example.com", 255354654L, 3000.0, 120.0, 657.0, "Ali Ahmed");
        ClassTransactions transaction = new ClassTransactions(895L, 3000.0, "Deposit", LocalDateTime.of(2021, 6, 24, 11, 56), "true");




        ClassAuth auth2 = new ClassAuth("rahem kareem", "16544", 8595354654L, "true", "true", "true");
        Classmanagement classmanagement2 = new Classmanagement(" support at 1-800-123-4567 or email support@example.com", 8595354654L, 5000.0, 1500.0, 369.0, "rahem kareem");
        ClassTransactions transaction2 = new ClassTransactions(896L, 5000.0, "Deposit", LocalDateTime.of(2021, 4, 20 ,9,30 ), "true");





        ClassAuth auth3 = new ClassAuth("jana muhmud", "1234", 5442323396L, "true", "true", "true");
        Classmanagement classmanagement3 = new Classmanagement(" support at 1-800-123-4567 or email support@example.com", 5442323396L, 7000.0, 351.0, 545.0, "jana muhmud");
        ClassTransactions transaction3 = new ClassTransactions(297L, 7000.0, "Deposit", LocalDateTime.of(2025, 7, 9, 14, 20), "true");




       ClassAuth auth4 = new ClassAuth("fareda gareeb", "1234", 7542323396L, "false", "true", "true");
       Classmanagement classmanagement4 = new Classmanagement(" support at 1-800-123-4567 or email support@example.com", 75852493L, 9000.0, 450.0, 750.0, "fareda gareeb");
       ClassTransactions transaction4 = new ClassTransactions(808L, 9000.0, "withdrawal", LocalDateTime.of(2026, 7, 12, 23, 5), "true");




       ClassAuth auth5 = new ClassAuth("mohammed saed", "1647", 1235533936L, "true", "true", "true");
       Classmanagement classmanagement5 = new Classmanagement(" support at 1-800-123-4567 or email support@example.com", 1235533936L, 11000.0, 550.0, 850.0, "mohammed saed");
       ClassTransactions transaction5 = new ClassTransactions(479L, 11000.0, "withdrawal", LocalDateTime.of(2027, 9, 22, 10, 15), "true");







  System.out.println("User : " + auth2.getName() +"\n"+"\nCard Number : " + auth2.getCardnumber() +  "\n"+  "\nPIN Status : " + auth2.getPin() +"\n"+ "\nCard Reading Status : " + auth2.cardreading() +"\n"+ "\nTransaction ID : " + transaction2.getTransactionId() + "\n"+"\nBalance : $" + transaction2.getBalance() + "\n"+"\nTransaction Type : " + transaction2.getTransactionType() + "\n"+"\nTimestamp : " + transaction2.getTimestamp().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n"+"\nRecent Transaction Status : " + transaction2.getRecent() + "\n"+"\nAccount Number : " + classmanagement2.getAccountNumber() + "\n"+"\nCustomer Name : " + classmanagement2.getCustomerName() + "\n"+"\nCurrent Balance : $" + classmanagement2.getBalance() + "\n"+"\nHelp Information : " + classmanagement2.getHelp() + "\n"+"\nWithdraw Amount : $" + classmanagement2.getWithdraw(120.0) + "\n"+"\nDeposit Amount : $" + classmanagement2.getDeposit(657.0) );

 
  System.out.println("\n\nwithdraw: " + classmanagement4.getWithdraw(1500.0) ); 















     }  
    
} 
  