package ch.wesr.prepareforjava.operators;

import java.util.Random;

public class Vergleiche {

    public static void main(String[] args) {
        vergleicheNummerischeTypen();
        vergleicheBoolean();
        vergleiche2Strings();
        vergleiche2Objekte();
    }

    private static void vergleiche2Objekte() {
        Random r = null;

        if(r == null) {
            System.out.println("hoho, r wurde noch nicht initalisiert und hat einen null Wert");
        }
    }

    private static void vergleiche2Strings() {
        String a = "Toller Hecht";
        String b = "Toller Hecht";
        if( a == b) {
            System.out.println("Wow, was für ein " +a);
        }

    }

    private static void vergleicheBoolean() {
        boolean x = true;
        boolean y = true;

        if (x == y) {
            System.out.println("ok, x=" +x +" und y=" +y +" sind identisch");
        }
    }

    private static void vergleicheNummerischeTypen() {
        int x = 5;
        double y = 5.00;
        if(x == y ){
            System.out.println(x +" ist gleichwertig wie " + y +" , weil x zu einem double typ befördert wird");
        }
    }
}
