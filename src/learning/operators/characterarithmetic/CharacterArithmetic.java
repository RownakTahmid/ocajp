package learning.operators.characterarithmetic;

public class CharacterArithmetic {
    public static void main(String[] args) {
        // char 0 - 65535
        char myChar = 'A';
        char myCharNumber = (char) 13456;
        System.out.println("myChar is a letter: " + Character.isLetter(myChar));
        System.out.println("myCharNUmber is a digit: " + Character.isDigit(myCharNumber) + " " + myCharNumber);
        char c = 10+245;
        //char d = c + 4; // compile error, when any operation on char happens it
        // converts to int first hence you need cast it to char first
        System.out.println(myChar++ < 66);
        //true, since it does post increment hence A=65 < 66 true
        // since they are converted to int when doing arithmetic operations.
        char x = 91, y = '[';
        System.out.println(x + " " + y);
        System.out.println(x == y); //true
    }
}
