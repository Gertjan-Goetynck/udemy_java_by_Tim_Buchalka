package udemy.buchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
//        int minNumber = 0;
//        int maxNumber = 0;
        boolean firstNumber = true;
        while(true){
            System.out.println("Please enter a number:");
            boolean isNumber = scanner.hasNextInt();
            if(isNumber){
                int number = scanner.nextInt();
//                if(firstNumber){
//                    minNumber = number;
//                    maxNumber = number;
//                    firstNumber = false;
//                }
                if(number > maxNumber){
                    maxNumber = number;
                }
                if(number <minNumber){
                    minNumber = number;
                }
            }
            else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("The minimum number was "+minNumber+" and the maximum number was "+maxNumber);
        scanner.close();
    }
}
