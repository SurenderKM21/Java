package instancecumstaticcontrolflow;

public class Initialization {
    private static String m1(String s)
    {
        System.out.println(s);
        return s;
    }
    public Initialization()
    {
        m = m1("1");
    }
    {
        m = m1("2");
    }
    String m = m1("3");

    public static void main(String[] args) {
        Object o = new Initialization();
    }
}
