package learning.string.stringconcatenation;

public class StringConcatenation {
    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");
        System.out.println(2+5);//addition
        System.out.println(2+a);//concatenation
        System.out.println(2+3+b);//first addition then concatenation
        int three = 3;
        String four = "4";
        System.out.println(2+4+three+four);//94
         int x = 20, y = 40;
        System.out.println("result= " + x +y);//2040 not 60
        String v = null;
        //System.out.println(v.hashCode());
        v +="bn";
        System.out.println(v.hashCode());
    }
}
