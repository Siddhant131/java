import java.util.Scanner;
class fibbonacci
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter no of terms");
            int a=sc.nextInt();
            int x=0;
            int y=1;
            System.out.println(x);
            System.out.println(y);
            for(int i=1;i<=(a-2);i++)
            {
                int sum=x+y;
                System.out.println(sum);
                x=y;
                y=sum;
                
            }
        }
    }
}
