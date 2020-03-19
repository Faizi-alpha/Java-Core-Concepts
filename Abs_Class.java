// Abstract Class and Abstract Method
// OOP Concept Abstraction

public class Abs_Class {

    public static void main(String args[]) {
        spec obj = new spec();           //Create object for class spec
        spec2 obj1 = new spec2();        //Create object for class spec2
        show(obj);                       //calling show function present in Abs_Class class with object of class spec
        show1(obj1);                     //calling show1 function present in Abs_Class class with object of class spec2
    }

        public static void show(Sony_Earphones abc)          //abc is taken as object name for accepting object name so that we dont get confuse with obj as object of class spec
        {
            System.out.println("For Sony Earphones :-");
           abc.bass();
           abc.loudness();
           abc.treble();
        }

        public static void show1(JBL_Earphones def)        // Similarly,here we took def as accepting object name
        {
            System.out.println("For JBL Earphones :-");
            def.bass();
            def.loudness();
            def.treble();

        }

    }

abstract class Sony_Earphones{                    //Abstract Class fro Sony Earphones

    public void bass()
    {
        System.out.println("Bass is good"+" ");
    }

    public abstract void loudness();       //If we cant define a method but just declare it then we use abstract for it . Therefore to contain abstract method we need abstract class
    public abstract void treble();
}

abstract class JBL_Earphones{                   //Abstract Class for JBL Earphones
    public void loudness()
    {
        System.out.println("Loudness is good");
    }

    public abstract void bass();
    public abstract void treble();
}

class spec extends Sony_Earphones{          // spec extends Sony_Earphones class and now here defines abstract methods declared in abstract class Sony_Earphones

    public void loudness()
    {
        System.out.println("Loudness is also good");
    }
    public void treble()
    {
        System.out.println("Treble is fine");
    }

}

class spec2 extends JBL_Earphones{            //Same here , defining abstract methods ot abstract classes

    public void bass()
    {
        System.out.println("Yeah Bass is fine");
    }

    public void treble()
    {
        System.out.print("Treble is satisfactory");
    }
}