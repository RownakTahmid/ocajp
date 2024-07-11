package learning.classdesign.inheritance;

public class Stallion extends Horse{
    public Stallion(){
        super(); // it is automatic even if you don't put it, it will be there by compiler .
        System.out.println("Stallion constructor");
    }
    public Stallion(String name){
        // it is automatic even if you don't put it, it will be there by compiler .
        System.out.println("Stallion constructor for " + name );
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Stallion is eating");
        this.eat("grass");
    }
    public void eat(String food){
        System.out.println("Stallion is eating " + food);
    }
}
