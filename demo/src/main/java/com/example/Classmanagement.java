package com.example; 

public class Classmanagement {
    // المتغيرات الأساسية للكلاس (Fields)
    public String help;
    public long accountNumber;
    public double balance = 1000.0; // نضع الرصيد المبدئي هنا كقيمة أولية
    public double withdraw;
    public double deposit;
    public String customerName;

    // الـ Constructor لتجهيز البيانات
    public Classmanagement(String help, long accountNumber, double balance, double withdraw, double deposit, String customerName) {
        this.help = help;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.withdraw = withdraw;
        this.deposit = deposit;
        this.customerName = customerName;
    }

    // 1. دالة المساعدة
    public String getHelp() {
        help = "For assistance, please contact our customer support at 1-800-123-4567 or email support@example.com";
        return help;
    }

    // 2. دالة رقم الحساب
    public long getAccountNumber() {
        
        return accountNumber;
    }

    // 3. دالة رؤية الرصيد الحالي (ترجع الرصيد فقط بدون حسابات)
    public double getBalance() {
    
      balance = balance - withdraw + deposit; // تحديث الرصيد بعد السحب والإيداع
      
        return balance;
    }

    // 4. دالة السحب (تطرح المبلغ من الرصيد الأساسي)
    public double getWithdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount; // الرصيد يقل بمقدار المبلغ المسحوب
            this.withdraw = amount;
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
     return amount; // ترجع المبلغ المسحوب   
    }

    // 5. دالة الإيداع (تزيد المبلغ على الرصيد الأساسي)
    public double getDeposit(double amount) {
        if (amount > 0) {
            balance = balance + amount; // الرصيد يزيد بمقدار المبلغ المودع
            this.deposit = amount;
        }
        return amount; // ترجع الرصيد الجديد
    }

    // 6. دالة اسم العميل
    public String getCustomerName() {
     
        return customerName;
    }
}