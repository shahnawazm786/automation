package org.example.day09.abstraction;

public class BankClass implements IExample{
    double amount=0.0;
    @Override
    public void tax_cal() {
        amount=amount - (amount * tax/100);
    }
    void setAmount(double amount){
        this.amount=amount;
    }
    double getAmount(){
        return this.amount;
    }
}
