package CodingExam_10Feb2026_OOPsConcept;
interface Drawable {
    void draw();
}
class Circle implements Drawable {
    public void draw() {
        System.out.println("Circle drawing");
    }
}
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Rectangle drawing");
    }
}
public class Challenge9_DrawableInterfaceImplementation {
    public static void main(String[] main) {
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        c.draw();
        r.draw();
    }
}
