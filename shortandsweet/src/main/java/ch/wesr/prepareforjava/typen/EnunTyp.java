package ch.wesr.prepareforjava.typen;

public class EnunTyp {

    // https://www.sitepoint.com/fundamentals-of-java-enum-types-tutorial/

    public static void main(String[] args) {
        SendungsTyp sendungsTyp = SendungsTyp.EINSCHREIBEN;
        FrankierTyp frankierTyp = null;

        frankierTyp = FrankierTyp.valueOf(sendungsTyp.name());

        System.out.println("SendungsTyp.EINSCHREIBEN: " +sendungsTyp);
        System.out.println("FrankierTyp.EINSCHREIBEN: " +frankierTyp);
        if(frankierTyp instanceof FrankierTyp) {
            System.out.println("  ... und der Frankiertyp stimmt immer noch von " +frankierTyp);
        }
    }


public enum SendungsTyp {EINSCHREIBEN, A_POST_PLUS, A_POST, Q_POST;}
    public enum FrankierTyp {EINSCHREIBEN, A_POST_PLUS;}

}
