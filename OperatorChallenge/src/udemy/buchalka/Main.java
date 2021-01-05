package udemy.buchalka;

public class Main {

    public static void main(String[] args) {
        double valueOne = 20d;
        double valueTwo = 80d;
        double result = (valueOne + valueTwo) * 100;
        int remainder = (int)result % 40;

        boolean remainderIsZero = remainder == 0;

        System.out.println(remainderIsZero);

        if(!remainderIsZero){
            System.out.println("Got some remainder");
        }
    }
}
