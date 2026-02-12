package constructors;
//Overloaded constructors
public class Tests {
    Tests(){
        this(10);
        System.out.println("No-Arg");
    }

    Tests(int i){
        this(13.4);
        System.out.println("Int Arg");
    }
    Tests(double d)
    {
        System.out.println("Double Arg");
    }
    public static void main(String[] args) {
        Tests t1 = new Tests();
        Tests t2 = new Tests(1);
        Tests t3 = new Tests(23.5);
        Tests t4 = new Tests(2l);
    }
}
