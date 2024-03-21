package learning.operators.numericpromtion;

public class NumericPromotion {
    public static void main(String[] args) {
        // promotion is converting smaller to bigger types
        int x = 5;
        double y = 10.456;
        // x promoted as a double then gets concatenated with y
        System.out.println("x + y = " + x + y); // 510.456
        System.out.println("x + y = " + (x+y));//15.456
        byte b = 4;
        System.out.println("x + y + b = " + (x + y + b));

        // casting: bigger types to smaller;
        double myDouble = 12.6;
        //int myInt = 10 + myDouble; // need to cast the double to int
        int myInt = 10 + (int)myDouble;
        System.out.println("myDouble + myInt = " + (myDouble + myInt));
        int myInt1 = 125;
        byte myByte = 15;
        float f = 45.34F;
        int intResult = myInt1 + myByte;
        //byte byteResult = myByte + (byte) myInt1; // compile error because if two operands are
        // smaller than int like byte, char etc they first get converted to int
        // before arithmetic operation
        byte byteResult = (byte) (myByte + myInt1); // since byte has the limit of 128 bits
        // hence it overflows and gives - 116.
        System.out.println("intResult & byteResult :" + intResult + " "+ byteResult);

    }
}
