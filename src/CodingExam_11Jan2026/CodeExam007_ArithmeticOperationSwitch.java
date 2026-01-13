package CodingExam_11Jan2026;
import java.util.Scanner;
public class CodeExam007_ArithmeticOperationSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*7. WAP to perform addition, subtraction, multiplication, or division based on user choice using a switch statement.*/
        System.out.println("Enter first number");
        float num1 = sc.nextFloat();
        System.out.println("Enter second number");
        float num2 = sc.nextFloat();
        System.out.println("Enter an option to perform the arithematic operation where 1/ADD; 2/SUBTRACT; 3/MULTIPLY; 4/DIVISION");
        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                System.out.println("ADD: " + (num1 + num2));
                break;
            case 2:
                System.out.println("SUBTRACT: " + (num1 - num2));
                break;
            case 3:
                System.out.println("MULTIPLY: " + (num1 * num2));
                break;
            case 4:
                System.out.println("DIVISION: " + (num1 / num2));
                break;
        }
    }
}
