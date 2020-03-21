public class multiple_catch {


    //A subclass must come before its superclass in a series of catch statements.
    //If not, Compile Time error will be generated.

    public static void main(String args[])
    {
        try{
            int a=5;
            int ar=args.length;  //ar=0
            int res=a/ar;
        }
        //Remember,Exception is a superclass and Arithmetic Exception is a subclass of it.
        catch(Exception e){
            System.out.print("Generic Exception Catch");
    }
        /*this below exception is never reached because ArithmeticException is a subclass if Exception
          catch(ArithmeticException e)     This is invalid because the exception has already been caught above.
         {
            System.out.print("This is never reached");
         }
         To fix above code, just reverse the order of both catch blocks.
   
    */

}
