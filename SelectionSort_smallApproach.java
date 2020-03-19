import java.io.*;
public class SelectionSort_smallApproach {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of array");
        int s=Integer.parseInt(br.readLine());
        int arr[]=new int[s];
        System.out.print("Enter values of array");
        String abc=br.readLine();
        String[] src=abc.trim().split("\\s+");
        for(int i=0;i<s;i++)
        {
            arr[i]=Integer.parseInt(src[i]);
        }

        //This approach uses small element approach as defined in major textbooks

        for(int j=0;j<arr.length-1;j++)
        {
        int smallest=j;
          for(int k=j+1;k<arr.length;k++)
          {
              if(arr[k]<arr[smallest])
              {
                  smallest=k;
              }
          }
          int temp=arr[j];
          arr[j]=arr[smallest];
          arr[smallest]=temp;

}
        System.out.println("Sorted array is "+" ");
        for(int x=0;x<arr.length;x++)
        {

            System.out.print(arr[x]+" ");
        }
    }

}

