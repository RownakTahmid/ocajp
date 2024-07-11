package learning.classdesign.abstractclassesandmethodsandinterfacesandpolymorphism;

public class Bird extends Animal implements HasTail,HasTeeth{
    private String name;

    public Bird() {
    }

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void tailSize(int length_Of_Tail) {
        System.out.println("Birds have beautiful tails and this bird has a " + length_Of_Tail + " meter long tail");
    }

    @Override
    public void name() {
        System.out.println("two default method with same signature can not be inherited without implementing. Yhe name of this bird is " + name);
    }

    public void details(){
        tailSize(10);
        HasTeeth.totalTeeth(32);
    }
    @Override
    public void general() {
        System.out.println("birds are colorful in general");
    }

    @Override
    protected void fly() {
        System.out.println("Birds can fly");
    }
}
