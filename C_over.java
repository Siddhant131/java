class C_over
{
    String name;
    long mobno;
    double square;
    C_over(String name,long mobno)
    {
        this.name=name;
        this.mobno=mobno;
    }
    C_over(int square)
    {
        this.square=square;
    }
    void sq()
    {
        square =Math.pow(square,2);
        
    }
    void display()
    {
        System.out.println(name+"\n"+mobno+"\n");
    }
    void d1()
    {
        System.out.println(square);
        
    }
   
    public static void main(String args[])
    {
        C_over obj=new C_over("yo",7656729);
        obj.display();
        C_over obj1=new C_over(2);
        obj1.sq();
        obj1.d1();
        
    }
}
        
    