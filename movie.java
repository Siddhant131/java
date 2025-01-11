//program to rate a movie
import java.util.Scanner;
class movie
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rating");
        double r=sc.nextDouble();
        if(r>=0.0 && r<=2.0)
        System.out.println("flop");
        
        if(r>=2.1 && r<=3.4)
        System.out.println("semi hit");
        if(r>=3.5 && r<=4.5)
        System.out.println("hit");
        if(r>=4.6 && r<=5.0)
        System.out.println("super hit");
        sc.close();
    }
}
