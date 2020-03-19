import java.io.*;
import java.util.Scanner;

class  GFG{




    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(;T>0;T--)
        {

            int N=s.nextInt();
            int f[]=new int[N];
            for(int j=0;j<=1;j++)
            {
                f[j]=j;
            }
            for(int i=2;i<N; i++)
            {
                f[i]= (f[i-1]+f[i-2])%1000000007;
            }
            System.out.println(f[N]);


        }
        s.close();
    }


}