package academy.learnprogramming;

public class BetterPlayer {

    private String magicName;
    private int basicHealth = 100;
    private String weapon;

    public BetterPlayer(String magicName, int basicHealth, String weapon) {
        this.magicName = magicName;
        if(basicHealth >0 && basicHealth <=100) {
            this.basicHealth = basicHealth;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.basicHealth =this.basicHealth -damage;
        if(this.basicHealth <=0){
            System.out.println("The Player is dead");
        }
    }

    public int getBasicHealth() {
        return basicHealth;
    }
}
