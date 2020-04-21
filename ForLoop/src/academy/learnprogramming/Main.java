package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        for (int i=1; i<10; i++){ //or i=0, i<5 and inside of the loop i+1
            System.out.println("10'000 at "+ i+ "% interest = "+  String.format("%.2f",calculateInterest(10000.0, (double)i)));
            //casting is not necessary, just to show and as a reminder,
            // String.format to show only 2 places after decimal, it's funny because without it the result is with dot
            // but after format it's in polish convention with comma
        }
        for (int i=10; i>2; i--) { //or i=0, i<5 and inside of the loop i+1
            System.out.println("10'000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }


    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
