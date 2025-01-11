import java.util.Scanner;
class emrip
{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int a=sc.nextInt();
        for(int i=2;i<=a;i++)
        {
            if(a%i!=0)
            {
                int rev=0;
                while(a>0)
                {
                    int d=a%10;
                    rev=rev*10+d;
                    a/=10;
                }
                if(rev%i!=0){
                System.out.println("it is an emrip no");
            }
            else
            {
                System.out.println("it is not a emrip no");
                break;
            }
        }
        else
        {
            System.out.println("it is not a emrip no");
            break;
        }
    }
}
}
                
                