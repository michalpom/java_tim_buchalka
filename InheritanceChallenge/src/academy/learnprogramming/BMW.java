package academy.learnprogramming;

public class BMW extends Car {
    private int roadServiceMonths;

    public BMW( String colour, int roadServiceMonths) {
        super("BMW", colour, 4, 5, 2.5, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        double newSpeed = getSpeed()+ rate;
        if (newSpeed==0){
            stop();
            changeGear(1);
        }else if (newSpeed>0 && newSpeed<10){
            changeGear(1);
        }else if (newSpeed>10 && newSpeed<=20){
            changeGear(2);
        }else if (newSpeed>20 && newSpeed<=30){
            changeGear(3);
        }else{
            changeGear(4);
        }

        if(newSpeed>0){
            changeSpeed(newSpeed, getDirection());
        }
    }
}
