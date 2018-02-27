package ch.wesr.prepareforjava.operators;

public class Modulus {

    private static int[] divisor = {1,2,3,4,5,6,7,8,9};
    private static int max = 100;
    private static int dividend = 10;

    public static void main(String[] args) {
        for (int i : divisor) {
            for(dividend = 10; dividend <= max; dividend++) {
                System.out.println(dividend + "%" + i + " => " + dividend % i);
            }
        }
    }
}
