package learning.javaClassStructure.com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        for (String s: args){
            System.out.println(s);
        }
        System.out.println(sum(2,3));
    }
    /**
     * This is a method to calculate the sum of two numbers
     * @param a  operand
     * @param b  operand
     * @return sum
     */
    public static int sum(int a , int b){
        return a + b;
    }
}