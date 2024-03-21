package learning.javabasics.namingconflict;


public class ConflictExample {
    java.util.Date date;
    java.sql.Date sqlDate;
    public static void print(){
        System.out.println("This is from class conflict example");
    }

}
