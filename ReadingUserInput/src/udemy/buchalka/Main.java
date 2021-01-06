package udemy.buchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int birthyear = scanner.nextInt();
            scanner.nextLine(); //Handle next line character
            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            int age = 2020 - birthyear;
            if(age >= 0 && age <=100){
                System.out.println("Your name is "+name+ " and you are " + age + " years olds");
            }else{
                System.out.println("Invalid Value");
            }
        }else{
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();
    }
}
