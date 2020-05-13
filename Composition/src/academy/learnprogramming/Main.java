package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions= new Dimensions(45,30,40);
        Case theCase=new Case("g4m3r", "xkom", "default", dimensions);


        Monitor theMonitor = new Monitor("g24", "lenovo", 24, new Resolution(1920, 1280));

        Motherboard theMOtherBoard = new Motherboard("56+d", "asus", 4, 2, "bio99");

        PC myPC = new PC(theCase, theMonitor, theMOtherBoard);

        myPC.getMonitor().drawPixel(50,200, "red");
        myPC.getMotherboard().loadProgram("Paint");
        myPC.getTheCase().pressPowerButton();
    }
}
