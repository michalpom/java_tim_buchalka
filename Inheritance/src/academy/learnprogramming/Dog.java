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

    private void legsMove(int speed){
        System.out.println("legs are moving, dog doesn't know what is going on");
        System.out.println("Legs' speed = " +speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("method from Dog class called");
        legsMove(speed);

    }

    public void walk(){
        System.out.println("Dog is walking");
        super.move(5); //super from superclass
    }
    public void run(){
        System.out.println("Dog is running");
        move(20); //method from this class because without super. If without method move() in this class it will search in superclass
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
