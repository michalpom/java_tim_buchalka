package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore=calculateScore("Mike", 12);
        System.out.println("Combo score = "+newScore);
        calculateScore(25);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player name: " +playerName+ " Score: "+score);
        return score*100;
    }
    public static int calculateScore(int score){
        System.out.println("Player X Score: "+score);
        return score*100;
    }
    public static int calculateScore(){
        System.out.println("No score!");
        return 0;
    }
}
