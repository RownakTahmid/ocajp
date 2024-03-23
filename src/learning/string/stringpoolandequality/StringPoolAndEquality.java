package learning.string.stringpoolandequality;

public class StringPoolAndEquality {
    public static void main(String[] args) {
        String a = "arab";
        String b = "arab";
        String c = "ar" + "ab" +"";
        String newString = new String("arab");
        System.out.println("a == b " + (a==b));
        System.out.println("a == c " + (a==c));
        System.out.println("a == newString " + (a==newString)); //false cz the reference is different
        // the other they have same reference from the String Pool

        String d = a + "";
        System.out.println("a == d "+ (a==d)); // false since using variable makes the concatenation
        // in run time hence d has different memory reference though the value is same as a
        System.out.println("a hashcode:" + System.identityHashCode(a));
        System.out.println("b hashcode:" + System.identityHashCode(b));
        System.out.println("c hashcode:" + System.identityHashCode(c));
        System.out.println("d hashcode:" + System.identityHashCode(d));
        System.out.println("newString hashcode:" + System.identityHashCode(newString));
        System.out.println(newString.hashCode());
        System.out.println(a.hashCode());// why the hashcode (not the identityHashCode) are for these 3.
        System.out.println(b.hashCode());

    }
}
