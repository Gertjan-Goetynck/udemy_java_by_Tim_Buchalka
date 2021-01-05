package udemy.buchalka;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        int myMaxIntTest = 2_147_483_647;

        System.out.println("Integer Min Value = "+myMinIntValue);
        System.out.println("Integer Max Value = "+myMaxIntValue);
        System.out.println("Busted Max Value = "+(myMaxIntValue+1));
        System.out.println("Busted Min Value = "+(myMinIntValue-1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte min value "+myMinByteValue);
        System.out.println("Byte max value "+myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short min value "+myMinShortValue);
        System.out.println("Short max value "+myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long min value "+myMinLongValue);
        System.out.println("Long max value "+myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_123L;

        long myLongValue = 100L;

        //short bigShortLiteralValue = 327645;

        int myTotal = (myMinIntValue/2);

        byte myNewByteValue = (byte) (myMinByteValue/2);

        short myNewShortValue = (short) (myMinShortValue/2);
    }
}
