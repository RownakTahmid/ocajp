package learning.classdesign.abstractclassesandmethodsandinterfacesandpolymorphism;

public interface HasTail {
    int Length_Of_Tail = 5;
    //public static final int Length_Of_Tail = 5; // public & static and final are
    // redundant cz they are by default set in interface
    void tailSize(int length_Of_Tail);

    default void name() {
        System.out.println("tail");
    }
    //  public abstract void tailSize(int length_Of_Tail);

    /**
     * This is a default method which will not compile if access modifier is
     * changed to public or protected
     */
    default void general(){
        System.out.println("Not all animals have tails");
    }
}
