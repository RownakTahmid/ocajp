package learning.classdesign.abstractclassesandmethodsandinterfacesandpolymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        Stallion stallion = new Stallion("Goran");
        Horse horse = stallion;
        stallion.name();
        System.out.println(horse == stallion);
        stallion.eat();
        horse.eat(); // it takes the eat() implementation of Stallion class, but it can't access
        //the methods from Stallion class if the Horse class doesn't have them
        Horse crossBreed = new Stallion();
        Stallion arabian = (Stallion) crossBreed;
        arabian.eat();
        arabian.eat("Rice");
        Animal animal = new Bird();
        animal.fly();
        animal = arabian;
        //Snake snake = (Snake) new Horse();compile error
        Snake snake = new Snake("Cobra");
        System.out.println(snake.getName());
        printDetails(snake);
        Bird bird = new Bird("doel");
        printDetails(bird);


    }
    public static Animal printDetails(Animal animal){
        if (animal.getName().equals("duldul")){
            Horse horse = (Horse) animal;
            System.out.println("The name of the horse is " + horse.getName());
            return horse;
        }
        else if(animal.getName().equals("doel")){
            Bird bird = (Bird) animal;
            System.out.println("It is a Bird named " + animal.getName());
            return bird;
        }
        else {
            System.out.println("it is a snake named " + animal.getName());
            return (Snake)animal;
        }
    }
}
