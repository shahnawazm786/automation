package org.example.day08.heirarchical;

public abstract class Loan extends Account {
    double rate_of_interest=0.10;
    double laon=0.0;
    void calculateInterest(double loan){
        this.laon=loan;
        if(laon>=50000 & laon <=100000){
            this.rate_of_interest=15.0;
        }
        else if(laon>=40000 & laon <50000){
            this.rate_of_interest=8.5;
        }
        else if(laon>=35000 & laon <40000){
            this.rate_of_interest=7.5;
        }
        else if(laon>=30000 & laon <25000){
            this.rate_of_interest=6.5;
        }
        else {
            this.rate_of_interest=10.0;
        }
    }
    double calculate_loan(){
        return this.rate_of_interest *this.laon;
    }
    abstract void print1();
}
