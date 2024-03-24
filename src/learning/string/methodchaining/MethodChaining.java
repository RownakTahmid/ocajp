package learning.string.methodchaining;

public class MethodChaining {
    public static void main(String[] args) {
        String java = " Java ";
        if(java.trim().substring(1,3).trim().replace("a","Abv").equals("Java")){
            System.out.println(" just testing");
        }
        else System.out.println("you're good");
    }
}
