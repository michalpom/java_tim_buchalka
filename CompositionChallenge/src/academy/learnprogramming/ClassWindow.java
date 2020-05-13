package academy.learnprogramming;

public class ClassWindow {

    private String material;
    private int number;
    private Dimensions dimensions;

    public ClassWindow(String material, int number, Dimensions dimensions) {
        this.material = material;
        this.number = number;
        this.dimensions = dimensions;
    }

    public void addWindow(){
        System.out.println("Window added");
    }
}
