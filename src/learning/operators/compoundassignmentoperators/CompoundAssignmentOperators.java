package learning.operators.compoundassignmentoperators;

public class CompoundAssignmentOperators {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int z = x * y ; // simple assignment
        z *= x; //compound assignment operators
        System.out.println("z =" + z);
        // int a += 5; //not compile
        long a = 10;
        int b = 4;
        //b = a* b; //does not compile since it is converted to long and needs casting to int
        //But in compound operators casting is done auto
        b *=a; // short for b = (int) (b * a);
        System.out.println("b = " + b);

    }
}