package learning.classdesign.abstractclassesandmethodsandinterfacesandpolymorphism;

public class Stallion extends Horse implements HasTail {
    private String name;

    public Stallion() {
        super(); // it is automatic even if you don't put it, it will be there by compiler .
        System.out.println("Stallion constructor");
    }

    public Stallion(String name) {
        this.name = name;
        // it is automatic even if you don't put it, it will be there by compiler .
        System.out.println("Stallion constructor for " + name);
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println("Stallion"+ name + "is eating");
        this.eat("grass");
    }

    public void eat(String food) {
        System.out.println("Stallion is eating " + food);
    }

    @Override
    protected void fly() {
        System.out.println("Horse can't fly but among horses stallions can jump higher ");
    }

    @Override
    public void tailSize(int length_Of_Tail) {
        if (length_Of_Tail > HasTail.Length_Of_Tail) System.out.println("long tail");
        else System.out.println("short tail");
    }
}
