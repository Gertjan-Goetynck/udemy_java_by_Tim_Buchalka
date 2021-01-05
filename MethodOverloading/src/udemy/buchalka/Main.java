package udemy.buchalka;

public class Main {

    public static void main(String[] args) {
//        int newScore = calculateScore("Gertjan",100);
//        System.out.println("New score is "+newScore);
//        calculateScore(75);
//        calculateScore();
//        double centimeters = calcFeetAndInchesToCentimeters(12);
//
//        System.out.println("12 inches is "+centimeters+"cm");
//
//        centimeters = calcFeetAndInchesToCentimeters(2,5);
//
//        System.out.println("2 feet 5 inches is "+centimeters+"cm");
        System.out.println(getDurationString(69));
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored "+score+" points");
        return score*1000;
    }
    public static int calculateScore(int score){
        System.out.println("The player scored "+score+" points");
        return score*1000;
    }
    public static int calculateScore(){
        System.out.println("The player score an unkbown amount of points");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet >= 0 && inches >= 0 && inches <=12){
            return (inches*2.54)+(feet*12*2.54);
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if(inches>=0){
            return inches*2.54;
        }
        return -1;
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes >=0 && seconds >=0){
            int totalSeconds = seconds + (60*minutes);
            int totalHours = totalSeconds / 3600;
            int totalMinutes = (totalSeconds - (totalHours*3600))/60;
            totalSeconds = totalSeconds - (totalHours * 3600) - (totalMinutes * 60);

            return totalHours+"h "+totalMinutes+"m "+totalSeconds+"s";
        }
        return "Invalid value";
    }
    public static String getDurationString(int seconds){
        if(seconds >=0){
            int minutes = seconds/60;
            seconds = seconds%60;
            return getDurationString(minutes,seconds);
        }
        return "Invalid value";
    }
}
