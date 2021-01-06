package udemy.buchalka;

public class Main {

    public static void main(String[] args) {
//        String numberAsString = "2018";
//        System.out.println("NumberAsString = "+numberAsString);
//
//        int number = Integer.parseInt(numberAsString);

        //System.out.println(canPack(5,1,5));
        printSquareStar(50);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){

        int bigTotalKg = 5*bigCount;
        int smallTotalKg = smallCount;

        if(bigTotalKg > goal){
            while(bigTotalKg > goal){
                bigTotalKg -= 5;
            }
        }
        System.out.println(bigTotalKg);
        return bigTotalKg + smallTotalKg >= goal;

    }

    public static int getLargestPrime(int number){
        if(number > 1){
            for(int i = number-1; number>=2; i--){
                if(number % i == 0){
                    number = i;
                }
            }
            return number;
        }
        return -1;
    }

    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
        }else{
            int numCols = number;
            int numRows = number;

            for(int row = 1; row<=numRows;row++){
                for(int col = 1; col <= numCols; col++){
                    if(row == 1 || row == numRows || col == 1 || col == numCols || row == col || (col == (numRows - row + 1))){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
