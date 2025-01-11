//program to separate digits and sum them
import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int a=sc.nextInt();
        int sum=0;
        while(a>0)
        {
            int d=a%10;
            sum+=d;
            a/=10;
            
           
        } System.out.println(sum);
        sc.close();
    }
}
            
            