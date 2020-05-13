package academy.learnprogramming;

public class Door {

    private String material;
    private int number;
    private Dimensions dimensions;

    public Door(String material, int number, Dimensions dimensions) {
        this.material = material;
        this.number = number;
        this.dimensions = dimensions;
    }

    public void addDoor(){
        System.out.println("Door added");
    }
}
