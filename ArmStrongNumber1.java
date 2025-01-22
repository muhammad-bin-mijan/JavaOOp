import java.util.Scanner;


public class ArmStrongNumber1
{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number: ");
       int N=sc.nextInt();
       
       int rem=0;
       int sum=0;
       int count=0;
       int n=N;
       while(n>0)
       {
          n=n/10;
          count++;

        
       }
       n=N;
       
       while(n>0)
       {
         
         rem=n%10;
         sum=(int)(sum+Math.pow(rem,count));
         n=n/10;
      }

      
      if(N==sum)
      {
         System.out.println("The number "+" is an Armstrong number");
      }
      else
     {
       System.out.println("Not armstrong number");
     }

     
    }
}