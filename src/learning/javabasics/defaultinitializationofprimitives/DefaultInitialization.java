package learning.javabasics.defaultinitializationofprimitives;

import static learning.javabasics.decimalnumericprimitives.DecimalNumericPrimitives.printAnything;

public class DefaultInitialization {
    static boolean myBoolean;
    static int myInt;
    static short myShort;
    static long myLong;
    static float myFloat;
    static double myDouble;
    static char myChar;

    public static void main(String[] args) {
         int i ;
        //System.out.println("demoTest " + i); compile error since i is not static
        // it does not has a default value

        System.out.println("myBoolean " + myBoolean);
        System.out.println("myChar " + myChar);
        System.out.println("myFloat " + myFloat);
        System.out.println("myDouble " + myDouble);
        System.out.println("myShort " + myShort);
        System.out.println("myInt " + myInt);
        System.out.println("myShort " + myShort);
        System.out.println("myLong " + myLong);

    }
}
