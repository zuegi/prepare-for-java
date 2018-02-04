package ch.wesr.prepareforjava.buildingBlocks.packete;

import java.util.Random;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImportBeispiel {

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}
