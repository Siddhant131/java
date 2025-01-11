import java.util.Scanner;
class box
{
    double width, height, length;
    void input()
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("enter width, height and length");
        width=sc.nextDouble();
        height=sc.nextDouble();
        length=sc.nextDouble();
    }
    void volume()
    {
        double vol;
        vol=width*height*length;
        System.out.println(vol);
    }
    public static void main(String args[])
    {
        box b=new box();
        b.input();
        b.volume();
    }
}