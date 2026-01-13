package CodingExam_11Jan2026;
import java.util.Scanner;

public class CodeExam001_ArithematicOperation {
            public static void main(String[] args) {
            /*1. WAP that takes two integer numbers and prints their sum, difference,
            multiplication, division, and remainder.*/
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 1st number");
            int a=sc.nextInt();
            System.out.println("Enter 2nd number");
            int b=sc.nextInt();
            System.out.println("Addition "+(a+b));
            System.out.println("Subtraction "+(a-b));
            System.out.println("Multiplication "+(a*b));
            System.out.println("Division/Quotient "+(a/b));
            System.out.println("Remainder "+(a%b));
    }
}
