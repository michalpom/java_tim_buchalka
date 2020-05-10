package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();

        System.out.println("Welcome in our Bank");

        System.out.println(myAccount.getBalance());

        System.out.println("Testing:");
        System.out.println("Adding 1000$ to account:");
        myAccount.deposit(1000d);
        System.out.println("Take 800$ from account:");
        myAccount.withdraw(800d);
        System.out.println("Take 500$ from account:");
        myAccount.withdraw(500d);

    }
}
