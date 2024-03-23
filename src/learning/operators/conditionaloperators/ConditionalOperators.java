package learning.operators.conditionaloperators;

import com.sun.org.apache.xpath.internal.objects.XString;

import static learning.javabasics.decimalnumericprimitives.DecimalNumericPrimitives.printAnything;

public class ConditionalOperators {
    public static void main(String[] args) {
        int a = 4;
        boolean b = false && (a++ < 4); // (a++ > 5), this never gets
        // executed since for And if one is false the end result would be false.
        boolean c = (a-- ==4) && !b; // so, 4 == 4 true and !false = true result is true
        printAnything(new String[]{"a","b", "c"}, a,b,c);
        int myInt = 3;
        int anotherInt = 4;
        boolean myBoolean = (myInt <= 3) && (anotherInt-- == 4) || (myInt++ == 4);
        printAnything(new String[]{"myInt","anotherInt","myBoolean"},myInt, anotherInt,myBoolean);

        boolean x = true , y = false;
        int z = 20;
        x = (z-- != 20) ^ (y = (x = (y = !false)));
        printAnything(new String[]{"x","y","z"},x,y,z);

    }
}
