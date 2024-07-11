package learning.classdesign.abstractclassesandmethodsandinterfacesandpolymorphism;

public class Inheritance {
    public static void main(String[] args) {
        Stallion stallion = new Stallion();
        stallion.eat();
        stallion.fly();
        Horse horse = new Stallion();
        horse.fly();
        Animal animal = new Animal() {
            @Override
            protected void fly() {
                System.out.println("what's happening");
            }
        };
        animal.fly();
        Horse horse1 = new Horse() {
            @Override
            protected void fly() {

            }
        };
        HasTail hasTail = new Bird();
        hasTail.tailSize(4);
        HasTail hasTail1 = new Stallion("Rogan");
        Stallion stallion1 = new Stallion();
        stallion1.general();
        hasTail.general(); // access will determine from declaration part and which implementation it
        //uses depends on the initialization part
        hasTail1.general();
        Bird bird = new Bird();
        bird.details();
    }
}
