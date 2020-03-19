// Java Enumerations are class types.
// Although you dont have to instantiate an enum using new.

enum Apple{
    redhat, whitehat,ethical  // no semicolon required here
}


public class enumerations {
    public static void main(String args[])
    {
        Apple ap;
        ap=Apple.ethical;
        System.out.println(ap);

        ap=Apple.redhat;
        System.out.println(ap);

        ap=Apple.whitehat;
        System.out.println(ap);

        // comparing two enums
        if(ap==Apple.ethical)   // since condition is false, therefore "Inside if" will not get printed in console.
        {
            System.out.println("Inside if");   //body
        }

        // Use of enum to control a switch statement
        switch(ap)
        {
            case redhat:
                System.out.println("Redhat from switch");
                break;
            case ethical:
                System.out.println("ethical from switch");
            case whitehat:
                System.out.println("Whitehat from switch");   // since the last and recent value of ap=Apple.whitehat, therefore this will be printed.
                break;
        }
    }

}
