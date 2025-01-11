//program to find factorial
import java.util.Scanner;
class factorial
{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int a=sc.nextInt();
        int product=1;
        int b=1;
        for(int i=1;i<=a;i++)
        {
            product*=b;
            b++;
        }
        System.out.println("the product is"+product);
    }
}