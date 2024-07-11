package learning.classdesign.abstractclassesandmethodsandinterfacesandpolymorphism;

public abstract class Animal {
    private String name;
    public Animal(){
        System.out.println("Animal constructor");
    }
    public Animal(String name){
        this.name = name;
        System.out.println("Animal Constructor for  " + name);
    }
    protected void eat(){
        System.out.println(name + " is eating");
    }

    public String getName() {
        return name;
    }

    protected abstract void fly(); //abstract method example
}
