import java.util.Scanner;
class armstrong
{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int a=sc.nextInt();
        int sum ,temp;
        temp=a;
        sum=0;
        while(a>0)
        {
            int d=a%10;
            sum+=d*d*d;
            a/=10;
        }
        if(temp==sum)
        {
            System.out.println("it is armstrong");
        }
        else
        {
            System.out.println("it is not armstrong");
        }
    }
}
        
    