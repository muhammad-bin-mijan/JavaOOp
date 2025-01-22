public class ArrayUtil
{
    public  static void printArray(int [] arr)
    {
        int n = arr.length;
        for(int i =0 ;i < n ;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args)
    {
        int [] arr = {1,2,3,4,12};
        printArray(arr);
        // enhanced for loop
//        for(int i : arr)
//        {
//            System.out.println(i);
//        }




    }

}
