//program to find gross salary
import java.util.Scanner;
class salary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter basic salary");
        int b=sc.nextInt();
        double da=(40/100d*b);
        double hra=(20/100d*b);
        double gs=b+da+hra;
        System.out.println("the gross salary is "+gs);
        sc.close();
    }
}
