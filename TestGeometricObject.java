/*Name: Grisha vekariya
Id: 21ce153
Aim: Create an abstract class GeometricObject as the superclass 
for Circle and Rectangle. GeometricObject models common features 
of geometric objects. Both Circle and Rectangle contain the 
getArea() and getPerimeter() methods for computing the area and 
perimeter of a circle and a rectangle. Since you can compute 
areas and perimeters for all geometric objects, so define the 
getArea() and getPerimeter() methods in the GeometricObject 
class. Give implementation in the specific type of geometric 
object. Create TestGeometricObject class to display area and
perimeter of Rectangle and Triangle, compare area of both and 
display results.Design of all classes are given in the following 
UML diagram*/

import java.util.Scanner;
abstract class GeometricObject {
 abstract double getArea();
 abstract double getPerimeter();
}
class Circle extends GeometricObject {
  double radius;
 double Area, Perimeter;
 Circle() {
 radius = 0;
 Area = 0;
 Perimeter = 0;
}
Circle(double r) {
radius = r;
}
public double getArea() {
Area = (3.14) * radius * radius;
return Area;
}
public double getPerimeter() {
Perimeter = (2 * 3.14 * radius);
return Perimeter;
}
}

class Rectangle extends GeometricObject {
    double height, width, Area, Perimeter;
    Rectangle() {
    Area = 0;
    Perimeter = 0;
    height = 0;
    width = 0;
    }
    Rectangle(double w, double h) {
    width = w;
    height = h;
    }
    double getArea() {
    Area = width * height;
    return Area;
    }
    double getPerimeter() {
    Perimeter = 2 * (height + width);
    return Perimeter;
    }
   }
   public class TestGeometricObject {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double radius, width, heigth;
    System.out.println("Enter Radius of the Circle: ");
    radius = sc.nextDouble();
    Circle c = new Circle(radius);
    System.out.println("The Area of the Circle is: " + c.getArea());
    System.out.println("The Perimeter of the Circle is: " + c.getPerimeter());
    System.out.println("Enter Width: ");
    width = sc.nextDouble();
    System.out.println("Enter Height: ");
    heigth = sc.nextDouble();
    Rectangle r = new Rectangle(width , heigth);
    System.out.println("The Area of the Rectangle: " + r.getArea());
 System.out.println("The Perimeter of the Rectangle: " + r.getPerimeter());
 }
}

