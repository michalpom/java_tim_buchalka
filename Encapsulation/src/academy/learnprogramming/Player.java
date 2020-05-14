package academy.learnprogramming;

public class Player {

    public String magicName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health=this.health-damage;
        if(this.health<=0){
            System.out.println("The Player is dead");
        }
    }

    public int currentHealth(){
        return this.health;
    }
}
