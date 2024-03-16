package learning.primitives;

public class WholeNumericPrimitives {
    public static void main(String[] args) {
        long l = 12_354_563L;
        int firstOct = 010; //decimal 8.
        int secOct = 022; // decimal 18.
        int sumOct = firstOct + secOct;
        System.out.println("sum in decimal is " + sumOct +"\nsum in octal is " + Integer.toOctalString(sumOct));
        int firstHex = 0xA;
        int secHex = 0xA;
        int sumHex = firstHex + secHex;
        System.out.println("SumHex in \n" + "decimal: " + sumHex + "\n" + "HexaDecimal: " + Integer.toHexString(sumHex));
        int binF = 0b10;
        int binS = 0b01;
        int binSum = binF + binS;
        System.out.println( "binF is "+binF + "\nbinS is " + binS + "\n" + "Binsum \nin decimal " + binSum + "\nin binary " + Integer.toBinaryString(binSum));
    }
}
