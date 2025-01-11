import java.util.Scanner;
class salary1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
         System.out.println("enter 1 for logarithm,2 for sqrt,3 for exponents");
         int b=sc.nextInt();
         if(b==1)
         {
        double c=Math.log(a);
         System.out.println(c);
            }
            if(b==2)
            {
                double c=Math.sqrt(a);
                 System.out.println(c);
                }
                if(b==3)
                {
                     System.out.println("enter the power");
                     int d=sc.nextInt();
                double c=Math.pow(a,d);
                 System.out.println(c);
                }
                sc.close();
            }
        }



