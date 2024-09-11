import java.io.*;
import java.util.*;
interface shape{
    float a = 10, b = 20;
    void area();}
class Rectangle implements shape{
    public void area(){
        float ar = a*b;
        System.out.println("Area of rectangle = " + ar);
    }
}
class Triangle implements shape{
    public void area(){
        float ar = 0.5f*a*b;
        System.out.println("Area of Triangle = " + ar);
    } 
}
class Circle implements shape{
    public void area(){
        float ar = 3.14f*a*a;
        System.out.println("Area of Circle = " + ar);
    } 
}
class InterfaceEx{
    public static void main(String args[]){
        Rectangle r = new Rectangle();
        r.area();
        Triangle t = new Triangle();
        t.area();
        Circle c = new Circle();
        c.area();
    }
}