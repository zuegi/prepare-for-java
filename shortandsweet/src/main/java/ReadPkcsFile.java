package ch.wesr.oca.javawissen;

import java.io.File;

public class ReadPkcsFile {

    public static void main(String[] args) throws Exception {
        File file1 = new File("target/classes/WebserviceClientTruststore.p12");

        Pkcs12Util util = new Pkcs12Util(file1, "nemos3000");

        System.out.println("Is certificate valid : " + util.isValidCert());
        System.out.println("Issuer details : " + util.getIssuerName());
        System.out.println("Full details : " + util.getDetails());


        File file = new File("target/classes/WebserviceClientKeystore.p12");
        Pkcs12Util util1 = new Pkcs12Util(file, "nemos3000");
        System.out.println("Is certificate valid : " + util1.isValidCert());
        System.out.println("Issuer details : " + util1.getIssuerName());
        util1.printAliases();
    }
}