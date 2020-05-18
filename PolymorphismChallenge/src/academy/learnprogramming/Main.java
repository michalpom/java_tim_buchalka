package academy.learnprogramming;

class Car{
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels=4;
        this.engine=true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Car class - startEngine()";
    }

    public String accelerate(){
        return "Car class - accelerate()";
    }

    public String brake(){
        return "Car class - brake()";
    }
}

class BMW extends Car{
    public BMW(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "BMW class - startEngine()";
    }

    @Override
    public String accelerate() {
        return "BMW class - accelerate()";
    }

    @Override
    public String brake() {
        return "BMW class - brake()";
    }
}
class Seat extends Car{
    public Seat(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Seat class - startEngine()";
    }

    @Override
    public String accelerate() {
        return "Seat class - accelerate()";
    }

    @Override
    public String brake() {
        return "Seat class - brake()";
    }
}

class Audi extends Car{
    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " class - startEngine()"; //getting class name
    }

    @Override
    public String accelerate() {
        return "Audi class - accelerate()";
    }

    @Override
    public String brake() {
        return "Audi class - brake()";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car car = new Car("Base car", 4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        BMW bmw = new BMW("e46", 8);
        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());

        Audi audi = new Audi("a4", 6);
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

        Seat seat = new Seat("Ibiza", 3);
        System.out.println(seat.startEngine());
        System.out.println(seat.accelerate());
        System.out.println(seat.brake());
    }


}
