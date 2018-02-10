package ch.wesr.prepareforjava.javawissen;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.Objects;

import javax.security.auth.x500.X500Principal;

public class Pkcs12Util {
    private String password;
    private KeyStore keyStore;


    public Pkcs12Util(InputStream storeInputStream, String password) {
        Objects.nonNull(password);
        keyStore = null;
        try {
            keyStore = KeyStore.getInstance("JKS");
            keyStore.load(storeInputStream, password.toCharArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.password = password;
    }


    /**
     * @return true if the certificate is valid, false if certificate expired.
     */
    public boolean isValidCert() {
        try {
            Enumeration<String> e = keyStore.aliases();
            while (e.hasMoreElements()) {
                String alias = e.nextElement();
                X509Certificate certificate = (X509Certificate) keyStore
                        .getCertificate(alias);
                try {
                    certificate.checkValidity();
                    return true;
                } catch (CertificateExpiredException ex) {
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * @return Issuer name
     */
    public String getIssuerName() {
        try {
            Enumeration<String> e = keyStore.aliases();
            while (e.hasMoreElements()) {
                String alias = e.nextElement();
                X509Certificate certificate = (X509Certificate) keyStore
                        .getCertificate(alias);
                X500Principal issuer = certificate.getIssuerX500Principal();

                return issuer.getName();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public String getDetails() {
        try {
            Enumeration<String> e = keyStore.aliases();
            while (e.hasMoreElements()) {
                String alias = e.nextElement();
                X509Certificate certificate = (X509Certificate) keyStore
                        .getCertificate(alias);

                return certificate.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public void printAliases() {
        try {
            Enumeration<String> e = keyStore.aliases();
            while (e.hasMoreElements()) {
                System.out.println("alias: " +e.nextElement());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}