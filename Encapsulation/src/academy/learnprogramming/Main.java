package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//        Player newPlayer=new Player();
//
//        newPlayer.name="Mike";
//        newPlayer.health=50;
//        newPlayer.weapon="knife";
//
//        int damage = 30;
//        newPlayer.loseHealth(damage);
//        System.out.println("Health = " +newPlayer.currentHealth());
//
//        newPlayer.loseHealth(damage);
//        System.out.println("Health = " +newPlayer.currentHealth());

        BetterPlayer player= new BetterPlayer("Magic Mike", 150, "knife");
        System.out.println("Health = " + player.getBasicHealth());
    }
}
