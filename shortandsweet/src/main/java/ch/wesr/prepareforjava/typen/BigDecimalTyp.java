package ch.wesr.prepareforjava.typen;

import java.math.BigDecimal;

public class BigDecimalTyp {


    public static void main(String[] args) {

        BigDecimal limite = new BigDecimal(3000);


        BigDecimal gegenwert = new BigDecimal(3001);
        BigDecimal gegenwert1 = new BigDecimal(2009);
        BigDecimal gegenwert2 = new BigDecimal(3000);

        printVal(limite, gegenwert);
        printVal(limite, gegenwert1);
        printVal(limite, gegenwert2);
        System.out.println("*************************");

        printVal2(limite, gegenwert);
        printVal2(limite, gegenwert1);
        printVal2(limite, gegenwert2);


    }

    private static void printVal2(BigDecimal limite, BigDecimal gegenwert) {
        int val = gegenwert.compareTo(limite);
        if(val <= 0) {
            System.out.println("Gegenwert (" +gegenwert +") ist kleiner oder identisch mit limite: " +gegenwert +" == " +limite);
        } else {
            System.out.println("Gegenwert (" +gegenwert +") ist groesser als limite: " +gegenwert +" > " +limite);
        }
//        if(val > 0 ) {
//            System.out.println("Gegenwert (" +gegenwert +") ist groesser als limite: " +gegenwert +" > " +limite);
//        }
    }

    private static void printVal(BigDecimal limite, BigDecimal gegenwert) {
        int val = gegenwert.compareTo(limite);
        if(val == 0) {
            System.out.println("Gegenwert (" +gegenwert +") ist identisch mit limite: " +gegenwert +" == " +limite);
        }
        if(val < 0){
            System.out.println("Gegenwert (" +gegenwert +") ist kleiner als limite: " +gegenwert +" < " +limite);
        }
        if(val > 0) {
            System.out.println("Gegenwert (" +gegenwert +") ist groesser als limite: " +gegenwert +" > " +limite);
        }
    }
}
