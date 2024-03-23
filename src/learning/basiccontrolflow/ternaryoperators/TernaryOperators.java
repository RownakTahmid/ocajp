package learning.basiccontrolflow.ternaryoperators;

public class TernaryOperators {
    public static void main(String[] args) {
        int a = 10;
        int x = (a > 9) ? 15 : 6;
        System.out.println(x);
        x = x > 15 ? 10 : 12;
        int result = a > x ? (x++ > 15 ? a++ : x++) : (a-- < 10 ? ++x > 15 ? --a : x-- : x);
    }
}
