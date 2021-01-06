package udemy.buchalka;

public class Main {

    public static void main(String[] args) {
//        int amount = 10000;
//        for(int i = 8; i >= 2; i--){
//            System.out.println("The interest for "+amount+" EUR at an interest rate of "+i+" is "+String.format("%.2f",calculateInterest(amount,i)));
//        }
        printPrimesUpToValue(60);
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }

        for(int i = 2; i <= n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void printPrimesUpToValue(int value){
        int amountOfPrimes = 0;
        for(int i = 2; i <= value; i++){
            if(isPrime(i)){
                amountOfPrimes++;
                System.out.println(i+" is a prime number.");
                if(amountOfPrimes == 3){
                    break;
                }
            }
        }
    }
}
