// throw keyword demonstration

public class throw_e {

    static void demo()
    {
        try{   // new is used to construct an instance of NullPointerException
            throw new NullPointerException("demo");  // throwing our own NullPointeException named "demo".
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside demo()");
            throw e; // rethrow the exception
        }
    }

  public static void main(String args[])
  {
      try{
          demo();
      }catch(NullPointerException e)
      {
          System.out.print("Recaught:"+e);
      }
  }

}
