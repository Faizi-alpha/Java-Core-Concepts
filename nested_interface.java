// What nested interfaces are ? or what member interfaces are ?

class A{

    public interface NestedIf     // Interface declared as member of a class or another interface . This is Nested Interface
    {
        boolean isNotNegetive(int x);
    }
}



class B implements A.NestedIf       // B implements the nested interface
{
    public boolean isNotNegetive(int x){        // here declaring method public is important
        return x<0 ? false:true;
    }
}

public class nested_interface {
    public static void main(String args[])
    {
        A.NestedIf nif=new B();  // use of nested interface refrence

        if(nif.isNotNegetive(10))
            System.out.print("10 is not negetive");
        if(nif.isNotNegetive(-10))
            System.out.print("this will not be displayed");
    }
}
