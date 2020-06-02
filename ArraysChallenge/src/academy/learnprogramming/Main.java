package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] integers = getIntegers(5);
        printArray(integers);
        System.out.println("Sorted array:");
        printArray(sortArray(integers));



    }

    public static int[] getIntegers(int count){
        int[] array = new int[count];

        System.out.println("Enter " + count + " numbers:\r");
        for (int i = 0; i<array.length; i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i =0; i < array.length; i++){
            System.out.println(i + "# element = " + array[i]);
        }
    }

    public static int[] sortArray(int[] array){
       // int[] sortedArray = new int[array.length];

//        for (int i = 0; i<array.length; i++){
//            sortedArray[i]=array[i]; //copy of typed array
//        }

        int[] sortedArray= Arrays.copyOf(array, array.length); //copying array with builtin method

        boolean flag = true;
        int temp;

        while (flag){
            flag=false;

            for(int i =0; i<sortedArray.length-1; i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp= sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }

        }

        return sortedArray;
    }
}
