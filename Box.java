/*
 * each object has its own copy of non static variable 
 *    non-static variables are initialized automaticalddddddddd
 * all objects of a class share static variables
 */

class Box
{
    int x;//non static variable
    int y;//non static variable
    int z;//non static variable
    
    void setValues()
   {
       x=12;
       y=24;
       z=z+x+y;
    }
}
 