package learning.javabasics.understandingnull;

public class UnderstandingNull {
    static Object myObject = new Object();
    static Object myOtherObject;

    public static void main(String[] args) {
        Object localObject = new Object();
        Object otherLocalObject;
        Object otherLocalObject1 = null;
        System.out.println("myObject " + myObject);
        System.out.println("myOtherObject " + myOtherObject);
        System.out.println("localObject " + localObject);
        System.out.println("otherLocalObject1 " + otherLocalObject1);
        //System.out.println(otherLocalObject); //compilation error because
        // this local variable is not initialized.
        String myString = "jAva";
        String otherString = null;
        System.out.println("print " + myString + " in lowecase " + myString.toLowerCase());
        //System.out.println("print " + otherString + " in lowecase " + otherString.toLowerCase());
        otherString = "Java";
        System.out.println("print " + otherString + " in lowecase " + otherString.toLowerCase());

    }
}
