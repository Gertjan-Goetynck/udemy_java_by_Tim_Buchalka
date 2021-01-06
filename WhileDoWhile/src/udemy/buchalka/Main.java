package udemy.buchalka;

public class Main {

    public static void main(String[] args) {
//	    int count = 0;
//	    while(count != 6){
//            System.out.println("Count value is "+count);
//            count++;
//        }
//        count = 0;
//	    while(true){
//	        if(count == 6){
//	            break;
//            }
//            System.out.println("Count value is "+count);
//            count++;
//        }
//
//	    count = 0;
//
//        do{
//            System.out.println("Count value is "+count);
//            count++;
//        }while(count < 6);

        int number = 4;
        int finishNumber = 20;
        int evenNumberCounter = 0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            evenNumberCounter++;
            System.out.println("Even number "+number);
            if(evenNumberCounter == 5){
                break;
            }
        }

    }
    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }

}
