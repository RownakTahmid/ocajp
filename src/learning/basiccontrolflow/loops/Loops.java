package learning.basiccontrolflow.loops;

public class Loops {
    public static void main(String[] args) {
        int a = 0;
        do {
            a++;
        } while (false);
        System.out.println(a);
       /* while (false){
            a--;
        }*/  // compile error since while loop never executes. state
        int y = 0;
        while (y++ < 5) {
            System.out.println("while loop is cool " + y);
        }

        int i = 0;
        for (i = 0; i < 5; i++) {
            System.out.println("Now i is: " + i);
        }
        //infinite for loops
        /*for(;;){
            System.out.println("infinity");
        }*/
        for (int e = 10, f = 7, g = 12, n = 0; (e > 7 || f < 10) && g < 15; f++, g++) {
            System.out.println("e " + e + " f" + f + " g" + g);
            e--;
            f += e + g + n;
        }
    }

}

