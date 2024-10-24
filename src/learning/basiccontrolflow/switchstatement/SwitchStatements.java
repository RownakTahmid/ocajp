package learning.basiccontrolflow.switchstatement;

import java.util.Random;

public class SwitchStatements {
    public static void main(String[] args) {

        int day = 78;
        switch (day) {
            default:
                System.out.println("wrong day");
            case 1:
                System.out.println("Saturday");
                //break;
           // case :
                System.out.println("Sunday");
                break; //will print till this

            case 3:
                System.out.println("Monday");
//                if (day == 3) System.out.println("hahaha");
//                break;

        }
        Random random = new Random();
        System.out.println(random);
        int x  = random.nextInt(5) + 'a';
        final int t = 'a';
        switch (x){
            case t:
            case 'e':
            case 'c':
                System.out.println("test");
                break;
        }
    }
}
