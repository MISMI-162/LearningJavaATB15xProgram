package CodingExam_11Jan2026;
import java.util.Scanner;

public class CodeExam005_ZeroNegativePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*5. WAP to check whether a given number is positive, negative, or zero using the ternary operator.*/
        System.out.println("Enter a number to check if it is positive or zero or negative");
        int n = sc.nextInt();
        String value = (n == 0) ? "Zero" : ((n > 0) ? "Positive" : "Negative");
        System.out.println(value);
    }
}
