public class Hello {
    public static void main(String[] args){
        sayHi();
        sayHi("Gertjan");
    }

    static void sayHi(String name){
        System.out.println("Hello "+name);

        int myFirstNumber = 69;

        int mySecondNumber = 12;
        int myThirdNumber = 6;

        int myFourthNumber = mySecondNumber + myThirdNumber;
    }

    static void sayHi(){
        System.out.println("Hello world");
    }
}
