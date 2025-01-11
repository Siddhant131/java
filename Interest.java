//program to calculate simple interest
import java.util.Scanner;
class Interest
{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner (System.in);
        System.out.println("enter principal");
        int p=sc.nextInt();
        System.out.println("enter time");
        int t=sc.nextInt();
        System.out.println("enter rate");
        int r=sc.nextInt();
        double si=p*r*t/100;
        System.out.println("the simple interest is  "+si);
    }
}
        


