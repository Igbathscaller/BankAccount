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

    public int getAccountID(){
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
        return '#'+ accountID + "\t" + '$' + balance;
    }

    /**Determine if the password in the object is the same as the parameter.
    *@param password to be checked against the object's password (remember the distinction between this.x and x)
    *@return true if the passwords are the same, false otherwise.
    */
    private boolean authenticate(String password){
        return this.password.equals(password);
    }

    /**Transfer money from this BankAccount to the other only when the password matches, and the withdrawal succeeds.
    *@param other which BankAccount to GIVE the money to
    *@param amount how much money to transfer, negative amounts will make this operation fail.
    *@param password to be checked against the source account, incorrect password will make this operation fail.
    *@return true if money is successfully transfered, false otherwise.
    */
    public boolean transferTo(BankAccount other, double amount, String password){
        if(this.withdraw(amount) && this.authenticate(password)){
            if(other.deposit(amount)){
                return true;
            }
            else{System.out.println("VERYBAD");}
        }
        return false;
    }
    

}