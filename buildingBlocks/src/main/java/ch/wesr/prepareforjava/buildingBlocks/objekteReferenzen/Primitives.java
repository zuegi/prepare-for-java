package ch.wesr.prepareforjava.buildingBlocks.objekteReferenzen;

public class Primitives {

    int million = 1_000_000;
//    int million1 = _1_000_000;
//    int million1 = 1_000_000_;

//    double notAtStart = _1000.00;
//    double notAtEnd = 1000.00_;
//    double notByDecimal = 1000_.00;
//    double notByDecimalAfter = 1000._00;

    double notByDecimalAfter = 1_00_0.0_0;
    String __$StillOkIdentifier;
    String  Ωvalid;
    String ßvalid;
//    String ƒ∂å;       // kompliet nicht - å nicht erlaubt

    public static void main(String[] args) {
        System.out.println(kompiliertNicht());
    }

    public static int kompiliertNicht() {
        int y = 10;
        int x = 2;
        int reply = x + y;
        float z = 2;
        float zz = 2.2f;
        float zyz = 2f;
        return reply;
    }
}