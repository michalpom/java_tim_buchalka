package academy.learnprogramming;

public class Room {
    private String name;
    private Floor floor;
    private Door door;
    private ClassWindow window;

    public Room(String name,Floor floor, Door door, ClassWindow window) {
        this.name=name;
        this.floor = floor;
        this.door = door;
        this.window = window;
    }

    public void createRoom(){
        floor.addFloor();
        door.addDoor();
        window.addWindow();
        roomConfirm();
    }

    private void roomConfirm(){
        System.out.println(name+" was created");
    }
}
