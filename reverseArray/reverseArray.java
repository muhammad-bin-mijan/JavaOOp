import java.util.Arrays;
public class reverseArray
{
  
  public static int[] reverseArray(int [] arr)
  {
    int n = arr.length;
    int start =0;
    int end = n-1;
    while(start<end)
    {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    
    return arr;
  }
  public static void main(String[] args)
  {
    int [] arr ={10,20,30,40,50};
    int [] result = reverseArray(arr);
    System.out.println(Arrays.toString(result));
    
  }
}