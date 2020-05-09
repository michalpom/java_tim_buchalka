package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //creating an instance of Scanner

        int counter =0;
        int sum=0;

        while(counter<10){  //or while(true) and using if(counter==10) and break
            System.out.println("Enter #"+(counter+1)+" number");
            boolean hasInt =scanner.hasNextInt();
            if (hasInt){
                int number = scanner.nextInt();
                //scanner.nextLine(); //handling in this place doesn't work...
                //"since the user did enter content it would need to be read and removed from the scanner
                //before additional content is entered since the next line handles that by reading input and not storing it
                //it needs to be after the else statement no in the if statement, otherwise the invalid
                //content would not be removed"
                sum = sum+number;
                counter++;
            }else{
                System.out.println("Invalid value");
            }
            scanner.nextLine(); //handling next line character (enter key), it must be after reading int by nextInt()

        }
        System.out.println("The sum="+sum);

        scanner.close(); //always remember to close it!
    }
}