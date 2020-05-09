package academy.learnprogramming;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //getters and setters are good to validate data

    public void setModel(String model){
        //String validModel=model.toLowerCase();

        //this is used when you're referring to the filed of the class
        this.model=model;
    }
    public String getModel(){
        return this.model; //just to be sure we are returning field
    }

}
