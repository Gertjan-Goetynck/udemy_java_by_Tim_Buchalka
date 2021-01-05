package udemy.buchalka;

public class Main {

    public static void main(String[] args) {
        boolean gameover = true;
	    int score = 800;
	    int levelCompleted = 5;
	    int bonus = 100;

	    if(gameover){
	        int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was "+finalScore);

            score = 1000;
            levelCompleted = 8;
            bonus = 200;
            finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was "+finalScore);
        }
    }
}
