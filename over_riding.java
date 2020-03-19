// Below Code is for Method overriding in Java.
// Method Overriding is done to support run-time polymorphism
//Polymorphism is an important OOP concept.
class samp1{

    int k=7;    //instance variable k having value 7 in class samp1
    public void show()
    {
        System.out.println("Inside samp1"+"value of k is "+k);
    }
}
class samp2 extends samp1
{
    int k=5;        // k has value 5 in class samp2
    public void show()         //Method Overridng
     {                         // Method in superclass samp1 is same as in subclass samp2 hence this is overriding of function or method
        System.out.println("Inside samp2"+"value of k is "+k);
    }
}

class samp3 extends samp2      //if we would have extended samp1 again it would have been same as samp2 extends samp1 and samp 3 extends samp2
{
    public void show()
    {
        int k=3;            // k has value 3 in class samp3
        System.out.println("Inside samp3"+"value of k is "+k);
    }
}

public class over_riding {

    static public void main(String argsp[])
    {
        samp1 obj=new samp1();   //object creation as main function is static
        obj.show();              //calling show method in samp1 class using object of samp1 i.e, obj
        samp2 obj1=new samp2();
        obj1.show();
        samp1 obj2;    // as samp1 already has one object, now we take reference of type samp1
        obj2=obj1;     // refer obj1 to obj2
        obj2.show();
        samp3 ob=new samp3();
        ob.show();

    }
}
