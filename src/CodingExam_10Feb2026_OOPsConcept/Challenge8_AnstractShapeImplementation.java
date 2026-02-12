package CodingExam_10Feb2026_OOPsConcept;
abstract class Shape {
    abstract double getArea();
}
class Rectangle1 extends Shape {
    double length, breadth;
    Rectangle1(double l, double b) {
        this.length=l;
        this.breadth=b;
    }
    @Override
    double getArea() {
        return length*breadth;
    }
}
class Circle1 extends Shape {
    double radius;
    Circle1(double r) {
        this.radius=r;
    }
    @Override
    double getArea() {
        return 3.14*radius*radius;
    }
}
public class Challenge8_AnstractShapeImplementation {
    public static void main(String[] main) {
        Rectangle1 r=new Rectangle1(3,5);
        System.out.println("Rectangle area is "+r.getArea());
        Circle1 c=new Circle1(5);
        System.out.println("Circle area is "+c.getArea());
    }
}
