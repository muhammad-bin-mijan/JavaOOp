/*
     2. You are given an integer array with duplicate values.
      Write a Java program to update the array by replacing the duplicate values of the array with zero. 
      Then print the updated array. [Your code should work for any given integer array] */

public class checkDuplicate
{
    public static void main(String[] args) 
    {
        ;

        int [] arr = {1,2,3,5,3,2,4};


        /*Before removing duplicates:
         1 2 3 5 3 2 4
         */
        System.out.println("Before removing duplicates:");
        for(int a : arr)
        {
            System.out.print(a+" ");
        }




       

        updateArray(arr);
        /*After replacing duplicates with 0:
          1 2 3 5 0 0 4                      */
        System.out.println();
        System.out.println("After replacing duplicates with 0:");
        for(int n : arr)
        {
            System.out.print(n+" ");
        }
    }
    
    public static void updateArray(int [] arr)
    {
        
        int l = arr.length;
        for(int i = 0; i<l; i++)
        {
            for(int j = i+1; j<l ;j++)
            {
                if( arr[i] != 0 && arr[i]==arr[j])
                {
                    arr[j]=0;
                    break;
                }
            }
        }
    }

}
