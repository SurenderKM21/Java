package constructors;

public class Parent {
    Parent(){

    }
}
class C extends P{
    C(int i)
    {}
    public static void main(String[] args) {
//        C c = new C(); - error
        C c = new C(20);
    }
}
