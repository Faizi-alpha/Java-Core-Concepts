//Static Inner Classes Tutorial
// Includes object creation of Static inner or nested class

class mom {

   static int i;
   static class xyz {              //static inner class
        public void show() {
             System.out.print("Done");
        }
    }
}
public class nested{
    public static void main(String args[])
    {
        System.out.print(mom.i=7);        //The below written space print command cannot be written here like (mom.i=7+" ") !
        System.out.print(" ");
        mom.xyz obj=new mom.xyz();       //static inner class object creation
        obj.show();

    }

}