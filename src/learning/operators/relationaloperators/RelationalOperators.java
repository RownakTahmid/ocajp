package learning.operators.relationaloperators;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 10;
        long b = 5L;
        double c = 7.5;
        //int gets promoted to long and double in the 2 cases.
        System.out.println("a > b " + (a>b) + " a < c "+(a < c));

    }
}
