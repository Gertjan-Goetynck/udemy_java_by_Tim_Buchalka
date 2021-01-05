package udemy.buchalka;

public class Main {

    public static void main(String[] args) {
	    byte myByte = 100;
	    short myShort = 20;

	    int myInt = 100000;

	    long myTotal = 5000000L + (10L*(myByte+myShort+myInt));

        System.out.println(myTotal);
    }
}
