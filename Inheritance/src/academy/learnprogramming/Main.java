package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Animal animal=new Animal("Steve", 1, 1, 2, 2);
        Dog dog=new Dog("Max", 5, 10, 2,4, 2, "short");

        dog.eat();
        dog.walk();
        dog.run();
    }
}
