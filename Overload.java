class Overload
{
    double aa;
    double area (double a, double b, double c)
    {
        double s = (a + b + c)/2;
        aa = Math.sqrt (s * (s - a) * (s - b) * (s - c));
        return aa;
    }
    double area (int a, int b, int height)
    {
        aa = height/2 * (a + b);
        return aa;
    }
    double area (double diagonal1, double diagonal2)
    {
        aa = (diagonal1*diagonal2)/2;
        return aa;
    }
    public static void main (String args [])
    {
        Overload B = new Overload ();
        double result1 =  B.area (2.0,3.0,4.0);
        double result2 = B.area (2,5,10);
        double result3 = B.area (5.0,7.0);
        System.out.println ("The area of the scalene triangle is " + result1);
        System.out.println ("The area of the trapezium is " + result2);
        System.out.println ("The area of the rhombus is " + result3);
    }
}

        
    