package learning.operators.arithmaticoperators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 2;
        int b = 10 - a++;// use a first then increment the value of a.
        System.out.println("b " + b + " a " + a);
        int c = 3 - --a; // decrement a then use
        System.out.println("c " + c + " a " + a);
        int f = 12;
        int g = 5;
        int h =  2;
        int m = f / 2 - 10 % (4+3) - 2 * f % g - h * 3;
        // 12 / 2 -10 % 7 - 2 * 12 % 5 - 2 * 3
        // 6 - 3 - 24 % 5 - 6
        // 3 - 4 - 6
        // -7
        System.out.println("m " + m);
    }
}
