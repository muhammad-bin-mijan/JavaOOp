
import java.util.Arrays;


/*Given an int array ,return an array with even int removed */
// Given Array {3,2,4,7,10,6,5}
public class RemoveEvenIntArray
{

    public static int [] removeEven(int[] arr)
    {
        int N = arr.length;
        int oddCount=0;

        for(int i =0 ; i<N ; i++)
        {
            if(arr[i]%2!=0)
            {
                oddCount++;
            }
        }

        int [] resultArray = new int [oddCount];

        int idx =0 ;

        for(int i =0 ;i< N ;i++)
        {
            if(arr[i]%2!=0)
            {
                resultArray[idx] = arr[i];
                idx++;
            }
        }

        return resultArray;
    }
    public static void main(String[] args) 
    {
        int [] arr = {3,2,4,7,10,6,5};

        System.out.println(Arrays.toString(removeEven(arr)));
    }
}