package udemy.buchalka;

public class Main {

    public static void main(String[] args) {
//        System.out.println(sumDigits(2));
        //System.out.println(isPalindrome(-22));
        //System.out.println(sumFirstAndLastDigit(5));
//        System.out.println(evenDigitSum(102));
        //System.out.println(reverse(100));
        numberToWords(1230);
    }

//    private static int sumDigits(int number){
//        if(number >=10){
//            int sum = 0;
//            while(number>0){
//                // LEAST SIGNIFICANT DIGIT IS NUMBER%10
//                sum += number%10;
//                //DROP THE LEAST SIGNIFCANT DIGIT
//                number /= 10;
//            }
//            return sum;
//        }
//        return -1;
//    }
//    public static boolean isPalindrome(int number){
//        int reverse = 0;
//        number = Math.abs(number);
//        System.out.println(number);
//        int originalNumber = number;
//        while(number >0){
//            int lastDigit = number%10;
//            reverse *=10;
//            reverse += lastDigit;
//            number/=10;
//        }
//        if(reverse == originalNumber){
//            return true;
//        }
//        return false;
//    }

//    public static int sumFirstAndLastDigit(int number){
//        if(number>=0){
//            int counter = 0;
//            int firstDigit = 0;
//            int lastDigit = 0;
//            while(number>=0){
//                counter++;
//                int digit = number%10;
//                if(counter == 1){
//                    firstDigit = digit;
//                }
//                number /= 10;
//                if(number == 0){
//                    lastDigit = digit;
//                    break;
//                }
//            }
//            return firstDigit + lastDigit;
//        }
//        return -1;
//    }
//    public static int evenDigitSum(int number){
//        if(number>=0){
//            int sum = 0;
//            while(number>0){
//                int digit = number%10;
//                if(digit%2==0){
//                    sum += digit;
//                }
//                number/=10;
//            }
//            return sum;
//        }
//        return -1;
//    }

//    public static boolean hasSharedDigit(int number1, int number2){
//        if(number1 >= 10 && number1 <=99 && number2 >=10 && number2 <= 99 ){
//            int number1Second = number1%10;
//            int number1First = number1/10;
//            int number2First = number2%10;
//            int number2Second = number2/10;
//
//            if(number1First == number2First || number1First == number2Second || number1Second == number2First || number1Second == number2Second){
//                return true;
//            }
//        }
//        return false;
//    }

//    public static boolean hasSameLastDigit(int number1, int number2, int number3){
//        int lastDigit1 = number1%10;
//        int lastDigit2 = number2%10;
//        int lastDigit3 = number3%10;
//
//        if(isValid(number1) && isValid(number2) && isValid(number3) && (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3) ){
//            return true;
//        }
//
//        return false;
//    }
//
//    public static boolean isValid(int number){
//        if(number >= 10 && number <= 1000){
//            return true;
//        }
//        return false;
//    }

//    public static int getGreatestCommonDivisor(int first, int second){
//        if(first >= 10 && second >=10){
//            int biggestNumber = 0;
//            int smallestNumber = 0;
//            if(first > second){
//                biggestNumber = first;
//                smallestNumber = second;
//            } else{
//                biggestNumber = second;
//                smallestNumber = first;
//            }
//
//            for(int i= smallestNumber; i >=1; i-- ){
//                if(biggestNumber%i==0 && smallestNumber%i==0){
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }

//    public static void printFactors(int number){
//        if(number < 1){
//            System.out.println("Invalid Value");
//        }
//
//        for(int i = 1; i<=number;i++){
//            if(number%i==0){
//                System.out.println(i);
//            }
//        }
//    }

//    public static boolean isPerfectNumber(int number){
//        int sum = 0;
//
//        for(int i = 1; i<number;i++){
//            if(number%i ==0){
//                sum += i;
//            }
//        }
//
//        if(number>1 && number == sum){
//            return true;
//        }
//        return false;
//    }

    public static void numberToWords(int number){
        int reversedNumber = reverse(number);
        int reversedNumberCopy = reversedNumber;
        if(number < 0){
            System.out.println("Invalid Value");
        }else{
            while(reversedNumber>=0){
                int digit = reversedNumber%10;
                reversedNumber /= 10;
                switch (digit){
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 0:
                        System.out.println("Zero");
                        break;
                }
                if(reversedNumber == 0){
                    break;
                }
            }
            if(getDigitCount(reversedNumberCopy) != getDigitCount(number)){
                int digitCountDifference = getDigitCount(number)-getDigitCount(reversedNumberCopy);
                for(int i = 0; i<digitCountDifference; i++){
                    System.out.println("Zero");
                }
            }
        }

    }

    public static int reverse(int number){
        int reversed = 0;
        boolean negative =  number<0;
        number = Math.abs(number);
        while(number>0){
            int digit = number%10;
            number = number/10;
            reversed += digit;
            if(number ==0){
                break;
            }
            reversed*=10;
        }
        return negative? reversed*-1:reversed;
    }

    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        int amount = 0;
        while(number>=0){
            amount++;
            number/=10;
            if(number==0){
                break;
            }
        }
        return amount;
    }

}
