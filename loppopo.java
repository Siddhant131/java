//program to print pronic no
import java.util.Scanner;
class loppopo
{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int a=sc.nextInt();
        int n=1;
        int b=1;
        for(int i=1;i<=a;i++)
        {
            b=n*(n+1);
            if(b==a)
        {
        System.out.println("the no is pronic");
        break;
    }
   
            n++;
        }
        
     if(b !=a)
    {
        System.out.println("the no is not pronic");
    }
}
}
        