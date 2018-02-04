package ch.wesr.prepareforjava.buildingBlocks.objekte;

public class Name {
    static String first = "René";
    static String last = "Weishaupt";
    static String full = first +" " +last;

    public static void main(String[] args) {
        System.out.println("Hallo " +full);
    }
}
