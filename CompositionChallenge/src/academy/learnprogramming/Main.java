package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Room myRoom = new Room("Mike's room",new Floor("wood", new Dimensions(2000,2000)),
                new Door("metal", 1, new Dimensions(100, 220)),
                new ClassWindow("plastic", 2, new Dimensions(100,100)));

        myRoom.createRoom();
    }
}
