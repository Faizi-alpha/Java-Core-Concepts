// String Builder is same as String buffer . The only difference is that String Builder affects other threads and thus result in desynchronisation.
public class String_Builder {
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer(40);
        int l=sb.length();
        //System.out.println(l);
        //System.out.println(sb.capacity());

        int a=42;
        String s;
        s=sb.append("a =").append("!").toString();
        System.out.println(s);


    }

}
