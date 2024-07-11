package learning.classdesign.abstractclassesandmethodsandinterfacesandpolymorphism;

public class Horse extends Animal {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public Horse(){
        super("horse");
        System.out.println("Horse constructor");
    }
    public Horse(String name){
        super("horse named " + name);
        this.name = name;
    }
    @Override
    public void eat() {
        //super.eat();
        System.out.println("Horse "+ name + " is eating");
    }

    @Override
    protected void fly() {
        System.out.println("horse can not fly");
    }

/*    @Override
    protected void fly() {
        System.out.println("Horse can not fly");
    }*/
}
