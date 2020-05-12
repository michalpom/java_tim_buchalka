package academy.learnprogramming;

public class Vehicle {

    private String name;
    private String colour;

    private double speed;
    private int direction;

    public Vehicle(String name, String colour) {
        this.name = name;
        this.colour = colour;
        this.speed=0;
    }

    public void steer(int direction){
        this.direction+=direction;
        System.out.println("Heading at " +direction + " degrees");
    }

    public void move(double speed, int direction){
        this.speed=speed;
        this.direction=direction;
        System.out.println("Moving at " + direction+ " degrees, with speed ="+speed);
    }

    public void stop(){
        speed=0;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public double getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }
}
