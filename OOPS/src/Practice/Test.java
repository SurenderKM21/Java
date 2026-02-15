package Practice;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
//        t.m1(1);
//        t.m1('a');
////        t.m1(10.9);
        m1();
//        m1(10);
        m1(20,3);
        m1(null);
    }
    public static void m1(int i,int j){
        System.out.println("General");
    }
    public void m1(float i){
        System.out.println("float - "+i);
    }
    public static void m1(Object o){
        System.out.println("object");
    }
    public static void m1(int... x){
        System.out.println("Var-arg method");
    }
}
