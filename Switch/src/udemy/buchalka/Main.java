package udemy.buchalka;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if(value == 1){
            System.out.println("Value was 1");
        } else if(value == 2){
            System.out.println("Value was 2");
        } else{
            System.out.println("Value was 1 nor 2");
        }

        int switchValue = 3;
        switch (switchValue){
            case 1:
                System.out.println("Switchvalue equals 1");
                break;
            case 2:
                System.out.println("Switchvalue equals 2");
                break;
            case 3:
                System.out.println("Switchvalue equals 3");
                break;
            default:
                System.out.println("Switchvalue was not 1, 2 or 3");
        }

        char character = 'Q';
        switch (character){
            case 'A':
                System.out.println("You had A");
                break;
            case 'B':
                System.out.println("You had B");
                break;
            case 'C':
                System.out.println("You had C");
                break;
            default:
                System.out.println("Letter not found");
        }

    }
}
