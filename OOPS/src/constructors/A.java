package constructors;
//RECURSIVE FN CALL - StackOverflowError
public class A {
    public static void m1(){
        m2();
    }
    public static void m2(){
        m1();
    }
    A(){
        this(1);
    }
    A(int j)
    {
//        this();
    }
    public static void main(String[] args) {

    }
}
