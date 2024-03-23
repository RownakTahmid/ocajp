package learning.operators.objectequality;

public class ObjectEquality {
    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println("i1 == i2 "+ (i1 == i2) );//true
        System.out.println("hashcode of i1: " + System.identityHashCode(i1));
        System.out.println("hashcode of i2: " + System.identityHashCode(i2));// see the hashcode
        // of memory location.
        i1 = 127; i2 = 127;
        System.out.println("i1 == i2 "+ (i1 == i2) );//true
        System.out.println("hashcode of i1: " + System.identityHashCode(i1));
        System.out.println("hashcode of i2: " + System.identityHashCode(i2));
        i1 = 128; i2 = 128;
        System.out.println("i1 == i2 "+ (i1 == i2) ); // false
        System.out.println("hashcode of i1: " + System.identityHashCode(i1));
        System.out.println("hashcode of i2: " + System.identityHashCode(i2));
        // Integer caches the value from -128 to 127 hence memory locations are same.
        // since this are int values and gets auto boxed to Integer
        i1 = -128; i2 = -128;
        System.out.println("i1 == i2 "+ (i1 == i2) ); // true
        System.out.println("hashcode of i1: " + System.identityHashCode(i1));
        System.out.println("hashcode of i2: " + System.identityHashCode(i2));
        Integer i3 = new Integer(1);
        Integer i4 = new Integer(1);
        System.out.println("i3 == i4 "+ (i3 == i4) ); // false, they are not converted
        // from int to Integer, these create new objects.
        System.out.println(i3.equals(i4)); //true, since it's checking the data inside it
        System.out.println("hashcode of i3: " + System.identityHashCode(i3));
        System.out.println("hashcode of i4: " + System.identityHashCode(i4));
        // lets

    }
}
