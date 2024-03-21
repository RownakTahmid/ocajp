package learning.javabasics.primitivecharandboolean;
import static learning.javabasics.decimalnumericprimitives.DecimalNumericPrimitives.printAnything;

public class PrimitivesCharAndBoolean {
    public static void main(String[] args) {
        char ch = '1';
        char uniChar = '\u03A9'; // It is a unicode it is uppercase greek Omega.
        char roman = '\u216C'; // It is roman 50
        printAnything(new String[]{"ch","uniChar","roman"},ch,uniChar,roman);
//        boolean true = true;  true and false is reserved you can't use but
//        true1, this type is allowed
        boolean true1 = true;
        System.out.println(true1);
    }
}
