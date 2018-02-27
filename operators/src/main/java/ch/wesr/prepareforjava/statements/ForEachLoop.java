package ch.wesr.prepareforjava.statements;

public class ForEachLoop {

    public static void main(String[] args) {
        firstLoop();
        secondLoop();
        thirdLoop();
    }

    private static void thirdLoop() {
        System.out.println("\nthirdLoop");
        String[] names = {"Hans", "Paul", "Peter", "Kurt"};

        for(String name : names) {
            System.out.print(name +" ");
        }

        for(int i=0; i > names.length; i++) {
            String name = names[i];
            System.out.print(name +" ");
        }
    }

    private static void secondLoop() {
        System.out.println("\nsecondLoop");
        String[] names = new String[3];
        for(String name: names) {
            System.out.print(name +" ");
        }
    }

    private static void firstLoop() {
        String[] names = {"Hans", "Paul", "Peter", "Kurt"};
        for(String name : names) {
            System.out.print(name +" ");
        }
    }
}
