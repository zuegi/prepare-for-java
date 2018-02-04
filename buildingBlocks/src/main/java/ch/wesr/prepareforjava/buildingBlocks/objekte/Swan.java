package ch.wesr.prepareforjava.buildingBlocks.objekte;

public class Swan {

    int numberEggs;     // instanz variable

    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 2;      // setze die Variable

        System.out.println("Der Schwan hat " + mother.numberEggs);
    }
}
