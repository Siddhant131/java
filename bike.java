import java.util.Scanner;
class bike
{
    int b;
    int p;
    String name;
    int d;
    int c;
    void input()
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("enter bike no");
        b=sc.nextInt();
        System.out.println("enter phone no");
        p=sc.nextInt();
        System.out.println("enter name");
        name=sc.next();
        System.out.println("enter no of days");
        d=sc.nextInt();
    }
    void computer()
    {
        if(d<=5)
        {
            c=d*500;
        }
        if(d>5 && d<=10)
        {
            c=5*500+((d-5)*400);
        }
        if(d>10)
        {
            c=4500+((d-10)*200);
        }
    }
    void display()
    {
        System.out.println("bike no \t phone no \t name \t no of days \t charge");

        System.out.println(b+"\t"+"\t"+p+"\t"+"\t"+name+"\t"+"\t"+d+"\t"+c);
    }
    public static void main(String args[])
    {
        bike com=new bike();
        com.input();
        com.computer();
        com.display();
    }
}
            
        