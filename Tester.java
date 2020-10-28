public class Tester {
    public static void main(String[]args){
        BankAccount David = new BankAccount (219316767, "AbhijeetSaha");
        System.out.println(David.toString());
        David.deposit(123456789);
        David.deposit(12342.23);
        System.out.println(David.toString());
        David.withdraw(12342.23);
        System.out.println(David.toString());
        System.out.println(David.getBalance());
        System.out.println(David.toString()+David.deposit(12342.23));
        David.setPassword("this doesn't even matter since you can't even check it");
        System.out.println(David.toString());
    }
}
