package CodingExam_10Feb2026_OOPsConcept;
class Calculator {
    int add(int a, int b) {
        return a+b;
    }
    double add(double a, double b) {
        return a+b;
    }
    int add(int a, int b, int c) {
        return a+b+c;
    }
}

public class Challenge11_CalculatorMethodOverloading  {
    public static void main(String[] main) {
        Calculator cal=new Calculator();
        System.out.println("Integer Addition "+cal.add(2,3));
        System.out.println("Double addition "+cal.add(5.0,10.0));
        System.out.println("3 integer addition "+cal.add(3,4,5));
    }
}