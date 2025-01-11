import java.util.Scanner;
class conversion
{
    public static void main(String args[])
    {
        double c=0.0;
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
     System.out.println("enter temperature in farenheit");

     int f=sc.nextInt();
     c=(f-32)*5.0/9;
     System.out.println("the temperature in celsius is "+c);
    }
}
