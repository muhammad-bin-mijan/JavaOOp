import java.util.Scanner;
public class LeapYear
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N%400==0)
        {
            System.out.println("Leap Year!!");

        }
        else if(N%100==0)
        {
            System.out.println("Not leap year!!");
        }
        else if(N%4==0)
        {
            System.out.println("Leap Year!!");
        }
        else
        {
            System.out.println("Not leap year!!");
        }
    }
}