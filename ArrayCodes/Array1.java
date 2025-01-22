
import java.util.Arrays;

/*Notes on Array 
 Array is kind of a data structure used to store a fixed size,ordered collection of elements of same type
 Size: the size of an array is specified at the time of creation and cannot be changed later.
 Stored in Heap memory: Arrays are objects in java and are stored in the heap
  
*/
public class Array1
{
    public static void main(String[] args) 
    {
        int [] set= new int[5];//created an array with size 5
        int [] set1= {1,2,3,4,5};//initialized an array in line

        //how to accesss elements
        set[0]=12;

        set[1]=23;

        set[2]=24;//array is mutable,but cannot change size after creation 
        int arrLength=set.length;//length  instance variable of Array class 

        //print array element using a loop

        // for(int i =0 ;i<arrLength; i++)
        // {
        //     System.out.println(set[i]);
        // }

    //   System.out.println(Arrays.toString(set1));//converting the array to string

      //int [] newArr = Arrays.copyOf(set,4);

    //   for(int a : newArr)
    //   {
    //     System.out.println(a);
    //   }
      int [] newArr = Arrays.copyOfRange(set,0,3);
    //   for(int a : newArr)
    //   {
    //     System.out.println(a);
    //   }
    

    //  Arrays.fill(set,12);//fill method is void
    // for(int a : set)
    // {
    //   System.out.println(a);
    // }

    System.out.println(set==set1);//if memory location different then returns false
    System.out.println(Arrays.equals(set,set1));//checks if the contents are same
    }




}