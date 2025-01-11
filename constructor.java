class constructor
{
    double h;
    double l;
    double b;
    double a;
    constructor(double height,double length, double breadth)
    {
        b=breadth;
        height=h;
        length=l;
    }
    constructor(double d)
    {
        b=h=l=d;
    }
    double volume()
    {
        a = b*h*l;
        return a;
    }
    public static void main(String args[])
    {
        constructor c1=new constructor(1.0,2.0,3.0);
        double r=c1.volume();
        System.out.println(r);
        constructor c2=new constructor(5.0);
        r=c2.volume();
        System.out.println(r);
    }
}
        
        
        
    
    
    
    