package learning.variablescope;

public class VariableScope {
    static int myInt = 10;
    public static void main(String[] args) {
        int myLocalInt = 10;
        {
            {
                int myOtherInt = 20;
            }
            int myOtherInt = 30;
            System.out.println("myOtherInt " + myOtherInt);
            System.out.println("InCodeBlock MyLocalInt " + myLocalInt);
        }
        int myOtherInt = 40;
        //System.out.println("myOtherInt " + myOtherInt); //does not compile
        System.out.println("Which is gonna print for myOtherInt: " + myOtherInt);
    }
}
