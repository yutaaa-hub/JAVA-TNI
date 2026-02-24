package Banking;

import java.awt.*;

public class BankAccount {
    private String accID;
    private double accBalance;
    private final String filename = "*";

    public BankAccount(String accID, double accBalance){
        this.accID = accID;
        this.accBalance = accBalance;
    }
    public BankAccount(String accID){
        this.accID = accID;
    }
    public BankAccount(){
        this.accID = accID;
    }
    public String getAccID(){
        return accID;
    }
    public void setAccBalance(double accBalance){
        this.accBalance = accBalance;
    }
    public double getAccBalance(){
        return accBalance;
    }
    public String getFilename(){
        return filename;
    }
    public String toString(){
        return accID + ',' + accBalance;
    }
}
