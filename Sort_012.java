import java.util.Scanner;
public class Sort_012 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();

        int arr[] = new int[N];
        for(int i=0;i<=N-1;i++)
        {
            arr[i]=s.nextInt();
        }
        int NoZero=0;
        int NoOne=0;
        int NoTwo=0;
        for(int i=0;i<=N-1;i++)
        {
            if(arr[i]==0)
            {
                NoZero+=1;
            }
            if(arr[i]==1)
            {
                NoOne+=1;
            }
            if(arr[i]==2)
            {
                NoTwo+=1;
            }
        }

        if(NoZero>0) {
            for (int i = 0; i < NoZero ; i++) {

                arr[i]=0;

            }
        }
        if(NoOne>0)
        {
            for(int i=NoZero;i<(NoZero+NoOne);i++)
            {
                arr[i]=1;
            }

        }
        if(NoTwo>0)
        {
            for(int i=(NoZero+NoOne);i<N;i++)
            {
                arr[i]=2;
            }
        }
        System.out.print("Sorted Array is ");
      for(int j=0;j<=N-1;j++)
      {
          System.out.print(arr[j]+" ");
      }
    }
}
