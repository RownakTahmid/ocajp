package learning.wrappertypes;
import static learning.decimalnumericprimitives.DecimalNumericPrimitives.printAnything;

public class WrapperTypes {
    public static void main(String[] args) {
        int myInt = 10;
        Integer myInteger = new Integer(45);
        System.out.println(myInteger);
        Integer myInteger1 = 20;
        Integer myInteger2 = Integer.valueOf(456);
        Integer myInteger3 = Integer.valueOf("141");
        Integer myInteger4 = Integer.parseInt("823");
        Integer myInteger5 = null;
        printAnything(new String[]{"myInteger1","myInteger2","myInteger3","myInteger4","myInteger5"},myInteger1,myInteger2,myInteger3,myInteger4,myInteger5);

        /* converting primitive to wrapper is boxing. */
        Integer boxing = new Integer(myInt);

        /*converting wrapper to primitive is unboxing. */
        int unboxing = boxing;

        /* when automatically does the job of converting primitive to wrapper, that is autoboxing. */
        Integer autoboxing = 20;

        /* Since primitive can not contain null values hence it will give NullPointerException*/
        //int exception = myInteger5;

        printSum(1,5); // autoboxing is done here
        printSum(myInteger2, myInteger3); // not autoboxing
    }
     static void printSum(Integer a, Integer b){
        System.out.println("Total Sum = " + (a+b));
    }
}
