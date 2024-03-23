package learning.operators.equalityoperators;

import learning.javabasics.decimalnumericprimitives.DecimalNumericPrimitives;

public class EqualityOperators {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        boolean x = a ==5;
        boolean y = a > b;
        boolean z = a != b;
        DecimalNumericPrimitives.printAnything(new String[]{"x","y","z"},x,y,z);
        boolean e = true;
        boolean f = false;
        boolean g = (e = false) || (f == true); //first is assignment and the 2nd is == . not same
        DecimalNumericPrimitives.printAnything(new String []{"e","f","g"},e,f,g);
        g = (e != false) ^ (f = !false);
        DecimalNumericPrimitives.printAnything(new String []{"e","f","g"},e,f,g);


    }
}
