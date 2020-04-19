package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = calculatedScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + finalScore);
        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = calculatedScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + finalScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Mike", position);
        position = calculateHighScorePosition(900);
        displayHighScorePosition("Tim", position);
        position = calculateHighScorePosition(400);
        displayHighScorePosition("Lucas", position);
        position = calculateHighScorePosition(50);
        displayHighScorePosition("Ed", position);
    }

    public static int calculatedScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;


    }

    public static int calculateHighScorePosition(int score) {
//        if (score>=1000){
//            return 1;
//        }else if (score>=500 && score<1000){  //score<1000 is always true
//            return 2;
//        }else if (score>=100 && score<500){
//            return 3;
//        }else {
//            return 4;
//        }
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500 && score < 1000) {  //score<1000 is always true
            position = 2;
        } else if (score >= 100 && score < 500) {
            position = 3;
        }
        return position;

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }
}
