package learning.classdesign.inheritance;

public class Horse extends Animal{
    public Horse(){
        super("It is a horse");
        System.out.println("Horse constructor");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Horse is eating");
    }
}
