package academy.learnprogramming;

public class BasicBurger {
    private String breadRollType;
    private String meat;
    private double price;

    private int lettuce;
    private double lettucePrice=2.0;
    private int tomato;
    private double tomatoPrice=2.0;
    private int cheese;
    private double cheesePrice=3.0;
    private int bacon;
    private double baconPrice = 4.0;
    private String sauce;


    public BasicBurger(String breadRollType, String meat, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addAddition(String name, int count){
        if(count==0){
            System.out.println("No " + name);
        }else{
        switch (name) {
            case "lettuce":
                price += lettucePrice * count;
                lettuce += count;
                confirmAdding(name);
                break;
            case "tomato":
                price += tomatoPrice * count;
                tomato += count;
                confirmAdding(name);
                break;
            case "cheese":
                price += cheesePrice * count;
                cheese += count;
                confirmAdding(name);
                break;
            case "bacon":
                price += baconPrice * count;
                bacon += count;
                confirmAdding(name);
                break;
            default:
                System.out.println("Addition not recognised");
        }
        }
    }

    public void fries(int count){
        price+=count*6;
        System.out.println(count+" fries added");
    }

    public void lemonade(int count){
        price+=count*6;
        System.out.println(count+" lemonade added");
    }


    private void confirmAdding(String name){
        System.out.println(name+" added.");
    }

    public double summary(){
        System.out.println("****************");
        System.out.println("Your hamburger:");
        System.out.println("Bread roll: " + breadRollType);
        System.out.println("Meat: "+ meat);
        System.out.println("Additions:");
        System.out.println("Lettuce: " + lettuce + " Price: " + (lettucePrice*lettuce));
        System.out.println("Tomato: " + tomato + " Price: " + (tomatoPrice*tomato));
        System.out.println("Cheese: " + cheese + " Price: " + (cheesePrice*cheese));
        System.out.println("Bacon: " + bacon + " Price: " + (baconPrice*bacon));
        System.out.println("****************");
        //System.out.println("Total price: "+ price );

        return price;
    }

}
