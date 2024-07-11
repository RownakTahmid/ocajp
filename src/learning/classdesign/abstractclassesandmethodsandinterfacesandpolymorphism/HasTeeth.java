package learning.classdesign.abstractclassesandmethodsandinterfacesandpolymorphism;

public interface HasTeeth {
    default void name() {
        System.out.println("Teeth");
    }
    static void totalTeeth(int num){
        System.out.println("Has total " + num + "Teeth");
    }

    /**
     * This is a default method which will not compile if access modifier is
     * changed to public or protected
     */
    default void general(){
        System.out.println("Not all animals have tails");
    }
}
