//program to find sum of natural no
import java.util.Scanner;
class natural
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of terms");
    int a=sc.nextInt();
    int sum=0;
    int b=1;
    for(int i=1;i<=a;i++)
    {
        sum+=b;
        b++;
    }
    System.out.println(sum);
    sc.close();
}
}
    