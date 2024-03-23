package learning.basiccontrolflow.switchstatement;

public class SwitchStatements {
    public static void main(String[] args) {
        int day = 0;
        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("wrong day");
        }
    }
}
