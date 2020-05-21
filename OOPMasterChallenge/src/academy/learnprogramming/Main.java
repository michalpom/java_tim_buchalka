package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BasicBurger myBurger = new BasicBurger("classic", "beef", 10.99);

        myBurger.addAddition("lettuce", 0);
        myBurger.addAddition("tomato", 4);
        myBurger.addAddition("cheese", 3);
        myBurger.addAddition("bacon", 2);

        System.out.println("Total price: "+myBurger.summary());
        System.out.println("---------------------");

        HealthyBurger healthyBurger = new HealthyBurger("chicken", 12.99);
        healthyBurger.addAddition("bacon", 1);
        healthyBurger.addAddition("dffbacon", 1);
        healthyBurger.addHealthyItem(2);
        double price= healthyBurger.summary();
        System.out.println("Total price: "+price);
        System.out.println("---------------------");


        DeluxeBurger deluxe = new DeluxeBurger();
        deluxe.addAddition("tomato",2);
        System.out.println("Total price: "+deluxe.summary());
        System.out.println("---------------------");

    }
}
