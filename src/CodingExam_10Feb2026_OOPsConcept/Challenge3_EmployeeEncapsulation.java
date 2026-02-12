package CodingExam_10Feb2026_OOPsConcept;
class Employee {
    private int id;
    private int salary;
    private String name;

    public void setId(int i) {
        this.id=i;
    }
    public int getId() {
        return id;
    }
    public void setSalary(int sal) {
        this.salary=sal;
    }
    public int getSalary() {
        return salary;
    }
    public void setName(String na) {
        this.name=na;
    }
    public String getName() {
        return name;
    }
}
public class Challenge3_EmployeeEncapsulation {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setId(10);
        emp.setSalary(10000);
        emp.setName("Happy");
        System.out.println("ID is "+emp.getId());
        System.out.println("Salary is "+emp.getSalary());
        System.out.println("Name is "+emp.getName());
    }
}
