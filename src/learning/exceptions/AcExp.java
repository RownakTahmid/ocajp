package learning.exceptions;

public class AcExp {
    public static void main(String[] args) {
        A a = new B();
        a.m();
        ((A)a).m();
        A b = new A();
        b.m();
        /*try {

        }
        catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
class A{
    void m() throws BikeStopped {
        System.out.println("m of A");
        B b = new B();
        b.mt();
    }
}
class B extends A{
    @Override
    void m() throws BikeStopped {
        System.out.println("m of B");
        mt();
    }

     void mt() throws BikeStopped {
            throw new BikeStopped();

    }
}
