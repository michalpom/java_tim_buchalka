package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //creating an instance of Scanner

        System.out.println("Enter the year of the birth:");
        boolean hasInt =scanner.hasNextInt();

        if(hasInt) {

            int year = scanner.nextInt(); //reading string and converting it to integer
            scanner.nextLine(); //handling next line character (enter key), it must be after reading int by nextInt()
            int age = 2020 - year;


            System.out.println("Enter a name: ");
            String name = scanner.nextLine(); //calling the method nextLine()

            if (age >= 0 && age <= 100) {
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                if (age > 18) {
                    System.out.println("You are an adult, you can drink alcohol!");
                }
            } else {
                System.out.println("Invalid year of birth");
            }
        }else {
            System.out.println("Unable to parse the year of birth. Error :( ");
        }


        scanner.close();


    }
}
