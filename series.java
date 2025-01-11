//program to print sum of series
import java.util.Scanner;
class series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of terms");
        int a=sc.nextInt();
        int sum=1;
        double b=4.0;
        
        for(int i=0;i<=a;i++)
        {
            double c=sum/b;
            
            
            System.out.println(c);
            b+=4;
        }
        sc.close();
    }
}