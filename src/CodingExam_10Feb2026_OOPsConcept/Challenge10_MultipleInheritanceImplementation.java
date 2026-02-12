package CodingExam_10Feb2026_OOPsConcept;
interface Swimmable {
    void swim();
}
interface Flyable {
    void fly();
}
class Duck implements Swimmable,Flyable {
    public void swim() {
        System.out.println("Duck swims");
    }
    public void fly() {
        System.out.println("Duck cannot fly");
    }
}
public class Challenge10_MultipleInheritanceImplementation {
    public static void main(String[] main) {
        Duck d=new Duck();
        d.swim();
        d.fly();
    }
}