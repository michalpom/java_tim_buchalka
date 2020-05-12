package academy.learnprogramming;

public class Fish extends Animal {

    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }
    private void swim(int speed){
        System.out.println("Fish is swimming");
        moveBackFin();
        super.move(speed);
    }

    private void moveBackFin(){

    }
}
