package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Printer myPrinter = new Printer(90, 0, false);

        myPrinter.print(10);
        myPrinter.fillUpToner(2);
        myPrinter.fillUpToner(10);

        myPrinter.print(12);
        myPrinter.print(120);

        System.out.println("Total pages = " +myPrinter.getPagesPrinted());
    }
}
