package CodingExam_11Jan2026;
import java.util.Scanner;

public class CodeExam011_ReversingNum {
    public static void main(String[] args) {
        /*WAP to reverse a given number using a do-while loop.*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number which has to be reversed");
        int num=sc.nextInt();
        int reversed = 0;
        System.out.println("Original Number: " + num);
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num= num/10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
