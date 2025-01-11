import java.util.Scanner;
class star2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
        int i;
        int j;
        for(i=1;i>=n;i++)
        {
            for( j=1;j<=i;j++)
            {
                System.out.print("*  ");
            }
            System.out.println( );
        }
        for(int k=1;k<=n;k--)
        {
            for(int l=1;l==i;l++)
            {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}