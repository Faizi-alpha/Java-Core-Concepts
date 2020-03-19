
enum Guava{
    M1(2), M2(10), N1(8), N3(4);  // Now used semicolon.

    private int price;  //Instance variable
    Guava(int p)      // Constructor
    {
        price=p;
    }
    int getPrice(){ return price; }
}


public class enum_constructors {
    public static void main(String args[])
    {
        Guava g;  // Calling of the Constructor assigns values 2,10,8,4 to price.
        System.out.println("M2 costs "+Guava.M2.getPrice()+" cents.\n");
    }
}
