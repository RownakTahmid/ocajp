package learning.exceptions;

import java.sql.SQLException;

class Engine extends Exception {}
class BikeStopped extends RuntimeException {}
class TyrePunched extends BikeStopped {}
public class CatchingExceptions {
    public static void main(String[] args) {
        int x = ExcHandler(5);
        System.out.println("ExcHandler has returned the number by multiplying it with 2: " + x);
    }

    private static int ExcHandler(int i) {
        try{
            bikeStart();
        }
        catch(RuntimeException bs){
            System.out.println("Runtime" + "  " + bs.getMessage());
        }
        catch (Exception a){
            System.out.println("Exception" + "  " + a.getMessage());
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("handler working perfectly");

        return i*2;
    }

    static void bikeStart() throws Exception {
        boolean b = Math.random() > 0.5;

        if (b){
            throw new SQLException();
        }
        else {
            throw new ArrayIndexOutOfBoundsException();
        }

    }
}
