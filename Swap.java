//program to swap two numbers
import java.util.Scanner;
class Swap
{
    public static void main ( String args [] )
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter 1st number");
        int a=sc.nextInt();
        System.out.println("enter 2nd number");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the 1st number is "+a);
        System.out.println("the 2nd number is "+b);
        sc.close();
    }
}
