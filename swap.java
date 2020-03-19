public class swap {
    public static void main(String args[])
    {
        int a=5;
        int b=6;

        System.out.println("initial value of a:"+a);
        System.out.println("initial value of b:"+b);

        //Swap without using third variable

        a^=b;
        b^=a;
        a^=b;

        System.out.println("After swapping:-");
        System.out.println("value of a:"+a);
        System.out.print("value of b:"+b);


    }
}
