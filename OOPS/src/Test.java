public class Test {
    static int i =10;
    static
    {
        m1();
        System.out.println(i); //DIRECT READ
    }
    public static void m1(){
        System.out.println(i); // INDIRECT READ
    }

    public static void main(String[] args) {

    }
}
