package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //creating an instance of Scanner

        System.out.println("Enter the year of the birth:");
        int year =scanner.nextInt(); //reading string and converting it to integer
        int age= 2020-year;
        scanner.nextLine(); //handling next line character (enter key), it must be after reading int by nextInt()

        System.out.println("Enter a name: ");
        String name = scanner.nextLine(); //calling the method nextLine()


        System.out.println("Name: "+name);
        System.out.println("Age: "+age);

        if (age>18){
            System.out.println("You are an adult, you can drink alcohol!");
        }

        scanner.close();


    }
}
