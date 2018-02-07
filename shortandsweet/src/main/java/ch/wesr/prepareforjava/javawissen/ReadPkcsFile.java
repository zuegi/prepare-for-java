package ch.wesr.prepareforjava.javawissen;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadPkcsFile {

    public static void main(String[] args) throws Exception {
        System.out.println("####################### KeyStore ##########################");

        ReadPkcsFile readPkcsFile = new ReadPkcsFile();
        InputStream resourceAsStream = readPkcsFile.getClass().getResourceAsStream("/clientTrustStore.jks");

        Pkcs12Util util = new Pkcs12Util(resourceAsStream, "to_be_set");

        System.out.println("Is certificate valid : " + util.isValidCert());
        System.out.println("Issuer details : " + util.getIssuerName());
        System.out.println("Aliases: ");
        util.printAliases();


        System.out.println("####################### TrustStore ##########################");

        ReadPkcsFile readJksTrustStore = new ReadPkcsFile();
        InputStream resourceAsStream1 = readPkcsFile.getClass().getResourceAsStream("clientKeyStore.jks");
        Pkcs12Util util1 = new Pkcs12Util(resourceAsStream1, "to_be_set");
        System.out.println("Is certificate valid : " + util1.isValidCert());
        System.out.println("Issuer details : " + util1.getIssuerName());
        System.out.println("Aliases: ");
        util1.printAliases();
    }
}