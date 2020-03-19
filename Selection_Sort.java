import java.io.*;
public class Selection_Sort {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of array");
        int s=Integer.parseInt(br.readLine());
        int arr[]=new int[s];
        System.out.print("Enter values of array");
        String line=br.readLine();
        String[] strs=line.trim().split("\\s+");
        for(int i=0;i<s;i++)
        {
            arr[i]=Integer.parseInt(strs[i]);
        }

        //This approach uses the largest element approach which is in deep dive java course video tutorial.
         for(int x=arr.length-1;x>0;x--)
         {
             int largest=0;
             for(int j=1;j<=x;j++)
             {
                 if(arr[j]>arr[largest])
                 {
                     largest=j;
                 }
             }
             int temp=arr[x];
             arr[x]=arr[largest];
             arr[largest]=temp;
         }

        System.out.println("Sorted array is "+" ");
        for(int x=0;x<arr.length;x++)
        {

            System.out.print(arr[x]+" ");
        }
    }

}
