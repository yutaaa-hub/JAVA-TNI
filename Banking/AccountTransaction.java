package Banking;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AccountTransaction extends BankAccount implements Transactionable{

    public AccountTransaction(String accID){
        super(accID);
    }
    public boolean hasAccountID(){
        File file = new File("usersaccount.txt");
        if (!file.exists()) {
            return false;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(getAccID())) {
                    setAccBalance(Double.parseDouble(data[1]));
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }


    @Override
    public void deposit(double amount) {
    double newBalance = getAccBalance() + amount;
    setAccBalance(newBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getAccBalance()) {
            double newBalance = getAccBalance() - amount;
            setAccBalance(newBalance);
        }
    }

    @Override
    public double checkBalance() {
        return 0;
    }
}
