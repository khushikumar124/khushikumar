class area
{
    void prnarea(int l, int b)
    {
        System.out.println("The area of the rectangle is" + l*b);
    }
    void prnarea(double pi, double r)
    {
        System.out.println("The area of the circle is" + pi*r*r);
    }
    void prnarea(float side1, float side2)
    {
        System.out.println("The area of the square is" + side1*side2);
    }
    public static void main()
    {
        area obj=new area();
        obj.prnarea(3,4);
        obj.prnarea(3.14,4.9);
        obj.prnarea(2.0f, 3.0f);
    }
}
        
    