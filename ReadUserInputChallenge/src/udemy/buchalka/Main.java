package udemy.buchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberIndex = 1;
        int sum = 0;
        while(numberIndex <= 10){
            System.out.println("Fill in number "+numberIndex+":");
            boolean hasInt = scanner.hasNextInt();
            if(hasInt){
                sum += scanner.nextInt();
                numberIndex++;
            }else{
                System.out.println("Invalid number");
            }
            scanner.nextLine(); //Handle end of line

        }
        scanner.close();
        System.out.println("The sum is "+sum);
    }
}
