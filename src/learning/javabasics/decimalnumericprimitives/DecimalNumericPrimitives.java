package learning.javabasics.decimalnumericprimitives;

import java.util.Arrays;
import java.util.List;

public class DecimalNumericPrimitives {
    public static void main(String[] args) {
        /**
         *float myNumber = 25.4;
         *  it would give compile error because by default if we don't put f/F at the end of a float number
         *  then java takes that as a double and since we declared the variable to be a float
         *  hence it gives a compile error.
         */
        float myNumber = 14.26F;
//      double before = 45_.2 // compile error because of wrong positioning of the underscore
//      double after = 45._2 // compile error because of wrong positioning of the underscore
//      double first = _45.2 // compile error because of wrong positioning of the underscore
//      double last = 45.2_ // compile error because of wrong positioning of the underscore
        double myDouble = 23.6;
        double myDouble1 = 23.6F;// both 2 are same since float will convert to double in this line.
        double myDouble2 = 23.6d; // to use d/D at the end of a double is optional
        double scientific = 5.0012E02; //e/E both are same. eO2 means 10 to the Power 2. e02/e2 same thing.
        double scientific2 = 5.0012E2;
        double scientific3 = 5.0012e02;
        double myDouble3 = 500.12;
        printAnything(new String[]{"scientific", "scientific2", "scientific3", "myDouble3"}, scientific, scientific2, scientific3, myDouble3);
        double myHexPi = 0xb124e43fp165; // p indicates hexadecimal floating point number
        // whatever is after p, is power of 2  meaning here the hex number is multiplied by 2^189.
        System.out.println("myHexPi: " + myHexPi);
    }

    /**
     * This can print anything its given
     *
     * @param object can be single to multiple variables
     */
    public static void printAnything(String[] names, Object... object) {
        int i = 0;
        if (object.length != 0) {
            for (Object o : object) {
                System.out.println(names[i] + " " + o);
                i++;
            }
        }
        else {
            for (String s : names) {
                System.out.println(s);
            }
        }

    }
}
