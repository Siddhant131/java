import java.util.Scanner;
class showroom
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter cost");
        int a=sc.nextInt();
        if(a<=10000)
        {
           double discount=a*5/100;
            double price=a-discount;
            System.out.println("the amount is"+price);
        }
        if(a>10000&&a<=20000)
        {
             double discount=a*10/100;
            double price=a-discount;
            System.out.println("the amount is"+price);
        }
        if(a>20000&&a<=35000)
        {
             double discount=a*15/100;
            double price=a-discount;
            System.out.println("the amount is"+price);
        }
        if(a>35000)
        {
             double discount=a*20/100;
            double price=a-discount;
            System.out.println("the amount is"+price);
        }
        sc.close();
     
    }
}
    
