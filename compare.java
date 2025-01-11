//program to find the greatest number
import java.util.Scanner;
class compare
{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a >b && a>c)
        {
            System.out.println("first number is greatest");
        }
        
         if(b>c)
        {
            System.out.println("second number is greatest");
        }
        
        if(c>b)
        {
            System.out.println("third number is greatest");
        }
        
    }
}
