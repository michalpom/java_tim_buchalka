package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float min value= "+ myMinFloatValue);
        System.out.println("Float max value= "+ myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double min value= "+ myMinDoubleValue);
        System.out.println("Double max value= "+ myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue=5f/3f;
        double myDoubleValue=5.00/3.00;
        System.out.println("MyIntValue = " +myIntValue);
        System.out.println("MyFloatValue = " +myFloatValue);
        System.out.println("MyDoubleValue = " +myDoubleValue);

        double myPounds = 200d;
        double inKg= myPounds*0.45359237d;

        System.out.println(myPounds +" pounds is " +inKg + "kg.");

        double pi =3.1415927d;
        double anotherNumber = 3_000_000.4_567890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
