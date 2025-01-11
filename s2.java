//program to input operator
import java.util.Scanner;
class s2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
         System.out.println("enter the second number");
         int b=sc.nextInt();
          System.out.println("enter 1 for addition,2 for subtraction,3 for multiplication,4 for division");
         int c=sc.nextInt();
          switch(c)
          {
          case 1:
          int d=a+b;
           System.out.println(d);
           break;
           case 2:
           int e=a-b;
            System.out.println(e);
            break;
            case 3:
            int f=a*b;
             System.out.println(f);
             break;
             case 4:
             double g=a/b;
              System.out.println(g);
              break;
              default:
               System.out.println("invalid choice");
               break;
            }
            sc.close();
        }
    }
