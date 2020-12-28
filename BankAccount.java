//Manish Vohal
package BankAccount;

public class BankAccount implements BankAccountSpecification{

    private int balance = 0;

    public boolean deposit(int amount){
        balance+=amount;
        return true;
    }

    public boolean withdraw(int amount){
        balance-=amount;
        return true;

    }

    public static void main(String[] args)
    {
        BankAccount vohals = new BankAccount();
        vohals.deposit(100);
        vohals.withdraw(50);
        System.out.println(vohals.balance);
    }
}

