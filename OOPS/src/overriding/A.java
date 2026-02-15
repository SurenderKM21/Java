package overriding;

import java.util.ArrayList;
import java.util.List;

public class A {
    static void m1(int x){
        System.out.println(x);
    }
    static void m1(double d){
        System.out.println(d);
    }
    public static void main(String[] args) {
        A a = new A();
        a.m1(2);
        a.m1(9.4);
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.get(2);
    }
}
