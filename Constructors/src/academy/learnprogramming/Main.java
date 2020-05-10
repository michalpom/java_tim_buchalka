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

        BankAccount otherAccount = new BankAccount("56465465465", 55.0d);

        //BankAccount olasAccount= new BankAccount();

        //Testing VipCustomer
        VipCustomer vip1 = new VipCustomer();
        System.out.println(vip1.getName()+" " + vip1.getCreditLimit()+" "+ vip1.getEmail());
        VipCustomer vip2=new VipCustomer("Mike", 5000.0d);
        System.out.println(vip2.getName()+" " + vip2.getCreditLimit()+" "+ vip2.getEmail());
        VipCustomer vip3=new VipCustomer("Rob", 8000.0d, "robert@q.pl");
        System.out.println(vip3.getName()+" " + vip3.getCreditLimit()+" "+ vip3.getEmail());
    }
}
