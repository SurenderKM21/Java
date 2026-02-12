package constructors;
//DELOITTE QN
public class Trees{}
class Branch extends Trees {}
class Leaves extends Branch
{
    static void m(Trees x, Trees y)
    {
        System.out.print("1");
    }
    static void m(Trees x, Branch y)
    {
        System.out.print("2");
    }
    static void m(Branch x, Trees y)
    {
        System.out.print("3");
    }
    static void m(Branch x, Branch y)
    {
        System.out.print("4");
    }
    public static void main(String[] args)
    {
        Trees trees;
        Branch branch;
        m(null, null);
        m(trees = null, branch=null);
        m(branch, trees);
    }
}
