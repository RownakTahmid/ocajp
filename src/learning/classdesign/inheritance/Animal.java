package learning.classdesign.inheritance;

public class Animal {
    private String name;
    public Animal(){
        System.out.println("Animal constructor");
    }
    public Animal(String name){
        this.name = name;
        System.out.println("Animal Constructor with arguments");
    }
    protected void eat(){
        System.out.println("Animal is eating");
    }
}
