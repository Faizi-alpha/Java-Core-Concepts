import java.util.Random;

public class try_catch {

    public static void main(String args[])
    {
        try {                 //try and Catch block in exception handling
            int a = 5;
            int b = 0;
            int res = a / b;    // When dividing by 0 , we get java.lang.ArithmeticException
            System.out.print(res);   //This will not be printed as the above statement throws an exception

              //Once an exception is thrown from try block then exception is treated in catch block and control never returns to try block

        }
        catch (ArithmeticException e) {           //Here we treat the exception
            System.out.println("Division by zero");

            //To display the description of an exception
            System.out.println("Exception:"+e);
        }
        System.out.print("After Catch execution ");
    }



}
