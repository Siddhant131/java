//class to print series
import java.util.Scanner;
class s3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of iterations");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
        