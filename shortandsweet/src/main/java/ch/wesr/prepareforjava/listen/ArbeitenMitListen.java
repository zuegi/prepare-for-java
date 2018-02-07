package ch.wesr.prepareforjava.listen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArbeitenMitListen {


    public static void main(String[] args) {
        List<String> liste = new ArrayList<String>(Arrays.asList("EINS", "ZWEI", "DREI"));
        System.out.println("Liste.size: " + liste.size());
        for(int i = 0; i < liste.size(); i++) {
            System.out.println(i +" ) " +liste.get(i));
        }
    }

}
