package ch.wesr.prepareforjava.operators;

public class Promotion {
    static short x = Short.MAX_VALUE;

    public static void main(String[] args) {
        byte a = Byte.MAX_VALUE;
        short b = Short.MAX_VALUE;
        int c =  Integer.MAX_VALUE;
        long d = Long.MAX_VALUE;
        float e =Float.MAX_VALUE;
        double f = Double.MAX_VALUE;
        char g = Character.MAX_VALUE;

        System.out.println("byte: " +a);
        System.out.println("short: " +b);
        System.out.println("int: " +c);
        System.out.println("long: " +d);
        System.out.println("float: " +e);
        System.out.println("double: " +f);
        System.out.println("char: " +g);
        System.out.println("*********************************");

        float fl = 9.01234f;
        System.out.println("fl: " +fl);
        int in = (int) fl;
        System.out.println("in: " +in);

        short sh = (short) 1921222;
        System.out.println("sh: " +sh);
    }
}
