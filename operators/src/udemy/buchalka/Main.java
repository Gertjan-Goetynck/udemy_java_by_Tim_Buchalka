package udemy.buchalka;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;

        System.out.println("1 + 2 = "+result);
        int previousResult = result;
        System.out.println("Previousresult = "+previousResult);
        result -= 1;
        System.out.println("result = "+result);
        System.out.println("Previousresult = "+previousResult);
        result *= 10;
        System.out.println("Result = "+result);
    }
}
