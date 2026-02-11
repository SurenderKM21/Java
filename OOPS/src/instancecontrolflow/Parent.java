package instancecontrolflow;

public class Parent {
    int i =10;
    {
        m1();
        System.out.println("Parent Instance Block");
    }
    Parent()
    {
        System.out.println("Parent Constructor");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println("Parent main");
    }
    public void m1()
    {
        System.out.println(j);
    }
    int j = 20;
}

class Child extends Parent{
    int x = 100;
    {
        m2();
        System.out.println("Child 1 IB");
    }
    Child(){
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("Child main");
    }
    public void m2(){
        System.out.println(y);
    }
    {
        System.out.println("Child 2 IB");
    }
    int y = 200;
}
