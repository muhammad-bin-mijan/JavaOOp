import java.util.Arrays;
public class MoveAllZeros
{
    public static void moveZeros(int [] arr,int n)
    {
        int j = 0;// to point to zero element

        for(int i =0 ; i<n ;i++)
        {
            if(arr[i]!=0 &&  arr[j]==0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp ;

            }

            if(arr[j]!=0)
            {
                j++;
            }
        }

    }

    public static void main(String[] args)
    {
        int [] arr = {0,1,0,4,12};
        moveZeros(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}