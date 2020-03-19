
enum Apple1{
    whitehat, Redhat, Ethical
}

public class values_valueof {
    public static void main(String args[])
    {
        Apple1 ap;
        // Use of values
        Apple1 allapples[]=Apple1.values(); // values() returns array that contains a list pf enumeration constants.
        for(Apple1 a:allapples)    // Or could have written for(Apple1 a:Apple1.values()) and there was no need to write above statement separately.
        {
            System.out.print(a+" ");   //Printing the array allapples
        }
        System.out.println();


        // Use of valueof
        ap=Apple1.valueOf("Redhat");
        System.out.println("ap has "+ap);
    }
}
