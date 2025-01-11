import java.util.Scanner;
class eleven
{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a 5 digit no");
        long n=sc.nextInt();
        long m=n, a=n;
        
        long d=0, b=0, y=0, o=0, l=0;
        while(m>0)
        {
            d=m%10;
            b+=d;
            m/=100;
        }
        while(a>0)
        {
            y=((a%100)-(a%10))/10;
            l+=y;
            a/=100;
        }
        if(b==l)
        {
            System.out.println("it is divisible");
        }
        if(b>l)
        {
            o=b-l;
            if(o%11==0)
            {
                 System.out.println("it is divisible");

                }
            }
                if(y>b)
                {
                    o=y-l;
                    if(o%11==0)
                    {
                         System.out.println("it is divisible");
                        }
                    }
                    if(o%11!=0)
                    {
                         System.out.println("it is not divisible");
                        }
                    }
                }
                    
            
            
        
            
            
    

            