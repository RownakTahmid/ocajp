package learning.classdesign.constructorandclass;
class Dog{
    String name;
    String color;
    int age;
    public Dog(){
        this("Hulk","grey");
        System.out.println("Constructor 1");
        //Dog(color,age); doesn't compile
       // new Dog(color,age); compiles
    }
    public Dog(String name, String color){
        this(name,color, 5);
        if (name.equals("Robert")) System.out.println("static Dog");
    }
    public Dog(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void print(){
        System.out.println("name = " + name +" color = " + color + " age = " + age);
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setName(String name){
        this.name = name;
    }
}
public class ConstructorAndClass {
    static Dog dog = new Dog("Robert", "black");

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.print();
        dog.print();
        dog.setColor("blue");
        dog.print();
        System.out.println(dog.getClass());
        dog.setName("Alan");
        dog.print();
        Dog dog2 = new Dog("BatMan","Pink");
        Dog dog3 = new Dog("Strange","Red",6);
        dog2.print();
        dog3.print();

    }
}
