package udemy.buchalka;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float Min value "+myMinFloatValue);
        System.out.println("Float Max value "+myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double Min value "+myMinDoubleValue);
        System.out.println("Double Max value "+myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5/3f;
        double myDoubleValue = 5/3;

        System.out.println("MyIntValue =" + myIntValue);
        System.out.println("MyFloatValue =" + myFloatValue);
        System.out.println("MyDoubleValue =" + myDoubleValue);


        double poundsToKg = calculateKg(100);
        double kgToPounds = calculatePound(20);

        System.out.println(kgToPounds);
    }

    static double calculatePound(double kg){
        return kg/0.45359237d;
    }

    static double calculateKg(double pound){
        return pound*0.45359237d;
    }
}
