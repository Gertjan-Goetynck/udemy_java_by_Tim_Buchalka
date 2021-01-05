package udemy.buchalka;

public class Main {

    public static void main(String[] args) {
//        int highScore = calculateScore(true, 800, 5,100);
//        System.out.println("Your final score was "+highScore);

           int position = calculateHighScorePosition(500);
           displayHighScorePosition("Gertjan",position);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int  bonus){
        if(gameOver){
            int finalScore = score+(levelCompleted*bonus);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position "+position+" in the high score table.");
    }

    public static int calculateHighScorePosition(int score){
        int position = 4;

        if(score>=1000){
            position = 1;
        } else if(score>=500){
            position = 2;
        } else if(score >=100){
            position = 3;
        }

        return position;
    }
}
