package overriding;

class Parent{
  int x = 888;
}
class Child extends Parent{
  static int x = 999;
}
public class Test {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent p1 = new Child();

        System.out.println(p.x);
        System.out.println(c.x);
        System.out.println(p1.x);
    }
}
