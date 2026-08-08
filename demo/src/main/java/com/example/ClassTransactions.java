package com.example; 

 
import java.time.LocalDateTime;


public class ClassTransactions {
    public long transactionId;
    public double balance;
    public String transactionType;
    public LocalDateTime timestamp;
    public String reset;

    public ClassTransactions(long transactionId, double balance, String transactionType, LocalDateTime timestamp, String reset) {
        this.transactionId = transactionId;
        this.balance = balance;
        this.transactionType = transactionType;
        this.timestamp = timestamp;
        this.reset = reset;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public double getBalance() {
        return balance;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }


    public String getRecent() {
        return reset;
    }

}  


