//program to check whether a no is ugly or not
import java.util.Scanner;
class ugly
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int a=sc.nextInt();
        if(a%2==0)
        {
             System.out.println("it is ugly");
            }
            else if(a%3==0)
            {
                 System.out.println("it is ugly");
                }
               else if(a%5==0)
                {
                    System.out.println("it is ugly");
                }
                
        
        else
        {
        System.out.println("it is not ugly");
    }
    sc.close();
    }
}
        