package learning.string.stringimmutability;

public class StringImmutability {
    public static void main(String[] args) {
        String hello = "Hello";
        System.out.println(hello.toUpperCase());;;;;;;;;
        //it returns a String which has everything in
        // UpperCase but the original Object remains the same
        System.out.println(hello);
        //concat && showing Immutability
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3"); //s2 will remain the same as before
        System.out.println("s1 " + s1 + " s2 " + s2);


    }
}
