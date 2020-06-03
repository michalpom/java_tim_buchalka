package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the length of the array.\r");
        int[] myArray = readIntegers( scanner.nextInt() );

        System.out.println("The minimum value in the array = " + findMin( myArray ) );

    }

    private static int[] readIntegers(int count){
        int[] array = new int[count];

        System.out.println("Enter " + count + " integers:\r");
        for (int i = 0; i < array.length; i++){
            array[i]=scanner.nextInt();

            //Tim used scanner.nextLine() to avoid error, but the solution works without it
        }

        return array;
    }
    private static int findMin(int[] array){
        int min=Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }

        return min;
    }
}
