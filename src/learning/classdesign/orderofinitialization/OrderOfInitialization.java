package learning.classdesign.orderofinitialization;

/**
 * Even though var x and y are declared first and instance
 * initializer is before the static initializer and static variables but the order is
 * sta
 */
class Example {
    private String x = "instance variable 1";
    private String y = "instance variable 2";

    {
        System.out.println(x + "\n" + y);
    }

    static String a = "static variable 1";
    static String b = "static variable 2";

    static {
        System.out.println(a + "\n" + b);
    }

    public Example() {
        System.out.println(" Example Constructor");
    }
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        Example example = new Example();
    }
}
