package ch.wesr.prepareforjava.statements;

public class Labels {

    public static void main(String[] args) {
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 8, 8, 9}, {5, 7, 12, 9}};
        ouTer_loop: for (int[] mySimpleArray: myComplexArray) {
            INNER_LOOP: for (int i=0; i<mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] +"\t");
            }
            System.out.println();
        }
    }
}
