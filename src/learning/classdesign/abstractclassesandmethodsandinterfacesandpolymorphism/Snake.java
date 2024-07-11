package learning.classdesign.abstractclassesandmethodsandinterfacesandpolymorphism;

public class Snake extends Animal{
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public Snake() {
    }

    public Snake(String name) {
        this.name = name;
        System.out.println("A snake has been constructed named " + name);
    }

    @Override
    protected void fly() {
        System.out.println("Snakes can't fly");
    }
}
