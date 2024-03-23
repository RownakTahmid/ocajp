package learning.string.stringmethods;

public class StringMethods {
    public static void main(String[] args) {
        String str = "java is very fun! very very fun";
        //length()
        System.out.println(str.length());
        //charAt()
        System.out.println(str.charAt(8));
        //indexOf()
        System.out.println(str.indexOf("fun"));
        System.out.println(str.indexOf("f",14));
        System.out.println(str.indexOf("fun",14));
        System.out.println(str.indexOf("fun",140));// it will return -1,
        // if it doesn't find it returns -1. Also, from index can allow index which is outside
        // the scope of the String meaning greater than the length of the String

        //subString()
        System.out.println(str.substring(5)); // from 5(INCLUDING) till last
        System.out.println(str.substring(5,9)); // from 5(INCLUDING) BEFORE 9
        System.out.println(str.substring(5,5)); // returns an empty String
        System.out.println(str.substring(5,6)); // returns one character in the index 5.
        //System.out.println(str.substring(5,4)); // Throws out of range and String Index
        // out of bound exception.
        // System.out.println(str.substring(5,78)); // Throws out of range and String Index

        //String is Immutable
        String dog = "L y k i e";
        System.out.println(dog.toUpperCase());
        System.out.println("adsgag".toUpperCase());
        System.out.println("adsgag".substring(3));
        System.out.println(dog);
        //equals and ignore equals
        System.out.println( dog.equals("lykie"));
        System.out.println( dog.equalsIgnoreCase("lykie"));// true cz it
        // will ignore the difference in terms of case

        // startsWith // endsWith
        System.out.println(dog.startsWith("l"));
        System.out.println(dog.endsWith("ie"));
        System.out.println(dog.startsWith("l".toUpperCase())); //true cz we've promoted it to uppercase.

        //contains
        System.out.println(dog.contains("yk")); //true
        //replace
        System.out.println(dog.replace("L","H"));
        System.out.println(dog.replace("Ly","Hu"));
        System.out.println(dog.replace(" ",""));
        System.out.println(dog.replace("X","H"));// doesn't change cz "X" is not there
        System.out.println(dog); // because of Immutability it will remain the same

        //trim()
        String test = " JAva is cool ";
        System.out.println(test);
        System.out.println(test.trim());
        System.out.println(test);


    }
}
