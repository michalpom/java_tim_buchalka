package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(2.2,5.6));
        System.out.println(calcFeetAndInchesToCentimeters(12.1));
        System.out.println(calcFeetAndInchesToCentimeters(-2.2,5.6));
        System.out.println(calcFeetAndInchesToCentimeters(2.2,-5.6));
        System.out.println(calcFeetAndInchesToCentimeters(2.2,13));
        System.out.println(calcFeetAndInchesToCentimeters(-12.1));

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
     if (feet>=0 && (inches>=0 && inches<=12)) {
         return ((feet*12)+inches)*2.54;
    }
     else{
         System.out.println("Invalid parameters");
         return -1;
     }
    }
    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if (inches>=0) {
            return (inches)*2.54;
        }
        else{
            System.out.println("Invalid parameters");
            return -1;
        }
    }
}
