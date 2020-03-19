public class BinSearch {

    public static int binS(int[] arr, int low, int high, int key) {
        if (String.valueOf(key) != null) {

            if (low > high) {
                return -1;
            }
            int mid = low + (high - low) / 2;

            if (key > arr[mid]) {
                return binS(arr, mid + 1, high, key);
            }

            if (key == arr[mid]) {
                return mid;
            }

            if (key < arr[mid]) {
                return binS(arr, low, mid - 1, key);
            }

        } else {
            return -1;
        }

        return -1;

    }

    public static void main(String args[])
    {
        int input[]={1,3,3,5,6};
        int m= binS(input,1,6,6);

        if(m!=-1)
            System.out.println("Element found at"+" "+m);
        else
            System.out.println("Element Not Found");
    }

}