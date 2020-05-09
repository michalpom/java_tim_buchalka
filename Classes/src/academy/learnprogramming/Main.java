package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car();
        Car olaCar = new Car();

        myCar.setModel("BMW e46");
        olaCar.setModel("Duży matowy i hybrydowy");
        System.out.println("My car model is " +myCar.getModel());
        System.out.println("Ola's car is " + olaCar.getModel());


    }
}
