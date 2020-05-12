package academy.learnprogramming;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int ears;
    private String coat;


    public Dog(String name, int size, int weight, int ears, int legs, int eyes, String coat) {
        super(name, 1, 1, size, weight); //super --call the constructor of the class we extends from
        this.ears=ears;
        this.eyes=eyes;
        this.legs=legs;
        this.coat=coat;
    }

    private void chew(){
        System.out.println("Chewing.");
    }

    @Override
    public void eat() {
        this.chew();
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getEars() {
        return ears;
    }

    public String getCoat() {
        return coat;
    }
}
