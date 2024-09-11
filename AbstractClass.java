import java.io.*;
import java.util.*;
abstract class shape{
    float a,b;
    abstract void area() throws Exception;
}
class Rectangle extends shape{
    void area() throws Exception{
        DataInputStream d = new DataInputStream(System.in);
        System.out.print("Enter the Length of Rectangle: ");
        a = Float.parseFloat(d.readLine());
        System.out.print("Enter the Breadth of Rectangle: ");
        b = Float.parseFloat(d.readLine());
        float ar = a*b;
        System.out.println("Area of Rectangle = " + ar);
    }
}
class Triangle extends shape{
    void area() throws Exception{
        DataInputStream d = new DataInputStream(System.in);
        System.out.print("Enter the Breadth of Triangle: ");
        a= Float.parseFloat(d.readLine());
        float ar = 0.5f*a*b;
        System.out.println("Area of Triangle = " + ar);
    }
}
class Circle extends shape{
    void area() throws Exception{
        DataInputStream d = new DataInputStream(System.in);
        System.out.print("Enter the Radius of Circle: ");
        a= Float.parseFloat(d.readLine());
        float ar = 3.14f*a*a;
        System.out.println("Area of Circle = " + ar);
    }
}
class AbstractClass{
    public static void main(String[] args) throws Exception{
        DataInputStream d = new DataInputStream(System.in);
        System.out.print("\nArea of Different Shapes:\n1. Rectangle\n2. Triangle\n3. Circle\n Enter Your Choice: ");
        int ch = Integer.parseInt(d.readLine());
        switch(ch){
            case 1:
                Rectangle r = new Rectangle();
                r.area();
                break;
            case 2:
                Triangle t = new Triangle();
                t.area();
                break;
            case 3:
                Circle c = new Circle();
                c.area();
                break;
        }
    }
}