// Here we see how interface works

interface erp             // Interfaces are syntactically similar to classes but they lack instance variables
{                           // Any number of classes can implement interface. Also one class can implement any number of interfaces.
    public void show();       //Declare a function just as we did in abstract class and then implement or define at later stage

    // instance variable like example int i cannot be inside interface.
    // but varibles that contains constant values can be present inside interface.

    int i=8; // Valid as it has a constant value.l
}



class sample implements erp{

    public void show()
    {
        System.out.println("this is Show function from class sample");
        System.out.println("We define/implement show() here and declare it in interface same as we did in abstract class");
    }

    public static void refer()
    {

        System.out.println("this is refer function from class sample");
        System.out.print("This method is defined and implemented only in sample class but it execute normally");


        // this function will be executed normally with sample class object.
    }
}

class num implements erp{

    public void show()
    {
        System.out.println("this is Show function from class num");
        System.out.println("This is the difference between Abstract clas and Interface."+" ");
        System.out.print("One Abstract class can be extended by only one other class but one interface can be implemented by many classes");

    }

}

public class Interface {
    public static void main(String args[])
    {
        sample obj = new sample();
        obj.show();
        num object =new num();
        object.show();

        // Till above all works fine but now

        // if we want to restrict access such that function which is defined inside interface and only the defined one should execute and not those functions which are not defined inside interface (example refer function should not execute)

        // then we do the following


        // For abstract class and interface we dont have objects as methods in them are not completely definded, just declared
        // therefore we obtain only refrence of them (Abstract class or interface)

        // syntax for refrence creation :- interface_name  any_var;

        erp ob ;      //ob we have taken as any var

        // now we provide refral

        ob=new sample();  // sample class is provided to test whether refer() executes or not but it will not execute as it is not defined inside interface

        ob.show();   // this calls the show function

        // if you write ob.refer() then its not executable as it is not defined inside interface

        obj.refer();  //works fine as it uses sample class object and not  interface refrence

    }
}
