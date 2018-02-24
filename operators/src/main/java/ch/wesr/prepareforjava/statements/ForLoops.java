package ch.wesr.prepareforjava.statements;

import java.util.Date;

public class ForLoops {

    public static void main(String[] args) {
//        infiniteLoop();   // kompiliert und läuft, will ich aber nicht ausführen
        mehrereBedingungen();
//        erneutesDeklarieren(); // kompiliert gar nicht erst, weil x 2 mal deklariert mit unterschiedlichen Datentype
        richtigesDeklarieren();
//         inkompatibleTypen();  // kompiliert nicht, weil 2 verschiedene Datentypen
    }

//    private static void inkompatibleTypen() {
//        for(long y = 0, int x = 4; x < 5 && y < 10; x++, y++ ) {
//            System.out.print(x +" ");
//        }
//    }

    private static void richtigesDeklarieren() {
        System.out.println("\nrichtigesDeklarieren");
        int x = 0;
        int y = 0;

        for(y = 0, x = 4; x < 5 && y < 10; x++, y++ ) {
            System.out.print(x +" ");
        }
    }

    /*
    private static void erneutesDeklarieren() {
        int x = 0;
        for(long y = 0, x = 4; x < 5 && y > 10; x++, y++ ) {

            System.out.println(x +" ");

        }
    }
    */

    private static void mehrereBedingungen() {
        System.out.println("\nMehrere Bedingungen");
        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y +" ");
        }
    }

    private static void infiniteLoop() {
        for (; ; ) {
            System.out.print(new Date() + " Unendliche Schleife");
        }
    }
}
