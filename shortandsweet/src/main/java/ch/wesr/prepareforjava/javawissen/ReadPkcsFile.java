package ch.wesr.prepareforjava.javawissen;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadPkcsFile {

    public static void main(String[] args) throws Exception {

        //D:/WS/NEM-OS_3000/gitrepo/NEMOS3000.Web.SRC/NEMOS3000/NEMOS3000Config/5-acceptancetest/config/certificates
        ReadPkcsFile readPkcsFile = new ReadPkcsFile();
        InputStream resourceAsStream = readPkcsFile.getClass().getResourceAsStream("/WebserviceClientTruststore.p12");
//        InputStream resourceAsStream = readPkcsFile.getClass().getResourceAsStream("/WebserviceClientKeystore.p12");

//        FileInputStream fis = new FileInputStream(new File("D:/WS/NEM-OS_3000/gitrepo/NEMOS3000.Web.SRC/NEMOS3000/NEMOS3000Config/5-acceptancetest/config/certificates/WebserviceClientTruststore.p12"));

        Pkcs12Util util = new Pkcs12Util(resourceAsStream, "nemos3000");

        System.out.println("Is certificate valid : " + util.isValidCert());
        System.out.println("Issuer details : " + util.getIssuerName());
        util.printAliases();
        System.out.println("Full details : " + util.getDetails());


        /*
        File file = new File("target/classes/WebserviceClientKeystore.p12");
        Pkcs12Util util1 = new Pkcs12Util(file, "nemos3000");
        System.out.println("Is certificate valid : " + util1.isValidCert());
        System.out.println("Issuer details : " + util1.getIssuerName());
        util1.printAliases();
        */
    }
}