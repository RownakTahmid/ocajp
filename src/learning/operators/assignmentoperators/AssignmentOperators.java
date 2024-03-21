package learning.operators.assignmentoperators;

public class AssignmentOperators {
    public static void main(String[] args) {
        //int x = 1.0; // does not compile cz bigger data type needs casting
        // for them to be used in smaller data types
        //short y = 34145146; // d.n.c. cz crosses the limits of a short. overflow
        //int z = 12.6F; // bigger data type in smaller data type needs casting
        //long t = 15465715267; // it's taking it as a int if the L/l sign is nt used at the end
        // since int has a limit of 32 bit hence it d.n.c
        byte b =  127;
        //overflow
        System.out.println(++b);
        System.out.println(++b);
        b = -128;
        //underflow
        System.out.println(--b);
        System.out.println(--b);
        short a =3;
        short c =  20;
        //short result = a * c; // it is automatically converted to int. and int needs casting to short
        //short result = a + c; //same
        short result = (short)(a * c);
        System.out.println("a * b = " + (a*b) +" result = " + result);
    }
}
