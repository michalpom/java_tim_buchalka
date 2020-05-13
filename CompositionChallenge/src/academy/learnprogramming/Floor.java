package academy.learnprogramming;

public class Floor {
    private String material;
    private Dimensions dimensions;

    public Floor(String material, Dimensions dimensions) {
        this.material = material;
        this.dimensions = dimensions;
    }

    public void addFloor(){
        System.out.println("Floor added");
    }
}
