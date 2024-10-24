package learning.exceptions;

public class HandlingExceptions {
    public static void main(String[] args) {
        int[]a = new int[5];
        go(5,new int[5]);
        System.out.println(a[7]);
//        run();
//        System.out.println(8/0);


    }
    static void go(int n,int[] a) {
        try{
//            System.out.println("dasci");
            System.out.println(a[7]);

        }
        catch(Exception e){
            System.out.println("Rocket");
            System.out.println(e.getMessage());

        }
//        if(n> 5){  throw new Exception(" checked exception input greater than 5");}

    }
    static void run() throws RuntimeException{
        throw new RuntimeException("Unchecked exception");
    }
}
