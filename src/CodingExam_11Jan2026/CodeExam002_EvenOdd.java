package CodingExam_11Jan2026;
import java.util.Scanner;

public class CodeExam002_EvenOdd {
    public static void main(String[] args) {
        /*2. WAP to check if entered number is even or odd using arithematic operators*/
        System.out.println("Enter integer to check if even or odd");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.printf("Entered number %d is even", num);
        } else {
            System.out.printf("Entered number %d is odd%n", num);
        }
    }
}
