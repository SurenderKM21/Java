package constructors;
//Diff b/w IB vs Constructor
//PROGRAM TO PRINT NUMBER OF OBJECTS CREATED FOR A CLASS
public class Test {
    static int count =0;
    {
        count++;
    }
    Test(){}
    Test(int i){}
    Test(double d){}
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test(2);
        Test t3 = new Test(10.4);
        Test t4 = new Test();

        System.out.println("The no of objects = "+count);
    }
}
