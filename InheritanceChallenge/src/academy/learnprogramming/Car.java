package academy.learnprogramming;

public class Car  extends Vehicle{

    private int wheels;
    private int doors;
    private double engine;
    private boolean gearBox;

    private int currentGear;

    public Car(String name, String colour, int wheels, int doors, double engine, boolean gearBox) {
        super(name, colour);
        this.wheels = wheels;
        this.doors = doors;
        this.engine = engine;
        this.gearBox = gearBox;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Current gear changed to " + this.currentGear+ " gear");
    }

    public void changeSpeed(double speed, int direction){
        move(speed,direction);
        System.out.println("Car.changeSpeed(): Speed = "+speed + " direction "+ direction);
    }


}
