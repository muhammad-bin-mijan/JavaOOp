public class findMinimum
{
  public static int findMinimum(int [] arr)
  {
    int min = arr[0];
    for(int i = 1 ; i< arr.length;i++)
    {
      if(arr[i]<min)
      {
        min = arr[i];
      }
    }
    return min;
  }
  
  public static void main(String[] args)
  {
    int [] arr = {10,2,1,4,7,8};
    int min = findMinimum(arr);
    
    System.out.println("Minimum value is :"+min);
  }
}