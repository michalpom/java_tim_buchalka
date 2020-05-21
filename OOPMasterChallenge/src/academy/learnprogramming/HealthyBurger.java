package academy.learnprogramming;

public class HealthyBurger extends BasicBurger {

    private int healthyItem;
    private double healthyItemPrice=5.99;

    public HealthyBurger(String meat, double price) {
        super("brown", meat, price);
    }

    public void addHealthyItem(int count){
        this.healthyItem=count;
        System.out.println("Added healthy item: "+count );
    }

    @Override
    public double summary() {
        double currentPrice = super.summary(); //returns basic burger price
        currentPrice+=healthyItem*healthyItemPrice;

        return currentPrice;

    }
}
