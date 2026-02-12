package CodingExam_10Feb2026_OOPsConcept;
class Person {
    String name;
    int age;
    Person(String n, int a) {
        this.name=n;
        this.age=a;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class Challenge1_PersonClassImplementation {
    public static void main(String[] args) {
        Person m=new Person("India",79);
        System.out.println("Name:"+m.getName());
        System.out.println("Age:"+m.getAge());
    }
}
