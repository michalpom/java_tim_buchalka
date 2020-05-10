package academy.learnprogramming;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //constructor
    public BankAccount(){
        //default values:
        this(null,0.0d); //calling another constructor within a constructor, this must be in the firs line
        System.out.println("A new account created");

    }

    public BankAccount(String accountNumber, double balance){
        this.accountNumber=accountNumber; //or directly by setAccountNumber(accountNumber)
        this.balance=balance;
        System.out.println("Created account "+this.accountNumber + " with " + this.balance + "$ balance");
    }

    //menu Code/Generate/Constructor and choose fields

    public BankAccount(String customerName, String email) {
        this.customerName = customerName;
        this.email = email;
    }


    //menu: Code/Generate to quick generate getters and setters

    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void deposit(double deposit){
        this.balance=this.balance+deposit;
        System.out.println("You added "+deposit + " to your account");
        //System.out.println("Current balance = "+balance);
        displayBalance();
    }
    public void withdraw(double withdraw){

        if (withdraw>this.balance){
            System.out.println("You don't have enough money on your account!");
            //System.out.println("Current balance = " + balance);
            //displayBalance();
        }else {
            this.balance = this.balance - withdraw;
            System.out.println("You withdrawn " + withdraw);
            //System.out.println("Current balance = " + balance);
            //displayBalance();
        }
        displayBalance();
    }

    private void displayBalance(){
        System.out.println("Current balance = " + this.balance);
    }
}
