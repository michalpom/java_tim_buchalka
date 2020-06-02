package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {

        int[] ourIntegers = getIntegers(5);
        printArray(ourIntegers);

        System.out.println("The average of the array = " + average(ourIntegers));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values. \r");  // \r puts cursor in the next line
        int[] values = new int[number];

        for (int i =0; i<values.length; i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(i + "# element = " + array[i]);
        }

    }

    public static double average(int[] array){
        double sum=0;
        for(int i = 0; i<array.length; i++){
                sum+=array[i];
        }
        return sum/array.length;
    }

}
