package ch.wesr.prepareforjava.operators;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

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

        castingProblem();
        zusammengesetzterOperator();
        komischeZuweisung();
        relationaleOperatoren();
        instanceOf();
    }

    public static void instanceOf(){
        System.out.println("****** instanceof");
        String a = "a";
        System.out.println(a instanceof String);
    }

    public static void relationaleOperatoren() {
        System.out.println("****** Relationale Operatoren");
        int x = 10, y = 20, z = 10;
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x >= z);
        System.out.println(x > z);
    }

    public static void komischeZuweisung(){
        System.out.println("**** komische Zuweisung");
        long x = 5;
        long y = (x=3);
        System.out.println("y: " +y);
        System.out.println("x: " +x);
    }

    public static void zusammengesetzterOperator() {
        System.out.println("**** Zusammengesetzter Operator");
        long x = 10;
        int y = 5;
        x *= y;
        System.out.println("x *= y => " +x);
    }


    public static void castingProblem() {
        System.out.println(" ***** Casting Problem");
        long x = 10;
        int y = 5;
        // y = y * x;       // kompiliert nicht
        y = (int) (y * x);  // kompiliert
        System.out.println("y: " +y);
    }
}
