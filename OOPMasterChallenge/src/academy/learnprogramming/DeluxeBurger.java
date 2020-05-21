package academy.learnprogramming;

public class DeluxeBurger  extends BasicBurger{

    public DeluxeBurger() {
        super("white", "double beef", 16.99);
        super.fries(1);
        super.lemonade(1);
    }

    @Override
    public void addAddition(String name, int count) {
        System.out.println("Cannot add anything to a deluxe burger");
    }
}
