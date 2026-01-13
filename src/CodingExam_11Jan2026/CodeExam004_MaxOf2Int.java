package CodingExam_11Jan2026;
import java.util.Scanner;
public class CodeExam004_MaxOf2Int {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*4. WAP to find the maximum of two numbers using the ternary operator.*/
        System.out.println("Enter 1st number");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2=sc.nextInt();
        int greater=(num1>num2)?num1:num2;
        System.out.printf("%d is greater%n", greater);
    }
}
