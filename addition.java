class addition
{
    void prnadd(int a, int  b)
    {
        System.out.println("The addition is" + a+b);
    }
    void prnadd(char c, char d)
    {
        System.out.println("c and d are characters thus no addition");
    }
    void prnadd(double A, double B)
    {
        System.out.println("The addition is" + A+B);
    }
    void prnadd(float Num1, float Num2)
    {
        System.out.println("The additon is" + Num1+Num2);
    }
    public static void main()
    {
        addition obj=new addition();
        obj.prnadd(2,3);
        obj.prnadd('X','Y');
        obj.prnadd(2.5,1.5);
        obj.prnadd(10.5f,1.5f);
    }
}
        
   