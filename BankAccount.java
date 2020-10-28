public class BankAccount{

    private double balance;
    private int accountID;
    private String password;
    
    public BankAccount(int acc, String pass){
        balance = 0;
        accountID = acc;
        password = pass;
    }

    public double getBalance(){
        return balance;
    }

    public int getAccount(){
        return accountID;
    }

    public void setPassword(String newPass){
        password = newPass;
    }

    public boolean deposit(double amount){
        if (amount<0){
            return false;
        }
        else{
            balance += amount;
            return true;
        }
    }

    public boolean withdraw(double amount){
        if (amount < 0 || balance - amount < 0){
            return false;
        }
        else{
            balance -= amount;
            return true;
        }
    }

    public String toString(){
        return accountID + "\t" + balance;
    }

}