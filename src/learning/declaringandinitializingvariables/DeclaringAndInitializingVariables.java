package learning.declaringandinitializingvariables;

public class DeclaringAndInitializingVariables {
    public static void main(String[] args) {
        //declaring and initialization in 2 lines.
        int myNumber; // declaration
//      System.out.println("myNumber" + myNumber);
        myNumber = 10; // initialization;
        System.out.println("myNumber " + myNumber);
        //declaring and initialization in 2 lines.
        double myDouble = 12.45;
        System.out.println("mydouble " + myDouble);
        float myFloat1, myFloat2, myFloat3;
        float myFloat4; float myFloat5; float myFloat6;
        float myFloat7 = 10f, myFloat8 =23f, myFloat9; // 2 is declared and initialized
        // but myFloat9 has just been declared.
        boolean b1,b2;
//        double d1, double d2;   does not compile have to use the data type just once
//        in a single statement
        double d1, d2 = 23.45;
        int i1;
        int i2;
        //int i3;i4 // does not compile
        float okFloat;
        double $Ok2Double1;
        float __OkButNot$Nice_12242;

        //Illegal examples

        //double 3dPoint; // number at the first position is not allowed.
        //double my@Adress;  // @ is not allowed.
        //float *float;  // * not allowed
        //float double;
        //double public;

    }
}
