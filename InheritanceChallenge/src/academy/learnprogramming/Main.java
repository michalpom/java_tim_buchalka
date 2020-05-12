package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BMW e46=new BMW("black", 12);
        e46.steer(45);
        e46.accelerate(5);
        e46.accelerate(20);
        e46.accelerate(20);
        e46.accelerate(-25);
        e46.accelerate(-20);
    }
}
