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


}