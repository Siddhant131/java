//program to make a calculator
import java.util.Scanner;
class calculator
{
public static void main(String args[])
{
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int a=sc.nextInt();
System.out.println("do you want to enter another number? y/n");
String yn=sc.next();
if(yn.equals("y"))
{
System.out.println("enter another number");
int c=sc.nextInt();
System.out.println("enter 1 for addition,2 for subtraction,3 for multiplication,4 for division,5 for mod ,6 for average");
int z=sc.nextInt();
if(z==1)
{
int h=c+a;
System.out.println("the sum is "+h);
}
if(z==2)
{
int h=a-c;
System.out.println("the difference is "+h);
}
if(z==3)
{
int h=c*a;
System.out.println("the product is "+h);
}
if(z==4)
{
int h=a/c;
System.out.println("the quotient is "+h);
}
if(z==5)
{
int h=a%c;
System.out.println("the remainder is "+h);
} 
if(z==6)
{
double h=(c+a)/2;
System.out.println("the average is "+h);
}  
if (yn.equals("n")) 
System.out.println("chal na");   
}
}
}



