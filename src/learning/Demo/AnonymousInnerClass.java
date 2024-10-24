package learning.Demo;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.m();
        A a  = new A(){
            int x = 10;
            @Override
            void m() {
                System.out.println("Inside anonymous A" + x);
            }
        };
        a.m();
//        System.out.println(a.x);
        obj.m();
    }
}
class A {
    void m (){
        System.out.println("Inside A");
    }
    void m2(){
        System.out.println("Inside m2 of A");
    }
}
