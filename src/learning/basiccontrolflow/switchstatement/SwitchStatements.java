package learning.basiccontrolflow.switchstatement;

import java.util.Random;

public class SwitchStatements {
    public static void main(String[] args) {
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Saturday");
                //break;
            case 2:
                System.out.println("Sunday");
                break; //will print till this
            case 3:
                System.out.println("Monday");
            default:
                System.out.println("wrong day");
        }
        Random random = new Random();
        System.out.println(random);
        int x  = random.nextInt(5) + 'a';
        switch (x){
            case 'e':
            case 'c':
                System.out.println("test");
                break;
        }
    }
}
