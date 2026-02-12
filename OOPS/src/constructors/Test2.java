package constructors;
//diff bw super() and super - same applies to this() and this
class P{
    int x =100;
}
public class Test2 extends P{
    //static Test2()-error
//    Test2()
//    {
//
//    }
    public void m1(){
//        super(); - not allowed
        System.out.println(super.x); // allowed
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.m1();
    }
}
