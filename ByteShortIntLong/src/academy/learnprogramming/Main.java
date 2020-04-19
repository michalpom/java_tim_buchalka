package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue=10000;

        int myMinIntValue=Integer.MIN_VALUE;
        int myIntMaxValue=Integer.MAX_VALUE;
        System.out.println("Integer MIN Value = " +myMinIntValue);
        System.out.println("Integer MAX Value = " +myIntMaxValue);
        System.out.println("Busted MAX Value = " + (myIntMaxValue+1));
        System.out.println("Busted MIN Value = " + (myMinIntValue-1));

        int myMaxIntTest=2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue=Byte.MAX_VALUE;
        System.out.println("Byte MIN Value = " +myMinByteValue);
        System.out.println("Byte MAX Value = " +myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue=Short.MAX_VALUE;
        System.out.println("Short MIN Value = " +myMinShortValue);
        System.out.println("Short MAX Value = " +myMaxShortValue);

        long myLongValue=100L;


        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue=Long.MAX_VALUE;
        System.out.println("Long MIN Value = " +myMinLongValue);
        System.out.println("Long MAX Value = " +myMaxLongValue);
        long BigLongLiteralValue = 2_147_483_687L;
        System.out.println(BigLongLiteralValue);

        int myTotal = (myMinIntValue/2);
        byte myNewByteValue = (byte)(myMinByteValue/2);
        short myNewShortValue = (short)(myMinShortValue/2);

        byte A = 10;
        short B= 20;
        int C =23;

        long D = 50000+ 10*(A+B+C);
        System.out.println(D);
    }
}
