/* Question 1- Write a Java program that will take N integer numbers from the user and create an array of length N. 

Print the elements of the array with their indices. 

Take another integer input from the user, resize the array by length 1, and add the new integer value to the array
. Print the resized array.*/

import java.util.Arrays;
import java.util.Scanner;
public class task01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int N = sc.nextInt();

        int [] arr = new int[N];

        int length = arr.length;
        System.out.println("Please enter the elements of the array: ");
        for( int i = 0 ; i <length ;i++ )
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Okk,Thanks..");

        for( int i = 0 ; i <length ;i++ )
        {
            System.out.println(i+" "+arr[i]);
        }

        //printing the resize array 

        int [] resizeArr = Arrays.copyOf(arr, length+1);
        System.out.println("Please enter one more element for resize array");
        resizeArr[length]= sc.nextInt();

        sc.close();

        for (int a : resizeArr )
        {
            System.out.print(a+" ");
        }
    }
    
}
