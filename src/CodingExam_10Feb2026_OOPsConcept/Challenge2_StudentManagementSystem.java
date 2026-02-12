package CodingExam_10Feb2026_OOPsConcept;
class Student {
    Student(String n,int r,char sec) {
        System.out.println(n+" "+r+" "+sec);
    }
}

public class Challenge2_StudentManagementSystem {
    public static void main(String[] args) {
        Student s=new Student("Mismi",15,'A');
    }
}