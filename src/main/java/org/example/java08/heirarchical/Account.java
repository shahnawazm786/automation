package org.example.java08.heirarchical;

public class Account {
    String custName;
    double accNo=1000;
    public double NewAccount(String custName){
        this.custName=custName;
        return this.accNo++;
    }
    String print(){
        return "Customer name =>" + this.custName +"\t"+"Customer Account"+this.accNo;
    }
}
