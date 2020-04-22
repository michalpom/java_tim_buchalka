package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2020";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);  //class Integer
        System.out.println("number = "+number);

        numberAsString +=1;
        number+=1;
        System.out.println("nAS = " +numberAsString);
        System.out.println("n = " +number);

        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println("doubleNumber = " + doubleNumber);
    }
}
