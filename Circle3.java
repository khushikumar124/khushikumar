/* input method=interactive
 * no of functions=multiple
*/

class Circle3
{
    int rad;
    double area;
    
    void getRadius(int radius)//parameterised function
    {
        rad=radius;
    }
    void calcArea()//non-parameterised function
    {
        final double pi=3.142;
        area=pi*rad*rad;
    }
    void displayResult()
    {
        System.out.println("The area of the circle is" + area);
    }
    public static void main()
    {
        Circle3 objref;//reference variable, contains null value
        objref=new Circle3();//object creation, object pointing to circle object
        objref.getRadius(5);//actual parameters/arguments, caller
        objref.calcArea();
        objref.displayResult();
    }
}