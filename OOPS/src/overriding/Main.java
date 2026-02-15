package overriding;
class P{
     public static void m1(){
        System.out.println("Parent");
    }
    public void m2(){
        System.out.println("Parent m2");
    }
}
class C extends P{
    public static void m1(){
        System.out.println("Child");
    }
     public void m2(){
        System.out.println("Child m2");
    }
}
public class Main {
    public static void main(String[] args) {
        P p = new P();
        C c = new C();
        P p2 = new C();

//        p.m1();
//        c.m1();
//        p2.m1();
//
//        p.m2();
//        c.m2();
//        p2.m2();
        P.m1();
        C.m1();
    }
}
