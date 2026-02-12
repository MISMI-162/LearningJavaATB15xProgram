package CodingExam_10Feb2026_OOPsConcept;
class Employee1 {
    public void salary1() {
        System.out.println("Salary calculation from Employee block");
    }
}
class Manager extends Employee1 {
    int salary, bonus;
    public int salary1(int a,int b) {
        System.out.println("Salary from Manager block");
        this.salary=a;
        this.bonus=b;
        return salary+bonus;
    }
}
class Developer extends Employee1 {
    double hours,rate;
    public double salary1(double a,double b) {
        System.out.println("Salary from Developer block");
        this.hours=a;
        this.rate=b;
        return hours*rate;
    }
}
public class Challenge7_SalaryCalculation {
    public static void main(String[] main) {
        Manager man=new Manager();
        System.out.println(man.salary1(10000,20000));
        Developer dev=new Developer();
        System.out.println(dev.salary1(150,30));
    }
}
