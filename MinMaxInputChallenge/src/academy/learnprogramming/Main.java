package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        Scanner scanner= new Scanner(System.in); //creating an instance of Scanner

        while(true){
            System.out.println("Enter a number or sth else to exit");
            boolean hasInt  = scanner.hasNextInt();
            if (!hasInt){
                System.out.println("Min value = "+min);
                System.out.println("Max value = "+max);
                break;
            }else{
                int value = scanner.nextInt();
                if (value>max){
                    max=value;
                }
                if (value<min){
                    min =value;
                }
            }
            scanner.nextLine();//handling next line character (enter key), it must be after reading int by nextInt()
        }


        scanner.close();
    }
}
