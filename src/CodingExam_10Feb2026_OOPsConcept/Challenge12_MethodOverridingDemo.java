package CodingExam_10Feb2026_OOPsConcept;
class Base {
    public int display(int a) {
        return a;
    }
}
class Child1 extends Base {
    @Override
    public int display(int a) {
        return a;
    }
}
class Child2 extends Base {
    @Override
    public int display(int a) {
        return a;
    }
}
public class Challenge12_MethodOverridingDemo {
    public static void main(String[] main) {
        Base v=new Base();
        System.out.println(v.display(10));
        Base car=new Child1();
        System.out.println(car.display(5));
        Base bike=new Child2();
        System.out.println(bike.display(6));
    }
}
