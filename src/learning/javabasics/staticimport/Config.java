package learning.javabasics.staticimport;

public class Config {
    public static final String NAME = "Alan";
    public static final int MAX_COLUMN_COUNT = 4;

    /**
     * This prints the Name and the maximum column count.
     */
    public static void printConfig(){
        System.out.println(NAME + " has a column count of " + MAX_COLUMN_COUNT);
    }
}
