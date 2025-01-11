//program to use switch case
import java.util.Scanner;
class Switch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
         System.out.println("enter 1 for log,2 for sqrt,3 for power");
         int b=sc.nextInt();
         switch(b)
         {
             case 1:
             double c=Math.log(a);
              System.out.println("the log is "+c);
             break;
             case 2:
               c=Math.sqrt(a);
              System.out.println("the square root is "+c);
             break;
             case 3:
             System.out.println("enter another number");
             int d=sc.nextInt();
              c=Math.pow(a,d);
              System.out.println("the power is "+c);
             break;
             default:
             System.out.println("chapatu bum hai kya");
             break;
            }
            sc.close();
        }
    }


