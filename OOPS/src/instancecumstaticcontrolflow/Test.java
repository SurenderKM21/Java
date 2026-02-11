package instancecumstaticcontrolflow;

public class Test {
    {
        System.out.println("First Instance Block");
    }
    static {
        System.out.println("First Static Block");
    }
    Test(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println("main");
        Test t2 = new Test();
    }
    static {
        System.out.println("Second Static Block");
    }
    {
        System.out.println("Second Instance Block");
    }
}
