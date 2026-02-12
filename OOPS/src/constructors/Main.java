package constructors;

public class Main {
    Main()
    {
        System.out.println("Constructor");
    }
    void Main()
    {
        System.out.println("Method");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.Main();
    }
}
