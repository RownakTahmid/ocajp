package learning.string.stringbuilderexample;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("programming");
        //length() // charAt() // subString() // indexOf()
        String sub = sb.substring(sb.indexOf("ro"), sb.indexOf("gra"));
        int len = sb.length();
        char c = sb.charAt(9);
        System.out.println(sb + " " + sub);

        //append
        StringBuilder test = new StringBuilder().append(1).append("goal ->").append(true);
        System.out.println(test);

        //insert
        test.insert(7,"inserted");
        test.insert(8,true);
        System.out.println(test);

        //delete, deleteCharAt
        test.delete(3,11);
        //test.delete(3,1); //String index out of bound exception
        test.deleteCharAt(9);
        System.out.println(test);
        test.delete(5,5); //does not change anything
        System.out.println(test);

        //reverse
        test.reverse();
        System.out.println(test);


    }
    public void GO(){
    run();
    }
    public void run(){}

}
